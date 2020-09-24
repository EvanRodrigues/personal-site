(ns personal-site.pages.stream-tools
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "stream-tools"
   "projectContainer"
   "https://www.youtube.com/embed/vHNKRo6t-oc"
   ["Node.js" "Express" "JavaScript" "MongoDB" "HTML" "SASS/CSS"]
   ["0:00 - Intro" "0:43 - Technologies Used" "1:04 - Purpose of Project" "2:26 - The Dashboard" "4:17 - Customizing the Bar" "6:57 - Future Plans"]
   nil
   "https://github.com/EvanRodrigues/stream-tools"
   "A platform to distribute my twitch.tv widgets to my friends to use. It's my first full stack personal project and is consistently being updated with new widgets and features."
   true))