gets stdin N
puts -nonewline [string repeat [string repeat [string repeat @ $N]\n $N] 4]
puts [string repeat [string repeat @ [expr $N*5]]\n $N]
