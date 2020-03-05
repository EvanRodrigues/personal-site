(ns personal-site.pages.home
  (:require [personal-site.parts.intro :as intro]
            [personal-site.parts.my-story :as story]
            [personal-site.parts.portfolio :as portfolio]
            [personal-site.parts.projects :as projects]
            [personal-site.parts.blog :as blog]))


(defn html []
  [:div {:class "contentContainer"}
   (intro/html)
   (portfolio/html)
   (projects/html)
   (story/html)
   ;;(blog/html)
   ])
