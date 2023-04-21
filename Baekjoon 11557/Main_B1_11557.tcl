gets stdin T
for {set i 0} {$i < $T} {incr i} {
    gets stdin N
    set max 0
    set ans ""
    for {set j 0} {$j < $N} {incr j} {
        gets stdin str    
        set S [lindex $str 0]
        set L [lindex $str 1]
        if {$max < $L} {
            set ans $S
            set max $L
        }
    }
    puts $ans
}
