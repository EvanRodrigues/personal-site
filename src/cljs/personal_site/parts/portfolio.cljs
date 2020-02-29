(ns personal-site.parts.portfolio)


(defn portfolio_entry [title link date languages summary]
  [:div {:class "workContainer"}
   [:a {:class "workLink" :href link} [:h4 {:class "workTitle"} title]]
   [:p {:class "workSummary"} summary]])


(defn html []
  [:div {:id "portfolio"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "Professional Work"]]
    [:div {:class "portfolioContainer"}
      (portfolio_entry "LumiAero"
                        "/#/lumiaero"
                        ""
                        ""
                        "A website to manage aircraft and user information for a Microsoft Excel COM add-in called LumiAero. The website is linked to an Azure SQL relational database, and the project was started with ASP.NET Zero.")

      (portfolio_entry "BMA Website"
                        "/#/bma_website"
                        ""
                        ""
                        "I converted the previous Blue Moon Analytics site into a serverless SPA using reagent and re-frame. The new features that were added are a pricing tool, blog, and a nav bar for desktop and mobile.")]]])
