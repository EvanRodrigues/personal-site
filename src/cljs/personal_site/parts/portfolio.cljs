(ns personal-site.parts.portfolio)


(defn portfolio_entry [title summary]
  [:div {:class "entryContainer"}
   [:h4 {:class "entryTitle"} title]
   [:p {:class "entrySummary"} summary]])


(defn html []
  [:div {:id "portfolio"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "Portfolio"]

    (portfolio_entry "Blue Moon Analytics Website"
                     "A conversion of the previous Blue Moon Analytics website into a serverless SPA using re-frame. The new features to the site that were added were a pricing tool, blog, and a newly designed nav bar for desktop and for mobile.")

    [:div {:class "tenPercent"}]

    (portfolio_entry "Review Site (In Development)"
                     "This is a site to review many forms of media. This gives me a chance to share my opinion on new video games and movies, and also get experience working with a backend in clojure. It will include user registration, and users will be able rate my reviews with a thumbs up or down.")

    (portfolio_entry "IRCbot (In Development)"
                     "An IRC chat bot that is used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. The bot can be configurated to work with any streamer. I'm considering customizing the bot as part-time work if a streamer requests specific features.")

    [:div {:class "tenPercent"}]

    (portfolio_entry "Redacted.tv"
                     "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the WordPress template to match design goals for the site.")]])
