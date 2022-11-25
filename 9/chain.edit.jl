using SHA
old_hash = ""
data = "000000d7d0d4c2443c434b96be61ab1e6ad8f4ec81938b87da53ffbc3016138e
urokodaki: 10000
monkey: 100

"
zeros = 6
start = 100000000
for nonce in start:start+600000000
  base = old_hash * data * string(nonce)
  hash = base |> sha2_256 |> bytes2hex
  if( hash[1:zeros] == "0" ^ zeros )
    string(nonce) * " : " * hash |> println
    break
  end
  if( nonce%1000000 == 0 )
     nonce |> string |> println
  end
end

