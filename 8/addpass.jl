using SHA

print("username : ")
name = readline()
print("password : ")
pass = readline()
print("salt : ")
salt = readline()

hash = ( pass * salt ) |> sha2_256 |> bytes2hex

out = open("shadow","a")
    println(out,name * ":\$5\$" * salt * "\$" * hash)
close(out)