(ns personal-site.views
  (:require [re-frame.core :as re-frame]
            [personal-site.subs :as subs]
            [personal-site.pages.home :as home]
            [personal-site.pages.blog :as blog]
            [personal-site.pages.bma-website :as bma-website]
            [personal-site.pages.song-list :as song-list]
            [personal-site.pages.redacted :as redacted]
            [personal-site.pages.lumiaero :as lumiaero]
            [personal-site.pages.irc-bot :as irc-bot]
            [personal-site.pages.stream-tools :as stream-tools]
            [personal-site.pages.emote-combo-display :as emote-combo-display]))


(defn home-panel []
  [:div
   (home/html)])

(defn bma-website []
  [:div
   (bma-website/html)])

(defn song-list []
  [:div
   (song-list/html)])

(defn redacted []
  [:div
   (redacted/html)])

(defn irc-bot []
  [:div
   (irc-bot/html)])

(defn lumiaero []
  [:div
   (lumiaero/html)])

(defn stream-tools []
  [:div
   (stream-tools/html)])

(defn emote-combo-display []
  [:div
   (emote-combo-display/html)])


(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :bma-website [bma-website]
    :song-list [song-list]
    :redacted [redacted]
    :irc-bot [irc-bot]
    :lumiaero [lumiaero]
    :stream-tools [stream-tools]
    :emote-combo-display [emote-combo-display]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
