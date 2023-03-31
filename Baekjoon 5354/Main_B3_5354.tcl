gets stdin T

for {set t 0} {$t <= $T} {incr t} {
    gets stdin M

    for {set i 0} {$i < $M} {incr i} {
	if {$i==0 || $i==[expr $M-1]} {
	    puts [string repeat "#" $M]
	} else {
	    puts [format "#%s#" [string repeat "J" [expr $M - 2]]]
	}
    }
    puts ""
}
