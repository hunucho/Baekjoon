gets stdin N
set ans 1
set i 1
while {true} {
    if { $i == $N} {
        puts $ans
        break
    } elseif { $i > $N } {
        set i 1
    } else {
        set N [expr $N - $i]
        incr ans
        incr i
    }
}
