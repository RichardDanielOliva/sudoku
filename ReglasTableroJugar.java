public interface ReglasTableroJugar{ //Metodos indispensables para generar el tablero que servira de base para todo el juego.
	void generarTableroParaJugar(int dificultad); //Metodo, que en base al TableroSudokuBase, genera el tablero que sera mostraro al usuario. La variable dificultad estipula el numero de casillas que se mostraran al usuario.
	void mostrarTableroSudokuJugar();
}