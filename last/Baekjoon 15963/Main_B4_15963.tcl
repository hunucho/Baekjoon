set input [gets stdin]
set n [lindex $input 0]
set m [lindex $input 1]
if {$n == $m} {puts 1
} else {puts 0}
