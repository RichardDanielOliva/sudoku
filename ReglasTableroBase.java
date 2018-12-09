public interface ReglasTableroBase{ //Metodos indispensables para generar el tablero que servira de base para todo el juego.
	void generarN(); //Metodo para generar numeros en posiciones aleatorias.
	boolean comprobarFila(int numeroA, int fila); //Metodo para comprobar que el numeroA no se repita en la fila
	boolean comprobarColumna(int numeroA, int columna); //Metodo para comprobar que el numeroA no se repita en la Columna
	boolean comprobar3x3(int numeroA, int fila, int columna); //Metodo para comprobar que el numeroA no se repita en la matriz 3 x 3 donde se ubica
	void mostrarTableroSudokuBase();
}