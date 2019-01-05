(ns personal-site.parts.intro)


(defn html []
  [:div {:id "intro"}
   [:div {:id "introInfo" :class "infoContainer"}
    [:img {:class "containerIcon"
           :src "./images/avatar.jpg"}]
    [:div {:class "text"}
     [:span "I'm Evan Rodrigues!"]
     [:span "I'm a Software Developer that loves working on web applications."]
     [:span "Feel free to "
      [:a {:class "highlighted" :href "./resume/Evan_Rodrigues_Resume.pdf"} "view my resume"]
      ", and if you're interested in contacting me you can "
      [:a {:class "highlighted" :href "mailto:evanthomasrodrigues@gmail.com"} "send me an email"] "."]
     [:span "If you'd like to learn more about me, scroll down to check out some of my work!"]]

    [:div {:class "socialLinks"}
     [:div {:class "iconContainer"}
      [:a {:class "icon" :href "https://linkedin.com/in/evan-rodrigues"}
       [:img {:src "./images/icons/linked-in.svg"}]]
      [:a {:class "icon" :href "https://github.com/evanrodrigues"}
       [:img {:src "./images/icons/github.png"}]]
      [:a {:class "icon" :href "https://twitter.com/Evan__Rodrigues"}
       [:img {:src "./images/icons/twitter.png"}]]
      [:a {:class "icon" :href "https://www.instagram.com/Evan__Rodrigues"}
       [:img {:src "./images/icons/instagram.png"}]]]]]])
