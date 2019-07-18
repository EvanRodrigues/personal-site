(ns personal-site.parts.project-page)

(defn nav [])

(defn header [title description]
  [:div {:class "projectHeaderContainer"}
   [:h1 {:class "projectHeader"} title]
   [:p description]])


(defn video-demo [video timestamps]
  [:div {:class "videoContainer"}
   [:h2 {:class "videoDemo"} "Video Demo"]
   [:video {:controls true}
    [:source {:src video :type "video/mp4"}]]])

(defn template [title video timestamps live github description]
  [:div {:class "projectContainer"}
   [:div {:class "projectInfo"}
    (header title description)
    (video-demo video timestamps)]])
