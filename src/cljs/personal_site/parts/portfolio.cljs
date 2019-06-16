(ns personal-site.parts.portfolio)


(defn portfolio_entry [title link summary]
  [:div {:class "entryContainer"}
   [:a {:class "entryLink" :href link} [:h4 {:class "entryTitle"} title]]
   [:p {:class "entrySummary"} summary]])


(defn html []
  [:div {:id "portfolio"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "Portfolio"]]
    [:div {:class "portfolioContainer"}
      (portfolio_entry "Blue Moon Analytics Website"
                       "https://github.com/EvanRodrigues/bma-website"
                       "I converted the previous Blue Moon Analytics site into a serverless SPA using re-frame. The new features that were added are a pricing tool, blog, and a nav bar for desktop and mobile.")


      (portfolio_entry "SongList"
                       "https://github.com/EvanRodrigues/SongList"
                       "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist.")


      (portfolio_entry "IRCbot (In Development)"
                       "https://github.com/EvanRodrigues/IRCbot"
                       "An IRC chat bot used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. The bot can be configured to work with any streamer. I'm considering customizing the bot as part-time work if a streamer requests specific features.")


      (portfolio_entry "Redacted.tv"
                       "https://redacted.tv"
                       "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the template to match design goals for the site.")]]])
