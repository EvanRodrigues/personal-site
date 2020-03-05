(ns personal-site.parts.projects)

(defn project_entry [title link summary]
  [:div {:class "entryContainer"}
   [:a {:class "entryLink" :href link} [:h4 {:class "entryTitle"} title]]
   [:p {:class "entrySummary"} summary]])

(defn html []
  [:div {:id "projects"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "Projects"]]
    [:div {:class "portfolioContainer"}
        (project_entry "SongList"
                      "/#/songlist"
                       "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist.")

        (project_entry "stream-goal"
                      "/#/stream_goal"
                       "A widget for twitch.tv streamers to use as a donation bar. It uses the Streamlabs Socket API to combine all of the Streamlabs goal bars (subscriptions, paypal donations, and bits) into one bar that keeps track of everything.")

        (project_entry "emote-combo-display"
                      "/#/emote_combo_display"
                       "A widget for twitch.tv streamers that displays an emote on OBS and plays a sound if an emote is used enough in the chat room. The emote-combo-display has access to Twitch global, BetterTTV, and FrankerFaceZ emotes.")

        (project_entry "IRCbot"
                       "/#/irc_bot"
                       "An IRC chat bot used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. Currently the bot is designed specifically for me, but in the future I would like to make it open for public use.")]]])