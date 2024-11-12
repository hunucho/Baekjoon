gets stdin q
set arr(32) "Enjoy the little things"
for {set i 1} {$i <= $q} {incr i} {
    set arr($i) [gets stdin]
}
gets stdin r
for {set i 0} {$i < $r} {incr i} {
    gets stdin t
    if { [info exists arr($t)] } {
        puts "Rule $t: $arr($t)"
    } else {
        puts "Rule $t: No such rule"
    }
}
