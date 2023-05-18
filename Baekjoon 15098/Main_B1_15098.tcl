gets stdin in
set ans yes
foreach i $in {
	if { [info exists $i]} {
		set ans no
	}
	set $i ""
}
puts $ans
