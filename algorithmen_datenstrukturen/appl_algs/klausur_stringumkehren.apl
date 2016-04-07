# Stringumkehr : 'Hallo Welt' --> 'tleW ollaH'

main() = revert('Hallo Welt')


revert(s) = _revert(s,'',length(s)-1)

_revert(s,result,i) = 						if i=(-1)
											then result
											
											else
											_revert(s,result+s[i],(i-1))
											endif
											



