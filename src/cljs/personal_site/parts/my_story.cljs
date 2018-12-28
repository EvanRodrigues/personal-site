(ns personal-site.parts.my-story)


(defn html []
  [:div {:id "aboutMe"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "My Story"]
    [:span "I started programming freshman year of high school. I made some friends through an online video game called " [:a {:class "highlighted" :href "https://uo.com"} "Ultima Online"] " that taught me the basics of programming. I used that knowledge to edit the game's files to customize monsters, weapons, and armor to use for our server."]

    [:span "I didn't realize that programming was a viable career path when I first was exposed to it, so after losing interest in the game I wouldn't program again until senior year of high school. I took an intro to Java class that I really enjoyed, and determined that Computer Science would be my major in college. I went to college at " [:a {:class "highlighted" :href "https://www.rutgers.edu"} "Rutgers University"] " in New Brunswick, and got my bachelor's degree in Computer Science. I initially wanted to work on video games, but my plan had changed after taking a data management course. Even though the course was focused on Database Management, it exposed me to Web Development for the first time. I enjoyed the work in this course over every other course I took in college."]

    [:span "After college, I spent a few years chasing a dream of becoming a full time " [:a {:class "highlighted" :href "https://twitch.tv"} "Twitch"] " streamer only to realize that it was a lot more frustrating and cut throat than I initially thought. During that time I continued to work on my programming skills as a back up plan. To this day, I still develop apps for the Twitch platform in my free time."]

    [:span "My first job was with " [:a {:class "highlighted" :href "https://bluemoonanalytics.com"} "Blue Moon Analytics"] " as a Front End Developer Consultant. Most of my work was converting their website to a serverless SPA using Clojure and re-frame. Aside from that, I constructed their blog to work without a back end, and built a pricing tool to calculate subscription costs for potential customers."]

    [:span "As you read above, I am currently looking for Front End Developer work either remotely or in the New York City area. My current goal is to specialize in Web Development using Clojure."]]])
