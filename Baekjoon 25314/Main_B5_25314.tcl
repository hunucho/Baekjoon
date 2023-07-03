gets stdin N
for {set i 0} {$i < [expr $N / 4]} {incr i} {
    puts -nonewline "long "
}
puts "int"
