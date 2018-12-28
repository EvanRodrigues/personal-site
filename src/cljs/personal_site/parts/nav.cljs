(ns personal-site.parts.nav
  (:require [re-frame.core :as re-frame]))


(defn html []
  [:div {:id "navContainer"}
   [:a {:class "navLogo" :href "#/"} [:span {:class "logoText"} "Evan Rodrigues"]]

   [:div {:id "linkContainer"}
    [:div {:class "pageLinks"}
     [:a {:class "navLink" :href "./resume/Evan_Rodrigues_Resume.pdf"}
      [:span "Resume"]]
     [:a {:class "navLink" :href "#/portfolio"}
      [:span "Portfolio"]]
     [:a {:class "navLink" :href "#/contact"}
      [:span "Contact"]]
     [:a {:class "navLink" :href "#/blog"}
      [:span "Blog"]]]

    [:div {:class "seperator"}]

    ;;Add icons instead
    [:div {:class "iconContainer"}
     [:a {:class "navIcon" :href "https://linkedin.com/in/evan-rodrigues"}
      [:img {:src "./images/icons/linked-in.svg"}]]
     [:a {:class "navIcon" :href "https://github.com/evanrodrigues"}
      [:img {:src "./images/icons/github.png"}]]
     [:a {:class "navIcon" :href "https://twitter.com/Evan__Rodrigues"}
      [:img {:src "./images/icons/twitter.png"}]]
     [:a {:class "navIcon" :href "https://instagram.com/Evan__Rodrigues"}
      [:img {:src "./images/icons/instagram.png"}]]]]])
