gets stdin T
for {set t 1} {$t <= $T} {incr t} {
    gets stdin in
    set in [lsort -integer $in]
    set a [lindex $in 0]
    set b [lindex $in 1]
    set c [lindex $in 2]
    if {[expr $c*$c] == [expr $a*$a + $b*$b]} {
	puts "Case #$t: YES"
    } else {
	puts "Case #$t: NO"
    }
}
