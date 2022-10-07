using Gadfly
p = [1; 0; 1;]
θ = 30
r =[cosd(θ) -sind(θ) 0
sind(θ) cosd(θ) 0
0 0 1]

println(p)
println((r^1)p)
println((r^2)p)
println((r^3)p)
println((r^4)p)
println((r^5)p)
println((r^6)p)
