main() = makeList(0,100)

makeList(a,b) = _makeList( [], a, b, a)

_makeList( list, a, b, i) = if i >b then
											list
							else
											_makeList( i -> list[i-a] , a,b, i+1)
							end if
							