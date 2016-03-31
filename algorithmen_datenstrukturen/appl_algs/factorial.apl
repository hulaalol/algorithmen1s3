main() = factorial(10)

factorial(x) = if x<0 
		then 0
		else 
			if x=0 then 1
			else x*(factorial(x-1))
			endif
		endif