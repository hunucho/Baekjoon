gets stdin N
for {set i 0} {$i < $N} {incr i} {
    gets stdin arr($i)
}
gets stdin K
if {$K == 1} {
    for {set i 0} {$i < $N} {incr i} {
	puts $arr($i)
    }
} elseif {$K == 2} {
    for {set i 0} {$i < $N} {incr i} {
	for {set j [expr $N-1]} {$j >= 0} {incr j -1} {
	    puts -nonewline [string range $arr($i) $j $j]
	}
	puts ""
    }
} else {
    for {set i [expr $N-1]} {$i >= 0} {incr i -1} {
	puts $arr($i)
    }
}
