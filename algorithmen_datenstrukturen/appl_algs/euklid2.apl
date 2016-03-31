main() = euk(1000,245000,1)

euk(x,y,cnt) = 	if x=0
			then [y,cnt]
			else
						if y>x 
						then euk(y,x,cnt+1)
						else euk(x%y,y,cnt+1)
						endif
			endif