;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.


Problem #10 Intro to Maps
20

Problem #16 Hello World
(fn[name] (str "Hello, " name "!"))

Problem #17 Sequences: Maps
'(6 7 8)

Problem #18 Sequences: Filter
'(6 7)

Problem #20 Penultimate Element
(fn[x](nth x(- (count x) 2)))

Problem #21 Nth Element
(fn[x n] (last (take(+ n 1) x )))

Problem #23 Reverse a Sequence
(fn[x] (into '() x))

Problem #25 Find the Odd Numbers
(fn[x] (filter odd? x))

Problem #37 Regular Expressions
"ABC"

Problem #40 Interpose a Sequence
(fn [s x] (drop-last (mapcat vector x (repeat s))))

Problem #43

Problem #44

Problem #46
(fn [x] (fn [a b] (x b a)))

Problem #47
4

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

