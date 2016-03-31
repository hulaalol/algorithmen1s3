main() = sum(100)

sum(x) = _sum(x,0)

_sum(x,s) = 	if x = 0 then 
						s
				else
					_sum(x-1,s+x)
				endif