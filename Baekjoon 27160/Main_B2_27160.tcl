gets stdin N
set F(STRAWBERRY) 0
set F(BANANA) 0
set F(LIME) 0
set F(PLUM) 0
set ans NO
for {set i 0} {$i<$N} {incr i} {
    gets stdin in
    set S [lindex $in 0]
    set X [lindex $in 1]
    set F($S) [expr $F($S) + $X]
}
foreach f [array names F] {
    if {$F($f) == 5} {
        set ans YES
    }
}
puts $ans
