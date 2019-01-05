(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "aboutMe"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "My Story"]
    [:span "I started programming freshman year of high school. I made some friends through an online video game called " [:a {:class "highlighted" :href "https://uo.com"} "Ultima Online"] ". I used that knowledge to edit the game's files to customize monsters, weapons, and armor to use for our server."]

    [:span "I took an intro to Java class senioer year that I really enjoyed, and determined that Computer Science would be my major in college. I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick New Jersey, where I got my bachelor's degree in Computer Science. I discovered that I enjoyed working with website a lot more than working with video games."]

    [:span "After college, I spent a few years chasing a dream of becoming a " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer. In short, it wasn't as fun or rewarding as I thought it would be. During that time, I continued to work on my programming skills as a back. To this day, I still develop apps for the Twitch platform in my free time."]

    [:span "My first job was with " [:a {:class "highlighted" :href "https://bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front End Developer Consultant. Most of my work was converting their website to a serverless SPA using Clojure and re-frame. Aside from that, I constructed their blog to work without a back end, and built a pricing tool to calculate subscription costs for potential customers."]

    [:span "As you read above, I am currently looking for Front End Developer work either remotely or in the New York City area. My current goal is to specialize in Web Development using Clojure."]]])
