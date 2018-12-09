public class TableroSudokuJugar extends TableroSudokuBase implements ReglasTableroJugar{
	int [][] tableroParaJugar;
	public int tamanoSudoku = 9;
	private final int DIF_DEFECTO = 17;

	public TableroSudokuJugar(){
		tableroParaJugar= new int [tamanoSudoku][tamanoSudoku];
		generarTableroParaJugar(DIF_DEFECTO);
	}

	public TableroSudokuJugar(int nDificultad){
		tableroParaJugar= new int [tamanoSudoku][tamanoSudoku];
		generarTableroParaJugar(nDificultad);
	}

	public boolean comprobarCasillaJugar(int numeroA, int fila, int columna){
		boolean resultado = false;
			if (tableroSudokuBase[fila][columna] == numeroA) resultado = true;
		return resultado;
	}
	
	public void generarTableroParaJugar(int dificultad){
		int fila;
		int columna;

		for (int a = 0; a < dificultad; a++) {
			 do {
		        fila = (int) (Math.random() * tamanoSudoku);
		        columna = (int) (Math.random() * tamanoSudoku);
     		 } while (auxComprobarCasilla(fila, columna)); 
     		introducirNumeroJugar(fila, columna);
		}
	}
	
	public boolean auxComprobarCasilla (int fila, int columna){
		return (tableroParaJugar[fila][columna] != 0);
	}

	public void introducirNumeroJugar (int fila, int columna){
		tableroParaJugar[fila][columna] = tableroSudokuBase[fila][columna];
	}

	public void mostrarTableroSudokuJugar(){
	 	for(int a=0; a<tamanoSudoku; a++){
	    	for (int b=0; b<tamanoSudoku; b++){
	      		if (tableroParaJugar[a][b] != 0) System.out.print(tableroParaJugar[a][b]); 
	      		else System.out.print(" ");
	      		System.out.print(" | ");;
	    	}
	  		System.out.println("");
  		}
	}
}