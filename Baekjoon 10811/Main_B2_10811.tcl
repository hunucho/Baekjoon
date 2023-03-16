gets stdin in
set n [lindex $in 0]
set m [lindex $in 1]
set arr(0) 0
for {set i 1} {$i <= $n} {incr i} {
    set arr($i) $i
}
for {set t 0} {$t <= $m} {incr t} {
    gets stdin in
    set i [lindex $in 0]
    set j [lindex $in 1]
    while {$i < $j} {
	set tmp $arr($i)
	set arr($i) $arr($j)
	set arr($j) $tmp
	incr i 1
	incr j -1
    }
}
for {set i 1} {$i <= $n} {incr i} {
    puts -nonewline "$arr($i) "
}
