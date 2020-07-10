(ns personal-site.pages.stream-tools
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "stream-tools"
   "projectContainer"
   "https://www.youtube.com/embed/8Y7H5rTbC54"
   ["Node.js" "Express" "JavaScript" "MongoDB" "HTML" "SASS/CSS"]
   ["0:00 - Intro" "0:26 - Why I Made It" "3:09 - Functionality" "5:59 - Resetting the Bar" "7:21 - Future Plans"]
   nil
   "https://github.com/EvanRodrigues/stream-tools"
   "A platform to distribute my twitch.tv widgets to my friends to use. It's my first full stack personal project and is consistently being update with new widgets and features."))