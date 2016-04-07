

main() = prim(25)

prim(n) = _prim(n,2,'')

_prim(n,start,result)= if start<n then
							
							if primtest(start,2)=true then
							_prim(n,start+1,result+start+' ')
							
							else
							_prim(n,start+1,result)
							
							endif
						
						
						else
						result
						
						endif
						


primtest(n,teiler) = if(n>teiler) then
					

							if n%teiler = 0 
								then false
							else
								primtest(n,teiler+1)
							endif
								
					else
					true
					
					endif
					













