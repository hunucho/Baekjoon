gets stdin N
set aw 0
set bw 0
for {set i 0} {$i < $N} {incr i} {
    gets stdin in
    set a [lindex $in 0]
    set b [lindex $in 1]
    if {$a > $b} {
        incr aw
    } elseif {$a < $b} {
        incr bw
    }
}
puts "$aw $bw"
