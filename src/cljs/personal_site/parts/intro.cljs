(ns personal-site.parts.intro)


(defn html []
  [:div {:id "intro"}
   [:div {:id "introInfo" :class "infoContainer"}
    [:div {:class "text"}
     [:div {:class "introEntry"} "I'm Evan Rodrigues!"]

     [:div {:class "introEntry"} "I'm a Software Developer who specializes in Web Development."]

     [:div {:class "introEntry"} "Feel free to "
       [:a {:class "highlighted" :href "./resume/Evan_Rodrigues_Resume.pdf"} "view my resume"]
       ", and if you're interested in contacting me you can "
       [:a {:class "highlighted" :href "mailto:evanthomasrodrigues@gmail.com"} "send me an email"] "."]

     [:div {:class "introEntry"} "If you'd like to learn more about me, scroll down to see some of my work!"]]

    [:div {:class "socialLinks"}
     [:div {:class "iconContainer"}
      [:a {:href "https://linkedin.com/in/evan-rodrigues"
           :aria-label "Check out my LinkedIn"}
       [:img {:class "icon" :alt "linked-in_50.png" :src "./images/icons/linked-in_50.png"}]]
      [:a {:href "https://github.com/evanrodrigues"
           :aria-label "Check out my GitHub"}
       [:img {:class "icon" :alt "github_50.png" :src "./images/icons/github_50.png"}]]]]]])
