(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "myStory"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "My Story"]]
    [:div {:class "storyContainer"}
     [:span {:class "storyEntry"} "I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick New Jersey, where I received my bachelor's degree in Computer Science. I chose Computer Science as my major because of my love for video games and technology."]

     [:span {:class "storyEntry"} "After college, I spent three years as a " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer. I no longer pursue streaming full-time, but I enjoy developing tools for streamers as a hobby."]

     [:span {:class "storyEntry"} "My first professional work was with " [:a {:class "highlighted" :href "https://www.bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front-End Developer. I converted their website into a serverless SPA using Clojure and re-frame. I built their blog to work without a back-end, and developed a pricing tool to calculate subscription costs."]

     [:span {:class "storyEntry"} "In late 2019, I was given another opportunity to work with " [:a {:class "highlighted" :href "https://www.bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Full-Stack Developer. I helped them develop an API and a web UI using C# and ASP.NET Core for a Microsoft Excel COM add-in called LumiAero."]

     [:span {:class "storyEntry"} "I am currently looking for Software Development work either remotely or in the New York City area."]]]])
