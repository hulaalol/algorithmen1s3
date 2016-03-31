main() = sum(100)

sum(x) = _sum(x,0,0)

_sum(x,i,s) = 	if i > x then
						s
				else
						_sum(x,i+1,s+i)
				endif
				
				