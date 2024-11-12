set in [gets stdin] 
set prev ""
set ans 0
set spls [split $in ""]
foreach spl $spls {
	if {$prev == $spl} {
		set ans [expr $ans + 5]
	} else {
		set ans [expr $ans + 10]
		set prev $spl
	}
}
puts $ans
