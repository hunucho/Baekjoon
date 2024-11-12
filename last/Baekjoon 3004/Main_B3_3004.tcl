gets stdin N
set ans 2
set d 2
for {set i 1} {$i < $N} {incr i} {
set ans [expr $ans + $d]
    if {[expr $i%2]==0} {
        incr d
    }
}
puts $ans
