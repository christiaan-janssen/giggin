(ns giggin.components.gigs
  (:require [giggin.state :as state]))

(defn gigs
  []
  [:main
   [:div.gigs (map (fn []
                     [:div.gigs
                      [:img.gig__artwork {:src "src" :alt "alt"}]
                      [:div.gig__body
                       [:div.gig__title
                        [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to order"}
                         [:i.icon.icon--plus]] "title"]
                       [:p.gig__price "price"]4
                       [:p.gig__desc "desc"]]])@state/gigs)]])
