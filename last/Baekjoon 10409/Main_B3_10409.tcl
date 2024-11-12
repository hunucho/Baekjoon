gets stdin in
set n [lindex $in 0]
set T [lindex $in 1]
set ans 0
set timer 0
gets stdin in
for {set i 0} {$i < $n} {incr i} {
    set timer [expr $timer + [lindex $in $i]]
    if {$timer <= $T} {
        incr ans
    } else {
        break
    }
}
puts $ans
