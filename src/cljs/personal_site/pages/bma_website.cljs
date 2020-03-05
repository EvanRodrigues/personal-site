(ns personal-site.pages.bma-website
  (:require [personal-site.parts.project-page :as project-page]))


(defn html []
  (project-page/template
   "BMA Website"
   "workProjectContainer"
   "https://www.youtube.com/embed/1WhMwB_a87g"
   ["Clojure/ClojureScript" "HTML" "CSS" "reagent" "re-frame"]
   ["0:00 - Intro" "0:25 - Technologies Used" "1:20 - About the Job" "2:19 - Site Navigation" "2:55 - Pricing Tool" "4:03 - Mobile Site" "5:10 - Blog"]
   nil
   "https://github.com/EvanRodrigues/bma-website"
   "I converted the previous Blue Moon Analytics site into a serverless SPA using reagent and re-frame. The new features that were added are a pricing tool, blog, and a nav bar for desktop and mobile."))
