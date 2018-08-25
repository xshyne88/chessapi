(ns chessapi.core
  (:require 
    [clj-http.client :as client]
    [cheshire.core :refer :all]
  ))

(defn foo
  "I never have done a whole lot."
  [x]
  (println x "Hello, World!"))

(defn get-player-data
   [username] 
   (parse-string (get (client/get (str "https://api.chess.com/pub/player/" username)) :body) true))

(defn gpd 
  [username]
(let [name (str "https://api.chess.com/pub/player/" username)]
  (-> name
    (client/get)
    (get :body)
    (parse-string true))))

(defn get-player-id 
  [player] 
    (-> player
    (get-player-data)
    (get :player_id)))

