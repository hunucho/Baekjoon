gets stdin in
set N [lindex $in 0]
set M [lindex $in 1]
for {set i 0} {$i < $N} {incr i} {
    gets stdin in
    for {set j [expr $M-1]} {$j >= 0} {incr j -1} {
        puts -nonewline [string range $in $j $j]
    }
    puts ""
}
