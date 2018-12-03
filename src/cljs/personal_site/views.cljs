(ns personal-site.views
  (:require [re-frame.core :as re-frame]
            [personal-site.subs :as subs]))


(defn home-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 (str "Hello from " @name ". This is the Home Page.")]

     [:div
      [:a {:href "#/resume"} "go to resume page"]
      [:br]
      [:a {:href "#/portfolio"} "go to portfolio page"]
      [:br]
      [:a {:href "#/contact"} "go to contact page"]
      [:br]
      [:a {:href "#/blog"} "go to blog page"]]]))


(defn resume-panel []
  [:div
   [:h1 "This is the resume page."]
   [:a {:href "#/"} "Go Home"]])

(defn portfolio-panel []
  [:div
   [:h1 "This is the portfolio page."]
   [:a {:href "#/"} "Go Home"]])

(defn contact-panel []
  [:div
   [:h1 "This is the contact page."]
   [:a {:href "#/"} "Go Home"]])

(defn blog-panel []
  [:div
   [:h1 "This is the Blog Page."]
   [:a {:href "#/"} "Go Home"]])


(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :resume-panel [resume-panel]
    :portfolio-panel [portfolio-panel]
    :contact-panel [contact-panel]
    :blog-panel [blog-panel]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
