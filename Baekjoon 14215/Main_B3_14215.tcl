gets stdin in
set in [lsort -integer $in]

set a [lindex $in 0]
set b [lindex $in 1]
set c [lindex $in 2]
if {$c < [expr $a+$b]} {
    puts [expr $a+$b+$c]
} else {
    puts [expr ($a+$b)*2-1]
}
