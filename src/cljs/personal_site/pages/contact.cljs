(ns personal-site.pages.contact)

(def contact_me [:a {:href "mailto:evanthomasrodrigues@gmail.com"} "contact me"])

(defn html []
  [:div
   [:h1 "Contact Form"]])
