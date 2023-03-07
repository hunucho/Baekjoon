for {set i 0} {$i < 3} {incr i} {
    set in [gets stdin]
    set t 0
    for {set j 0} {$j < 3} {incr j} {
	set t [format "%.0f" [expr $t + ([lindex $in [expr $j + 3]] - [lindex $in $j]) * pow(60,[expr [expr 2-$j]])]]
    }

    set h [expr $t / 3600]
    set t [expr $t % 3600]
    set m [expr $t / 60]
    set t [expr $t % 60]
    set s $t
    puts [format "%d %d %d" $h $m $t]
}
