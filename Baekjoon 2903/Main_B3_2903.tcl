gets stdin N
set ans 2
set d 1
for {set i 0} {$i < $N} {incr i} {
    set ans [expr $ans + $d]
    set d [expr $d * 2]
}
puts [expr $ans * $ans]
