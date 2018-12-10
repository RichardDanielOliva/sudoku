# Sudoku
Descripción y contexto
  Conjunto de funcionalidades que permiten por un lado, jugar al Sudoku através del terminal del ordenador mediante el ProgramaSudoku.java y por otro lado resolver cualquier tipo de Sudoku mediante la clase ResolverSudoku.java

Guía de usuario
 1.  Para jugar:
    1.1 Ejecutar el ProgramaSodoku.java.
    1.2. Selecciona la dificultad. (esta viene dada por el numero de casillas que seran dadas al inicializar el tablero).
    1.3 A jugar!:
      1.3.1 Selecciona el número que quieres introducir. Entre el 1-9 
      1.3.2 Selecciona una coordenada. Primero la fila, una letra entre la A-I, seguido del numero de la columna (entre 0-8). Ejemplos: A0, I8.  
    1.4. Para terminar:
      El Juego termina automaticamente al completar todas las casilla.
      1.4.1 Para rendirse: selecciona 0 al momento de introducir de introducir un número.
 2. Para resolver cualquier Sudoku:
    2.1 Creamos un objeto del tipo ResolverSudoku.
      2.1.1 Debemos pasarle como parametro una matriz de enteros de tamaño 9x9.
      2.1.2 si queremos ver los datos introducidos ejecutamos mostrarTableroSudokuBase().
    2.1 Ejecutamos el metodo resolver().
    2.3 verificamos el resultado ejecutando mostrarTableroSudokuBase().
    
Guía de instalación
  Solo necesitamos el Java Development Kit y listo, a jugar! Para su descarga libre desde la web de Oracle (version 8u191): https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Autor/es
Richard Daniel Oliva Denis. Correo: danielolivadenis@gmail.com

Cómo contribuir
Esta sección explica a desarrolladores cuáles son las maneras habituales de enviar una solicitud de adhesión de nuevo código (“pull requests”), cómo declarar fallos en la herramienta y qué guías de estilo se deben usar al escribir más líneas de código. También puedes hacer un listado de puntos que se pueden mejorar de tu código para crear ideas de mejora.

Código de conducta
El código de conducta establece las normas sociales, reglas y responsabilidades que los individuos y organizaciones deben seguir al interactuar de alguna manera con la herramienta digital o su comunidad. Es una buena práctica para crear un ambiente de respeto e inclusión en las contribuciones al proyecto.

La plataforma Github premia y ayuda a los repositorios dispongan de este archivo. Al crear CODE_OF_CONDUCT.md puedes empezar desde una plantilla sugerida por ellos. Puedes leer más sobre cómo crear un archivo de Código de Conducta (aquí)[https://help.github.com/articles/adding-a-code-of-conduct-to-your-project/]

Licencia
LICENCIA

La licencia especifica los permisos y las condiciones de uso que el desarrollador otorga a otros desarrolladores que usen y/o modifiquen la herramienta digital.

Incluye en esta sección una note con el tipo de licencia otorgado a esta herramienta digital. El texto de la licencia debe estar incluído en un archivo LICENSE.md o LICENSE.txt en la carpeta raíz.

Si desconoces qué tipos de licencias existen y cuál es la mejor para cada caso, te recomendamos visitar la página https://choosealicense.com/.
