(ns personal-site.pages.stream-goal
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "stream-goal"
   "projectContainer"
   "https://www.youtube.com/embed/8Y7H5rTbC54"
   ["Node.js" "Express" "JavaScript" "MongoDB" "HTML" "CSS"]
   ["0:00 - Intro" "0:26 - Why I Made It" "3:09 - Functionality" "5:59 - Resetting the Bar" "7:21 - Future Plans"]
   nil
   "https://github.com/EvanRodrigues/stream-goal"
   "A widget for twitch.tv streamers to use as a donation bar. It uses the Streamlabs Socket API to combine all of the Streamlabs goal bars (subscriptions, paypal donations, and bits) into one bar that keeps track of everything."))