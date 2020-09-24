(ns personal-site.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:use-macros [cljs.core.async.macros :only [go]])
  (:import goog.History)
  (:require
   [reagent.core :as reagent]
   [cljs.core.async :refer [<! timeout]]
   [secretary.core :as secretary]
   [goog.events :as gevents]
   [goog.history.EventType :as EventType]
   [re-frame.core :as re-frame]
   [personal-site.events :as events]))

(defn hook-browser-navigation! []
  (doto (History.)
    (gevents/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")
  ;; --------------------
  ;; define routes here
  (defroute "/" []
    (re-frame/dispatch [::events/set-active-panel :home-panel]))

  (defroute "/projects" []
    (re-frame/dispatch [::events/set-active-panel :home-panel])
    (go
      (<! (timeout 25))
      (-> js/document
        (.getElementById "projects")
        (.scrollIntoView true))))
  
  (defroute "/portfolio" []
    (re-frame/dispatch [::events/set-active-panel :home-panel])
    (go
      (<! (timeout 25))
      (-> js/document
        (.getElementById "portfolio")
        (.scrollIntoView true))))  

  (defroute "/bma_website" []
    (re-frame/dispatch [::events/set-active-panel :bma-website]))

  (defroute "/songlist" []
    (re-frame/dispatch [::events/set-active-panel :song-list]))

  (defroute "/redacted" []
    (re-frame/dispatch [::events/set-active-panel :redacted]))

  (defroute "/irc_bot" []
    (re-frame/dispatch [::events/set-active-panel :irc-bot]))

  (defroute "/lumiaero" []
    (re-frame/dispatch [::events/set-active-panel :lumiaero]))

  (defroute "/stream_tools" []
  (re-frame/dispatch [::events/set-active-panel :stream-tools]))

  (defroute "/emote_combo_display" []
  (re-frame/dispatch [::events/set-active-panel :emote-combo-display]))

  ;; --------------------
  (hook-browser-navigation!))
