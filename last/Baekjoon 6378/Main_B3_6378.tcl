while {true} {
    gets stdin ans
    if {$ans == "0"} {
        break
    }
    
    while {$ans > 9} {
        set tmp 0
        while {$ans > 0} {
            set tmp [expr $tmp + $ans%10]
            set ans [expr $ans/10]
        }
        set ans $tmp
    }
    puts $ans
}
