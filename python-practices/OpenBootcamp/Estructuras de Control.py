a = 5
b = 6
c = 7
resultado = a > 5 and c < 7

# Resultado = (false and c<7)
# Resultado = (false and false)
# Resultado = (False)

# print(resultado)

# AND -> True, False Tabla de verdad And
print("Truth table AND")
print("T and T =", True and True)
print("T and F =", True and False)
print("F and T =", False and True)
print("F and F =", False and False)

print()
# OR -> True, False Tabla de verdad OR

print("Truth table OR")
print("T or T =", True or True)
print("T or F =", True or False)
print("F or T =", False or True)
print("F or F =", False or False)

print()
# OR -> True, False Tabla de verdad OR
print("Truth table XOR")
print("T xor T =", True ^ True)
print("T xor F =", True ^ False)
print("F xor T =", False ^ True)
print("F xor F =", False ^ False)


a = 5
b = 6
c = 7

resultado = (a >= 5 or c > 7) and (b == 5)
print(resultado)
