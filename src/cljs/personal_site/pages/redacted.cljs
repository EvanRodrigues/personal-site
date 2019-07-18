(ns personal-site.pages.redacted
  (:require [personal-site.parts.project-page :as project-page]))

(defn html []
  (project-page/template
   "Redacted.tv"
   "/videos/redacted.mp4"
   ["0:00 - Intro" "1:00 - Twitch Plugin" ""]
   nil
   nil
   "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the template to match design goals for the site."))
