(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "myStory"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "My Story"]
    [:span {:class "storyEntry"} "I started programming freshman year of high school. I made some friends through an online video game called " [:a {:class "highlighted" :href "https://uo.com"} "Ultima Online"] ". With their help, I was able to edit the game's files to customize monsters, weapons, and armor to use for our server."]

    [:span {:class "storyEntry"} "I took an intro to Java class senior year that I really enjoyed, and determined that Computer Science would be my major in college. I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick New Jersey, where I received my bachelor's degree in Computer Science. During my time in college, I discovered that I enjoyed working with websites a lot more than working with video games."]

    [:span {:class "storyEntry"} "After college, I spent a few years chasing a dream of becoming a " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer. In short, it wasn't as fun or rewarding as I thought it would be. While streaming, I continued to work on my programming skills. I still enjoy developing apps for the Twitch platform in my free time."]

    [:span {:class "storyEntry"} "My first job was with " [:a {:class "highlighted" :href "https://bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front End Developer Consultant. Most of my work was converting their website to a serverless SPA using Clojure and re-frame. Aside from that, I constructed their blog to work without a back end, and built a pricing tool to calculate subscription costs for potential customers."]

    [:span {:class "storyEntry"} "As you read above, I am currently looking for Front End Developer work either remotely or in the New York City area."]]])
