gets stdin N
for {set i 1} {$i <= $N} {incr i} {
    set in [lsort -integer [gets stdin]]
    set ans no
    if {[expr pow([lindex $in 0], 2) + pow([lindex $in 1], 2)] == [expr pow([lindex $in 2], 2)]} {
        set ans yes
    }
    puts "Scenario #$i:\n$ans\n"
}

# default ascii, need to use -integer
