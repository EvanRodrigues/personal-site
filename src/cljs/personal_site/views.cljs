(ns personal-site.views
  (:require [re-frame.core :as re-frame]
            [personal-site.subs :as subs]

            [personal-site.parts.nav :as nav]

            [personal-site.pages.home :as home]
            [personal-site.pages.contact :as contact]
            [personal-site.pages.resume :as resume]
            [personal-site.pages.portfolio :as portfolio]
            [personal-site.pages.blog :as blog]))


(defn home-panel []
  [:div
   (nav/html)
   (home/html)])

(defn resume-panel []
  [:div
   (nav/html)
   (resume/html)
   [:a {:href "#/"} "Go Home"]])

(defn portfolio-panel []
  [:div
   (nav/html)
   (portfolio/html)
   [:a {:href "#/"} "Go Home"]])

(defn contact-panel []
  [:div
   (nav/html)
   (contact/html)
   [:a {:href "#/"} "Go Home"]])

(defn blog-panel []
  [:div
   (nav/html)
   (blog/html)
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
