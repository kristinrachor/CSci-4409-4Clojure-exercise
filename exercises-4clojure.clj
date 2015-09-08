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

Problem #43 Reverse Inverse
(fn [x n] (apply map list (partition n x)))

Problem #44 Rotate Sequence 
Can't figure it out

Problem #46 Flipping Out
(fn [x] (fn [a b] (x b a)))

Problem #47 Contain Yourself
4

