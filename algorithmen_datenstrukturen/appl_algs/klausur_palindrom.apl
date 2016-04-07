# Stringumkehr : 'Hallo Welt' --> 'tleW ollaH'

main() = pali('OTTO')

pali(s) = _pali(s,revert(s),0)

_pali(s,t,i) = 		if(i<length(s))


					then
							if s[i] != t[i]
							then false
							else
								_pali(s,t,i+1)
							endif
					else
					true		
							
					endif

revert(s) = _revert(s,'',length(s)-1)

_revert(s,result,i) = 						if i=(-1)
											then result
											
											else
											_revert(s,result+s[i],(i-1))
											endif
											



