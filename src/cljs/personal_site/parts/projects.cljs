(ns personal-site.parts.projects)

(defn project_entry [title link summary]
  [:div {:class "entryContainer"}
   [:a {:class "entryLink" :href link} [:h4 {:class "entryTitle"} title]]
   [:p {:class "entrySummary"} summary]])

(defn html []
  [:div {:id "projects"}
   [:div {:class "infoContainer"}
    [:h1 {:class "infoTitle"} "Projects"]
    [:div {:class "portfolioContainer"}
        (project_entry "SongList"
                      "/#/songlist"
                       "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist.")


        (project_entry "IRCbot"
                       "/#/irc_bot"
                       "An IRC chat bot used for twitch.tv. The bot manages user data, raffles, in-channel currency distribution, song requests, and games. The bot can be configured to work with any streamer.")
                       
        (project_entry "SongList"
                      "/#/songlist"
                       "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist.")
        
        (project_entry "SongList"
                      "/#/songlist"
                       "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist.")]]])