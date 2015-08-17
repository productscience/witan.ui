(ns witan.styles.base
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px em percent]]
            [witan.styles.fonts :as f]
            [witan.styles.colours :as colour]
            [witan.styles.util :refer [url]]))

;; Change defstylesheet to defstyles.
(defstyles base
  (-> (concat
        ;; fonts
        f/font-face-definitions

        ;; style
        [
         ;; tags
         [:html
          {:background-color colour/bg}]
         [:body
          {}]
         [:body :h1 :h2 :h3 :h4 :h5
          {:font-family f/base-fonts}]
         [:h1
          {:color colour/title}]
         [:h2
          {:color colour/subtitle}]
         [:h3
          {:color colour/para-heading}]
         [:hr
          {:color colour/hr
           :background-color colour/hr}]
         [:href
          {:margin (px 0)
           :padding (px 0)}]

         ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

         ;; overrides
         [:.pure-menu-heading
          {:color colour/menu-item
           :font-size (px 20)}]
         [:.pure-menu
          {:position :relative}
          [:.pure-menu-list
           {:position :absolute
            :right (em 0.3)
            :margin-top (em 0.3)}]]
         [:.pure-table
          [:thead
           {:background-color :transparent
            :border (px 0)}]]

         ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

         [:.button-success
          {:background-color colour/success
           :color colour/white}]

         [:.text-center
          {:text-align :center}]

         ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

         [:#container
          {:margin (em 1)}]

         ;; witan
         [:#witan-menu :.witan-menu-link
          {:transition "all 0.2s ease-out 0s"}]

         [:#witan-menu
          {:background-color colour/header
           :box-shadow "0px 1px 3px rgba(0, 0, 0, 1)"}]

         [:.witan-menu-item
          [:a
           {:text-decoration :none
            :color colour/menu-item
            }]
          [:a:hover
           {:color colour/menu-item-hover}]]

         [:.witan-search-input
          {:position :relative}
          [:i
           {:position :absolute
            :vertical-align :middle
            :margin (em 0.5)}]
          [:#filter-input
           {:padding-left (px 30)
            }]]

         [:.witan-dash-heading
          {:color colour/primary
           :font-size (px 20)
           :border-bottom "#ccc 2px solid"}
          [:h1
           {:margin-bottom (em 0.2)
            :font-size (em 2)
            :display :inline-block}]
          [:.pure-menu-list
           {:bottom "0.55em"}]
          [:.pure-form
           {:display :inline-flex
            :font-size (px 14)
            :vertical-align :text-bottom
            :margin-left (em 1)}]]

         [:#witan-main-content
          {:padding-left (px 30)
           :padding-right (px 30)}]

         [:#witan-dash-projection-list
          {:width (percent 100)
           :border (px 0)}
          [:th :td
           {:border (px 0)}]]

         [:.witan-projection-table-row
          [:.modifier
           {:color colour/gray
            :margin-left (em 0.5)}]]])
      vec))
