(ns com.alibaba.dike.core
  (:use [com.alibaba.dike operator] )
  )

(defrecord Member [id age email] )

(defn rule1-old-man [member]
  (if (> (-> member :age) 60) true false))

(def tom (Member. "1" 50 "tom@test.com"))
(def jack (Member. "2" 62 "jack@alibaba-inc.com"))
;;(println (-> tom :age))
(println (rule1-old-man tom))
(println (rule1-old-man jack))

(assert (not (opr-str-startWith "hello" "el"))    )
(println (opr-str-equal "aa" "bb"))