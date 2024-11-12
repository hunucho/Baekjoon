gets stdin N
gets stdin st
set ans 0
for {set i 1} {$i <= $N} {incr i} {
    if {[lindex $st [expr $i - 1]] != $i} {
        incr ans
    }
}
puts $ans
