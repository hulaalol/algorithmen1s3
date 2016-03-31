main() = euk(63,27)

euk(x,y) = 	if x<1 or y<1 then
				'ERROR'
			else
				if x=y 
				then x
				
				else 
					if y>x 
					then euk(y,x)
					else euk(x-y,y)
					endif
				endif
			endif
			