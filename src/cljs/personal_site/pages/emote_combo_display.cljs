(ns personal-site.pages.emote-combo-display
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "emote-combo-display"
   "projectContainer"
   "https://www.youtube.com/embed/VoaBkD51FXc"
   ["JavaScript" "HTML" "CSS"]
   ["0:00 - Intro" "0:47 - Languages Used" "1:06 - How it Works" "2:50 - Emote Displayed" "3:40 - Managing Combos" "7:09 - Managing Settings"]
   nil
   "https://github.com/EvanRodrigues/emote-combo-display"
   "A widget for twitch.tv streamers that displays an emote on OBS and plays a sound if an emote is used enough in the chat room. The emote-combo-display has access to Twitch global, BetterTTV, and FrankerFaceZ emotes."
   true))