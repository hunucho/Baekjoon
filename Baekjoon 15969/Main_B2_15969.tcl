gets stdin N
gets stdin ST
set max 0
set min 1000
foreach st $ST {
    if {$min > $st} {
        set min $st
    }
    if {$max < $st} {
        set max $st
    }
}
puts [expr $max - $min]
