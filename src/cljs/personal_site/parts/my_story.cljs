(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "myStory"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "My Story"]]
    [:div {:class "storyContainer"}
     [:span {:class "storyEntry"} "My first programming experience was freshman year of high school. With the help of some friends, I made edits to monsters, weapons, and armor in the game " [:a {:class "highlighted" :href "https://uo.com"} "Ultima Online"] "."]

     [:span {:class "storyEntry"} "I took a Java class senior year of high school and determined that Computer Science would be my major in college. I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick New Jersey, where I received my bachelor's degree in Computer Science."]

     [:span {:class "storyEntry"} "After college, I spent three years as a " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer. I no longer stream on twitch, but I develop apps for the platform in my free time."]

     [:span {:class "storyEntry"} "My first job was with " [:a {:class "highlighted" :href "https://www.bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front End Developer Consultant. Most of my work was converting their website to a serverless SPA using Clojure and re-frame. I also constructed their blog to work without a back end, and built a pricing tool to calculate subscription costs for potential customers."]

     [:span {:class "storyEntry"} "I am currently looking for Front End Developer work either remotely or in the New York City area."]]]])
