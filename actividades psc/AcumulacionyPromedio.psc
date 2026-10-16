Algoritmo AcumulacionyPromedio
    Definir num, suma, contador Como Real
    Definir promedio Como Real
	
    suma <- 0
    contador <- 0
    Escribir "Ingrese su numero (Negativo para terminar):"
    Leer num
	
    Mientras num >= 0 Hacer
        suma <- suma + num
        contador <- contador + 1
		
	 Escribir "Ingrese su siguiente numero (Negativo para terminar):"
	 Leer num
    FinMientras
	
    Escribir "La suma total es: ", suma
	
    Si contador > 0 Entonces
        promedio <- suma / contador
        Escribir "El promedio es: ", promedio
    FinSi
FinAlgoritmo
