public class ResolverSudoku{
	public int[][] auxMatriz;
	public int[][] matrizAResolver;
	private int tamanoSudoku = 9;
	private int infoComplement = 3;
	
	public ResolverSudoku(int[][] matrizAResolver){
		auxMatriz = new int[tamanoSudoku][3];
		setMatrizAResolver(matrizAResolver);
		contarTodasFaltantes();
		ordenarAuxMatriz();
	}

	public void setMatrizAResolver(int[][] matrizAResolver){
		for (int a = 0; a < tamanoSudoku; a++) {
			for (int b = 0; b < tamanoSudoku; b++) {
				this.matrizAResolver[a][b] = matrizAResolver[a][b];
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
				if (this.matrizAResolver[a][b] == numerO) auxResultado++;
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
		for
	}
}