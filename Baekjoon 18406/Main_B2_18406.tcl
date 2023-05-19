gets stdin N
set a 0
set b 0
for {set i 0} {$i < [expr [string length $N] / 2]} {incr i} {
    set a [expr $a + [string range $N $i $i]]
}
for {set i [expr [string length $N] / 2]} {$i < [string length $N]} {incr i} {
    set b [expr $b + [string range $N $i $i]]
}
if {$a == $b} {
    puts LUCKY
} else {
    puts READY
}
