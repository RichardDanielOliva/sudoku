# Sudoku
## Descripción y contexto 
Conjunto de funcionalidades que permiten jugar al Sudoku a través del terminal de un ordenador mediante el ProgramaSudoku.java. Además,  permite resolver cualquier tipo de Sudoku utilizando la clase ResolverSudoku.java

## Guía de instalación
Solo necesitamos el Java Development Kit y listo, a jugar! Para su descarga libre desde la web de Oracle (version 8u191): https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

## Guía de usuario

#### Para jugar: 
1. Ejecutar el ProgramaSodoku.java. 

![GitHub Logo](/images/1.png)

2. Selecciona la dificultad. (esta viene dada por el numero de casillas visibles al inicializar el tablero).



3. A jugar!: 
	- Selecciona el número que quieres introducir. Entre el 1-9
	
	
	
	- Selecciona una coordenada: Primero la fila (una letra entre la A-I) seguido del numero de la columna (entre 0-8).
    - Para terminar: El Juego termina automaticamente al completar todas las casilla. 	
    	- Para rendirse: selecciona 0 al momento de introducir un número.

#### Para resolver cualquier Sudoku: 
1. Creamos un objeto del tipo ResolverSudoku.
2. Debemos pasarle como parametro una matriz de enteros de tamaño 9x9. 
	- Si queremos ver los datos introducidos ejecutamos mostrarTableroSudokuBase(). 
3. Ejecutamos el metodo resolver(). 
4. verificamos el resultado ejecutando mostrarTableroSudokuBase().

## Autor/es
Richard Daniel Oliva Denis. danielolivadenis@gmail.com
