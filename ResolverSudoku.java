public class ResolverSudoku extends TableroSudokuBase{
	public int[][] auxMatriz;
	public int[][] matrizAResolver;
	private int tamanoSudoku = 9;
	private int infoComplement = 3;
	
	public ResolverSudoku(int[][] matrizAResolver){
		auxMatriz = new int[tamanoSudoku][3];
		this.matrizAResolver = new int[tamanoSudoku][tamanoSudoku];
		setMatrizAResolver(matrizAResolver);
		setMatrizTableroSudoku();
		contarTodasFaltantes();
		ordenarAuxMatriz();
	}

	public void setMatrizAResolver(int[][] matrizAResolver2){
		for (int a = 0; a < tamanoSudoku; a++) {
			for (int b = 0; b < tamanoSudoku; b++) {
				this.matrizAResolver[a][b] = matrizAResolver2[a][b];
			}
		}
	}

	public void setMatrizTableroSudoku(){
		for (int a = 0; a < tamanoSudoku; a++) {
			for (int b = 0; b < tamanoSudoku; b++) {
				this.tableroSudokuBase[a][b] = this.matrizAResolver[a][b];
			}
		}
	}

	public void contarTodasFaltantes(){
		for (int a = 1; a <= 9; a++) {
			auxMatriz[a-1][0] = a;
			auxMatriz[a-1][1] = this.contarFaltantes(a);
		}
	}

	public int contarFaltantes(int numerO){
		int resultado;
		int auxResultado = 0;
		for (int a = 0; a < tamanoSudoku; a++) {
			for (int b = 0; b < tamanoSudoku; b++) {
				if (this.tableroSudokuBase[a][b] == numerO) auxResultado++;
			}
		}
		resultado = tamanoSudoku - auxResultado;
		return resultado;
	}

	public void ordenarAuxMatriz(){
		int aux0;
		int aux1;
		for (int a = 0; a < (tamanoSudoku-1); a++) {
			for (int b = 0; b < (tamanoSudoku-1); b++) {
				if (auxMatriz[b][1] > auxMatriz[b+1][1] ){
					aux0 = auxMatriz[b+1][0];
					aux1 = auxMatriz[b+1][1];
					auxMatriz[b+1][0]=auxMatriz[b][0];
					auxMatriz[b+1][1]=auxMatriz[b][1];
					auxMatriz[b][0]= aux0;
					auxMatriz[b][1]= aux1;
				}
			}
		}
	}

	public void resolver(){
		int fila;
		int columna;
		for (int c = 0; c < tamanoSudoku; c++){
		    for (int d = 0; d < (auxMatriz[c][1]); d++){
		    int auxiliar = 0;
		      	do {
		        	fila = (int) (Math.random() *tamanoSudoku);
		       		columna = (int) (Math.random() *tamanoSudoku);
		        	auxiliar++;
		          	if (auxiliar > 500) {
		            	setMatrizTableroSudoku(); //corregir
		            	c = 1;
		            	d= 0;
		         		}
		      		}while (comprobarCasilla(auxMatriz[c][0], fila, columna)); 
		    introducirNumero(auxMatriz[c][0], fila, columna);
		    }
		}
	}
}