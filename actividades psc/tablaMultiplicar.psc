Algoritmo tablaMultiplicar
	definir num, i, resultado como real
	Escribir "Digite su numero entero"
	leer N
	Para i<-1 Hasta 10 Hacer
		resultado<- N*i
		Escribir N, " x ", i, " = ", resultado
		
		si resultado MOD 2=0 Entonces
			contadorPares<- contadorPares+1
		FinSi
	Fin Para
	Escribir "Cantidad de resultado pares: ", contadorPares
FinAlgoritmo
