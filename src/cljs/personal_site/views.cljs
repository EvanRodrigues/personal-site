(ns personal-site.views
  (:require [re-frame.core :as re-frame]
            [personal-site.subs :as subs]
            [personal-site.pages.home :as home]
            [personal-site.pages.blog :as blog]
            [personal-site.pages.redacted :as redacted]))


(defn home-panel []
  [:div
   (home/html)])

(defn bma-website []
  [:div
   (blog/html)])

(defn song-list [])

(defn redacted []
  [:div
   (redacted/html)])

(defn irc-bot [])


(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :bma-website [bma-website]
    :song-list [song-list]
    :redacted [redacted]
    :irc-bot [irc-bot]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
