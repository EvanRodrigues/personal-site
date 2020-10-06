(ns personal-site.pages.stream-tools
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "Stream Tools"
   "projectContainer"
   "https://www.youtube.com/embed/4vyPTh6EWkw"
   ["Node.js" "Express" "JavaScript" "React/Redux" "Jest" "MongoDB" "HTML" "SASS/CSS"]
   ["0:00 - Intro" "1:12 - Loggin In" "2:04 - Home Page" "2:48 - Goal Dashboard" "4:19 - Changing Settings" "8:03 - Bar In Action"]
   nil
   "https://github.com/EvanRodrigues/stream-tools"
   "A platform to distribute my twitch.tv widgets to my friends to use. It's my first full stack personal project and is consistently being updated with new widgets and features."
   true))