Algoritmo Leerteclado
	
	Definir n1 ,n2 , suma Como Entero
	Definir nombre, q1 Como Caracter
	
	Escribir "HOLA!, ¿CÓMO TE LLAMAS?"
	Leer nombre
	
	Escribir 'Que operacion deseas realizar? '
	Leer q1
	
	Escribir "Digite el primer numero a operar"
	Leer n1
	
	Escribir "Digite el segundo numero"
	Leer n2
	suma <- n1 + n2
	resta <- n1 - n2
	mult <-  n1 * n2
	division <- n1 / n2
	
	Si q1="suma" Entonces
		Escribir 'El resultado de la suma es ', suma
	SiNo
		Si q1="resta" Entonces
			Escribir 'El resultado de la resta es ',resta
		SiNo
			Si q1="multiplicacion" Entonces
				Escribir 'El resultado de la multiplicacion es ',mult
			SiNo
				Escribir 'El resultado de la division es ',division
			Fin Si
		Fin Si
	Fin Si

	
	
FinAlgoritmo
