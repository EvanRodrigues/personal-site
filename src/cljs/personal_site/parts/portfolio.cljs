(ns personal-site.parts.portfolio)


(defn portfolio_entry [title link date summary]
  [:div {:class "workContainer"}
   [:a {:class "workLink" :href link} [:h4 {:class "workTitle"} title]]
   [:span {:class "workDate"} date]
   [:p {:class "workSummary"} summary]])


(defn html []
  [:div {:id "portfolio"}
   [:div {:class "infoContainer"}
    [:div {:class "headerContainer"}
     [:h1 {:class "infoTitle"} "Work Experience"]]
    [:div {:class "portfolioContainer"}
      (portfolio_entry "LumiAero"
                        "/#/lumiaero"
                        "September 2019 - February 2020"
                        "I built a website to manage aircraft and user information for a Microsoft Excel COM add-in called LumiAero. The add-in uses an API I built to provide quick calculations for future market values, and risk assessment. I also added the ability to mass import/export aircraft data to and from an Excel sheet. This greatly sped up our client's workflow. The website is linked to an Azure SQL relational database, and the project was started with ASP.NET Zero.")

      (portfolio_entry "BMA Website"
                        "/#/bma_website"
                        "May 2018 - September 2018"
                        "I converted the previous Blue Moon Analytics website into a serverless SPA using reagent and re-frame. At the time, Blue Moon Analytics was a Clojure shop, so this added consistency between their website and products that they developed. The conversion also allowed for more customization to the website. I was able to add a pricing tool, blog, and a new nav bar for desktop and mobile.")]]])
