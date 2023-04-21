gets stdin N
set ans 0
gets stdin pi
set last [lindex $pi 0]
set min [lindex $pi 0]
foreach p $pi {
    if { $p > $last } {
        if {[expr $p - $min] > $ans} {
            set ans [expr $p - $min]
        }
    } else {
        set last $p
        set min $p
    }
    set last $p
}
puts $ans
