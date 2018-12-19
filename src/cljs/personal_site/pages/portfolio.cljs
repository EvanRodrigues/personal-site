(ns personal-site.pages.portfolio
  (:require [clojure.string :as str]))


;;Generates an unordered list of technologies from the tech_stack vector.
(defn list_tech [tech_stack]
  (into [:ul] (mapv #(conj [:li] %) tech_stack)))


;;Posts the github logo if the link is a github repo.
;;Posts the link address otherwise.
(defn check_link [link]
  (if (str/starts-with? link "https://github.com")
    [:a {:class "projectLink" :href link}
     [:span {:class "buttonText"} "View Repo"]]
    [:a {:class "projectLink" :href link}
     [:span {:class "buttonText"} "View Site"]]))


;;Basic function to format a portfolio entry
(defn portfolio_entry [title link tech_stack description]
  [:div {:class "portfolioEntry"}
   [:h2 {:class "portfolioTitle"} title]

   [:div {:class "portfolioInfo"}

    [:div {:class "description"}
     [:h4 "Description"]
     [:p description]]

    [:div {:class "techStack"}
     [:h4 "Tech Stack"]
     (list_tech tech_stack)]]

   ;;Check to see if link is a github repo.
   (check_link link)])


(defn html []
  [:div
   [:h1 {:class "pageTitle"} "Portfolio"]
   [:p "This page lists some of the projects that I've worked on, and is meant to provide a short summary of each project. Extra information and source code can be found on the GitHub links provided for each project. I've left out some projects so please checkout my " [:a {:class "githubLink" :href "https://github.com/EvanRodrigues"} "GitHub Page"] " if you would like to see everything that I have worked on up to this point. Some projects I am not allowed to share the source code, so I have provided a link to the site for reference."]

   (portfolio_entry "Blue Moon Analytics Website"
                    "/"
                    ["Clojure/ClojureScript" "Re-Frame" "HTML" "CSS"]
                    "This is a conversion of the previous Blue Moon Analytics website into a serverless SPA using re-frame. The new features to the site that were added were a pricing tool, blog, and a newly designed nav bar for desktop and for mobile.")

   [:span {:class "portfolioSpace"}]

   (portfolio_entry "Review Site (In Development)"
                    "https://github.com/EvanRodrigues/review-site"
                    ["Clojure/ClojureScript" "Re-Frame" "Docker" "PostgreSQL" "HTML" "CSS"]
                    "This is a site to review many forms of media. This gives me a chance to share my opinion on new video games and movies, and also get experience working with a backend in clojure. It will include user registration, and users will be able rate my reviews with a thumbs up or down.")


   (portfolio_entry "IRCbot (In Development)"
                    "https://github.com/EvanRodrigues/IRCbot"
                    ["Python"]
                    "This is an IRC chat bot that is used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. The bot can be configurated to work with any streamer. I'm considering customizing the bot as part-time work if a streamer requests specific features.")

   [:span {:class ["portfolioSpace"]}]

   (portfolio_entry "Redacted.tv"
                    "https://redacted.tv"
                    ["PHP" "HTML" "CSS" "Wordpress"]
                    "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the WordPress template to match design goals for the site.")])
