gets stdin N
set ans 0
for {set i 0} {$i < $N} {incr i} {
    gets stdin tmp
    if {[info exists arr($tmp)]} {
        set arr($tmp) [expr $arr($tmp) + 1]
    } else {
        set arr($tmp) 0
    }
}
foreach {hip cnt} [array get arr] {
    set ans [expr $ans + $cnt]
}
puts $ans
