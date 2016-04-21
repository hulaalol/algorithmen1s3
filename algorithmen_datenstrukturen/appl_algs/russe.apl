main() = russe(1270,282,0,0)


russe(x,y,r,f) = 	if x=1
					then (r+y)
					else
							if f=0 then
				
								if x%2=0 
								then
								russe(x//2,y*2,r+y,0)
								else 
								russe(x//2,y*2,r+y,1)
								endif
				
							else
					
								if x%2 = 0 then
								russe(x//2,y*2,r,0)
								else
								russe(x//2,y*2,r+y,1)
								endif
					
							endif
						endif
						
					
				
				








