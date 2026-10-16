Algoritmo calculadoraBasica
	definir suma,resta,multiplicacion,division, num1, num2 como reales
	definir operacion Como Caracter
	escribir" DIgite su numero 1"
	leer num1
	escribir" DIgite su numero 2"
	leer num2
	Escribir "eliga su tipo de operacion :"
	Escribir "suma"
	Escribir "resta"
	Escribir "multiplicacion"
	Escribir "division"
	leer operacion
	si operacion="suma" Entonces
		suma=num1+num2
		escribir"su resultado es ",suma
	FinSi
	si operacion="resta" Entonces
		resta=num1-num2
		escribir"su resultado es ",resta
	FinSi
	si operacion="multiplicacion" Entonces
		multiplicacion=num1*num2
		escribir"su resultado es ",multiplicacion
	FinSi
	si operacion="division" Entonces
		division=num1/num2
		escribir"su resultado es ",division
	FinSi
FinAlgoritmo
