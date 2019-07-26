(ns personal-site.parts.project-page)

(defn close []
  [:a {:href "/#/"}
   [:div {:class "close"}
    [:span {:class "closeSpan"} "X"]]])


(defn print-timestamps [timestamps class]
  (let [container [:div {:class (str "timestamps " class)} [:h2 {:class "projectHeader"} "Timestamps"]]]
    (into container
          (mapv (fn [timestamp] [:span timestamp]) timestamps))))


(defn tech-stack [languages class]
  (let [container [:div {:class (str "languages " class)} [:h2 {:class "projectHeader"} "Tech Used"]]]
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
   [:h1 {:class "projectTitle"} title]
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
     (tech-stack languages "desktop")
     (print-timestamps timestamps "desktop")]]])


(defn template [title video languages timestamps live github description]
  [:div {:class "projectContainer"}
   [:div {:class "projectInfo"}
    (close)
    [:div {:class "projectContent"}
     (header title live github)
     (project-description description)
     (video-demo video languages timestamps)
     [:div {:class "mobileVideoInfo"}
      (tech-stack languages "mobile")
      (print-timestamps timestamps "landscape")]
     (print-timestamps timestamps "portrait")]]])
