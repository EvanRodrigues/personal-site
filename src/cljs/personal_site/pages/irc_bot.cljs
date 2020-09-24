(ns personal-site.pages.irc-bot
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "IRC Bot"
   "projectContainer"
   "https://www.youtube.com/embed/eu4gJ6U1ovU"
   ["Python" "pip" "Twitch IRC" "OAuth"]
   ["0:00 - Intro" "1:03 - Custom Commands" "1:51 - Auto Points" "3:03 - Missions" "5:24 - Raffles" "7:36 - Quote System"]
   nil
   "https://github.com/EvanRodrigues/IRCbot"
   "An IRC chat bot used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. Currently the bot is designed specifically for me, but in the future I would like to make it open for public use."
   true))
