gets stdin N
set maxx -99999
set maxy -99999
set minx 99999
set miny 99999
for {set i 0} {$i < $N} {incr i} {
    gets stdin in
    set x [lindex $in 0]
    set y [lindex $in 1]
    if {$x>$maxx} {
        set maxx $x
    }
    if {$y>$maxy} {
        set maxy $y
    }
    if {$x<$minx} {
        set minx $x
    }
    if {$y<$miny} {
        set miny $y
    }
}
puts [expr ($maxx-$minx) * ($maxy-$miny)]
