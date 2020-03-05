(ns personal-site.pages.redacted
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "Redacted.tv"
   "projectContainer"
   "https://www.youtube.com/embed/Akiv2Q_c8bY"
   ["PHP" "HTML" "CSS" "JavaScript" "WordPress"]
   ["0:00 - Intro" "1:09 - Technologies Used" "1:48 - Twitch.tv Plugin" "3:14 - Twitter Plugin" "5:41 - Other Styling + New Sidebar" "6:35 - Article Page"]
   nil
   nil
   "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the template to match design goals for the site."))
