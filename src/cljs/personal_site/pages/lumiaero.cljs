(ns personal-site.pages.lumiaero
  (:require [personal-site.parts.project-page :as project-page]))


(defn html []
  (project-page/template
   "LumiAero"
   "https://www.youtube.com/embed/OYncR9FoC-0"
   ["C#" "JavaScript" "jQuery" "HTML" "CSS" "SQL" "Entity Framework Core" "ASP.NET Zero"]
   ["0:00 - Intro" "0:42 - Technologies Used" "1:05 - User Management" "3:10 - Aircraft Management" "6:42 - Subcategory Management" "8:22 - Excel Ops" "15:01 - API Overview"]
   nil
   nil
   "A website to manage aircraft and user information for a Microsoft Excel COM add-in. The COM add-in and the website communicate via an API that I designed. The site is linked to an Azure SQL relational database, and the project was started with ASP.NET Zero."))