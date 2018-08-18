(ns chessapi.schema
  "Contains custom resolvers and a function to provide the full schema."
  (:require
    [clojure.java.io :as io]
    [clojure.edn :as edn]
    [com.walmartlabs.lacinia.pedestal :refer [service-map]]
    [com.walmartlabs.lacinia.util :as util]
    [com.walmartlabs.lacinia.schema :as schema]
    [io.pedestal.http :as http]))

(defn resolver-map
  []
  {:query/game-by-id (fn [context args value]
                       nil)})

(defn load-schema
  []
  (-> (io/resource "chess-schema.edn")
      slurp
      edn/read-string
      (util/attach-resolvers (resolver-map))
      schema/compile))

(def service (-> (load-schema)
  (service-map {:graphiql true})
  http/create-server
  http/start))
