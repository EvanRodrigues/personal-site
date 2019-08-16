(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "myStory"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "My Story"]]
    [:div {:class "storyContainer"}
     [:span {:class "storyEntry"} "I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick New Jersey, where I received my bachelor's degree in Computer Science. I chose Computer Science as my major because of my love for video games and technology."]

     [:span {:class "storyEntry"} "After college, I spent three years as a " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer. I no longer stream full-time on Twitch, but I develop apps for streamers as freelance work in my free time."]

     [:span {:class "storyEntry"} "My first job was with " [:a {:class "highlighted" :href "https://www.bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front End Developer Consultant. I converted their website into a serverless SPA using Clojure and re-frame. I also built their blog to work without a back-end, and developed a pricing calculator for subscription costs."]

     [:span {:class "storyEntry"} "I am currently looking for Front End Developer work either remotely or in the New York City area."]]]])
