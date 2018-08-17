(ns chessapi.core
  (:require 
    [clj-http.client :as client]
    [cheshire.core :refer :all]
  ))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn get-player-data
   [username] 
   (parse-string (get (client/get (str "https://api.chess.com/pub/player/" username)) :body) true))

  