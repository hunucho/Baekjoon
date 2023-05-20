gets stdin in
set in [split $in ,]
set ans 0
foreach i $in {
    set ans [expr $ans + $i]
}
puts $ans
