(ns personal-site.parts.nav
  (:require [re-frame.core :as re-frame]))


(defn html []
  [:div {:class "navContainer"}
   [:a {:href "/"} [:h4 "Evan Rodrigues"]]

   [:a {:href "./resume/Evan_Rodrigues_Resume.pdf"} "go to resume page"]
   [:a {:href "#/portfolio"} "go to portfolio page"]
   [:a {:href "#/contact"} "go to contact page"]
   [:a {:href "#/blog"} "go to blog page"]

   [:span "|"]

   ;;Add icons instead
   [:a {:href "https://linkedin.com/in/evan-rodrigues"} "LinkedIn"]
   [:a {:href "https://github.com/evanrodrigues"} "GitHub"]
   [:a {:href "https://twitter.com/erod_coding"} "Twitter"]])
