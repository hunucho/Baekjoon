set t 1
while { 1 } {
    gets stdin N
    if { $N == 0 } {
        break
    }
    if { [expr $N % 2] == 0 } {
       puts "$t. even [expr $N / 2]" 
    } else {
        puts "$t. odd [expr $N / 2]" 
    }
    incr t
}
