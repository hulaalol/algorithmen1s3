main() = russe(45,19,0,0)


russe(x,y,r,f) = 	if x=1
					then r

							if f=0 then
				
								if x%2=0 
								then
								russe(x/2,y*2,r+y,1)
					
								else 
								then
								russe(x/2,y*2,r+y,0)
					
								endif
				
							else
								then
				
								if x%2=0
								then
								russe(x/2,y*2,r,1)
					
								else
								then
								russe(x/2,y*2,r,0)
								
								endif
					
							endif
					
				
				








