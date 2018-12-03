(ns personal-site.routes
  (:require-macros [secretary.core :refer [defroute]])
  (:import goog.History)
  (:require
   [secretary.core :as secretary]
   [goog.events :as gevents]
   [goog.history.EventType :as EventType]
   [re-frame.core :as re-frame]
   [personal-site.events :as events]
   ))

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

  (defroute "/resume" []
    (re-frame/dispatch [::events/set-active-panel :resume-panel]))

  (defroute "/portfolio" []
    (re-frame/dispatch [::events/set-active-panel :portfolio-panel]))

  (defroute "/contact" []
    (re-frame/dispatch [::events/set-active-panel :contact-panel]))

  (defroute "/blog" []
    (re-frame/dispatch [::events/set-active-panel :blog-panel]))
  ;; --------------------
  (hook-browser-navigation!))
