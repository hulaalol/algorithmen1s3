main() = sqroot(4)


sqroot(n) = _sqroot(n,1,2,3)


_sqroot(n,u,zwei,o) = if n>1 then


					if (u+o)/2 > zwei then
						_sqroot(n-1,u,zwei,((u+o)/2))
					else
						_sqroot(n-1,((u+o)/2),zwei,o)
					endif
					
					else
					((u+o)/2)
					endif




