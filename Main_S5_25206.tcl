set ans "0"
set alpha(A+) 4.5
set alpha(A0) 4.0
set alpha(B+) 3.5
set alpha(B0) 3.0
set alpha(C+) 2.5
set alpha(C0) 2.0
set alpha(D+) 1.5
set alpha(D0) 1.0
set alpha(F) 0

set credits 0
for {set i 0} {$i < 20} {incr i} {
    gets stdin str
    regexp { ([0-9.]*) ([A-F0\+]*)} $str matched credit scores
    if {$scores != ""} {
        set ans [expr $ans + $credit * $alpha($scores)]
        set credits [expr $credits + $credit]
    }
}
puts [format "%.6f" [expr $ans / $credits]]
