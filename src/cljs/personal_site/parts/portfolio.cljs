(ns personal-site.parts.portfolio)


(defn portfolio_entry [title link summary]
  [:div {:class "entryContainer"}
   [:a {:class "entryLink" :href link} [:h4 {:class "entryTitle"} title]]
   [:p {:class "entrySummary"} summary]])


(defn html []
  [:div {:id "portfolio"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "Portfolio"]

    (portfolio_entry "Blue Moon Analytics Website"
                     "https://github.com/EvanRodrigues/bma-website"
                     "A conversion of the previous Blue Moon Analytics website into a serverless SPA using re-frame. The new features to the site that were added were a pricing tool, blog, and a newly designed nav bar for desktop and for mobile.")

    [:div {:class "tenPercent"}]

    (portfolio_entry "SongList"
                     "https://github.com/EvanRodrigues/SongList"
                     "This is a site to organize songs into a table. Songs are stored in a MySQL database. Each song contains 4 categories displayed on the table: Title, Artist, Setlist, and Date Added. Users can order by category (descending or ascending) by clicking the category name. They can also search through the table by typing in a title, artist, or setlist.")

    (portfolio_entry "IRCbot (In Development)"
                     "https://github.com/EvanRodrigues/IRCbot"
                     "An IRC chat bot that is used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. The bot can be configured to work with any streamer. I'm considering customizing the bot as part-time work if a streamer requests specific features.")

    [:div {:class "tenPercent"}]

    (portfolio_entry "Redacted.tv"
                     "https://redacted.tv"
                     "The community website for the Twitch.tv team \"Redacted\". I developed the Twitter and Twitch sections of the home page as WordPress shortcodes. I also editted the template to match design goals for the site.")]])
