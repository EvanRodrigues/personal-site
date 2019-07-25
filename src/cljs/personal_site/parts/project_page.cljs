(ns personal-site.parts.project-page)

(defn close []
  [:a {:href "/#/"}
   [:div {:class "close"}
    [:span {:class "closeSpan"} "X"]]])


(defn print-timestamps [timestamps]
  (let [container [:div {:class "timestamps"} [:h2 {:class "projectHeader"} "Timestamps"]]]
    (into container
          (mapv (fn [timestamp] [:span timestamp]) timestamps))))


(defn tech-stack [languages]
  (let [container [:div {:class "languages"} [:h2 {:class "projectHeader"} "Tech Used"]]]
    (into container
          (mapv (fn [language] [:span language]) languages))))


(defn links [live github]
  [:div {:class "linkContainer"}
   (if (nil? live)
     [:div {:class "button button-left button-none"} "no live version"]
     [:a {:class "projectLink" :href live}
      [:div {:class "button button-left"} "live version"]])
   (if (nil? github)
     [:div {:class "button button-right button-none"} "private code"]
     [:a {:class "projectLink" :href github}
      [:div {:class "button button-right"} "github"]])])


(defn header [title live github]
  [:div {:class "projectHeaderContainer"}
   [:h1 {:class "projectHeader"} title]
   (links live github)])


(defn project-description [description]
  [:div {:class "descriptionContainer"}
   [:h2 {:class "projectSectionHeader"} "Description"]
   [:p {:class "projectDescription"} description]])


(defn video-demo [video languages timestamps]
  [:div {:class "videoContainer"}
   [:h2 {:class "projectSectionHeader"} "Video Demo"]
   [:div {:class "video"}
    [:iframe {:src video
              :frameBorder "0"
              :allowFullScreen true}]
    [:div {:class "videoInfo"}
     (tech-stack languages)
     (print-timestamps timestamps)]]])


(defn template [title video languages timestamps live github description]
  [:div {:class "projectContainer"}
   [:div {:class "projectInfo"}
    (close)
    (header title live github)
    (project-description description)
    (video-demo video languages timestamps)]])
