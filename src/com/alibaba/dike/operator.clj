(ns com.alibaba.dike.operator)

;;操作符

;;字符串相等
(defn opr-str-equal [x y]
   (if (= x y) true false))

;;字符串包含
(defn opr-str-contain [x y]
  (if (.contains x y) true false))

;;字符串前匹配
(defn opr-str-startWith [x y]
  (if  (.startsWith x y)  true false))

(assert (not (opr-str-equal "aa" "bb")) )
(assert (opr-str-equal "a" "a"))

(assert  (not (opr-str-contain "abc" "abd")) "not contain")
(assert (opr-str-startWith "hello" "he"))
(assert (not (opr-str-startWith "hello" "el"))    )
