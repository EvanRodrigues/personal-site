(ns personal-site.pages.song-list
  (:require [personal-site.parts.project-page :as project-page]))


(defn html []
  (project-page/template
   "SongList"
   "https://www.youtube.com/embed/04Twe1cI_Ig"
   ["PHP" "JavaScript/jQuery" "MySQL" "HTML" "SASS/CSS" "Bootstrap"]
   ["0:00 - Intro" "0:58 - Technologies Used" "1:24 - Searching" "2:21 - Sorting by Category" "3:01 - Scrolling Through the Table" "4:04 - Mobile Views" "4:55 - Changes I Would Make"]
   "https://ruffianly-inaction.000webhostapp.com"
   "https://github.com/EvanRodrigues/SongList"
   "A site to display a collection of songs in a table. Songs are stored in a MySQL database. Users can order by category (descending or ascending), and can search through the table by title or artist."))
