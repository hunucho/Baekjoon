gets stdin T
for {set i 0} {$i < $T} {incr i} {
    gets stdin in
    set n [lindex $in 0]
    set s [lindex $in 1]
    puts "[string range $s 0 [expr $n - 2] ][string range $s $n [string length $s ]]"
}
