public class TableroSudokuBase implements ReglasTableroBase{

	protected int [][]tableroSudokuBase;
	public int tamanoSudoku = 9;

	public TableroSudokuBase(){
		tableroSudokuBase= new int[tamanoSudoku][tamanoSudoku];
		inicializartableroSudokuBase();
		generarN();
	}

	public void inicializartableroSudokuBase(){
	  	for (int a= 0; a<tamanoSudoku; a++){
	    	for (int b= 0; b<tamanoSudoku; b++){
	     		tableroSudokuBase[a][b]= 0;
	   		}
	  	}
	}

	public void generarN(){
		int fila;
		int columna;
		  	for (int c = 1; c <= tamanoSudoku; c++){
		    	for (int d = 0; d < tamanoSudoku; d++){
		      	int auxiliar = 0;
		      		do {
		        		fila = (int) (Math.random() *tamanoSudoku);
		       			columna = (int)(Math.random() *tamanoSudoku);
		        		auxiliar++;
		          		if (auxiliar > 500) {
		            		inicializartableroSudokuBase();
		            		c = 1;
		            		d= 0;
		         		}
		      		}while (comprobarCasilla(c, fila, columna)); 
		    	introducirNumero(c, fila, columna);
		    	}
		  	}
	}

	public boolean comprobarCasilla(int numeroA, int fila, int columna){
		boolean resultado = false;
	  	if (comprobarFila(numeroA, fila)) resultado = true;
	  	if (comprobarColumna(numeroA, columna)) resultado = true;
	  	if (comprobar3x3(numeroA, fila,columna)) resultado = true;
	  	if (tableroSudokuBase[fila][columna] != 0) resultado = true;
	  	return resultado;
	}

	public boolean comprobarCero(int numeroA, int fila, int columna){
	 	return tableroSudokuBase[fila][columna] != 0;
	}

	public boolean comprobarFila(int numeroA, int fila){
		boolean resultado = false;
	  	for (int a = 0; a < tamanoSudoku; a++){
	    	if (tableroSudokuBase[fila][a] == numeroA) resultado = true;
	  	}
	  	return resultado;
	}

	public boolean comprobarColumna(int numeroA, int columna){
		boolean resultado = false;
	  		for (int b=0; b<tamanoSudoku; b++){
	    		if (tableroSudokuBase[b][columna]== numeroA) resultado= true;
	  		}
	  	return resultado;
	}

	public boolean comprobar3x3(int numeroA, int fila, int columna){
	boolean resultado = false;
		 if(fila<3){
		    if(columna<3){
		      	for (int a=0; a<3; a++){
		        	for (int b=0; b<3; b++){
		          		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		      	}
			} else if(columna<6){
		    	for (int a=0; a<3; a++){
		        	for (int b=3; b<6; b++){
		        		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		    	}
		    } else{
		    	for (int a=0; a<3; a++){
		        	for (int b=6; b<9; b++)
		        		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		      		}
		    	} 
		} else if (fila<6){
		    if(columna<3){
		      	for (int a=3; a<6; a++){
		        	for (int b=0; b<3; b++){
		          		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		      	}
		    } else if(columna<6){
		      	for (int a=3; a<6; a++){
		        	for (int b=3; b<6; b++){
		          		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		      	}
		    } else{
		      	for (int a=3; a<6; a++){
		        	for (int b=6; b<9; b++)
		        		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		      		}
		    	} 
		} else {
		    if(columna<3){
		     	for (int a=6; a<9; a++){
		        	for (int b=0; b<3; b++){
		          		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		      	}
		    } else if(columna<6){
		      	for (int a=6; a<9; a++){
		        	for (int b=3; b<6; b++){
		          		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		        	}
		      	}
		    } else{
		      	for (int a=6; a<9; a++){
		        	for (int b=6; b<9; b++)
		        		if (tableroSudokuBase[a][b]==numeroA) resultado=true;
		      		}
		    	} 
		 }
		return resultado;
	}

	public void introducirNumero(int numeroA, int fila, int columna){
	 	tableroSudokuBase[fila][columna]=numeroA;
	}

	public void mostrarTableroSudokuBase(){
	 	for(int a=0; a<tamanoSudoku; a++){
	    	for (int b=0; b<tamanoSudoku; b++){
	      		System.out.print(tableroSudokuBase[a][b] + " | ");
	    	}
	    	System.out.println("");
	  	}
	}
}
