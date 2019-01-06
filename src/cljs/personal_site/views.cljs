(ns personal-site.views
  (:require [re-frame.core :as re-frame]
            [personal-site.subs :as subs]
            [personal-site.pages.home :as home]
            [personal-site.pages.blog :as blog]))


(defn home-panel []
  [:div
   (home/html)])

(defn blog-panel []
  [:div
   (blog/html)])

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :blog-panel [blog-panel]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
