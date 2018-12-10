import java.util.Scanner;
import java.util.InputMismatchException;
public class MetodosParaJugar{
	public static TableroSudokuJugar juego1;
	private static final int DIF_DEFECTO = 17;
	private static final int DIF_EXPERTO = 23;
	private static final int DIF_DIFICIL = 30;
	private static final int DIF_NORMAL = 40;
	private static final int DIF_FACIL = 50;
	private static final int DIF_MUY_FACIL = 60;
	private static final int TAMSUDOKU = 9;
	private static int auxProxima = 81;

	public static void inicializar(){
		int nDificultad = seleccionDificultad();
		auxProxima -= nDificultad;
		juego1 = new TableroSudokuJugar(nDificultad);
	}

	public static int seleccionDificultad(){
		Scanner teclado = new Scanner (System.in);
		int resultado = 0;

		System.out.println("Selecciona el nivel de dificultad: \n1.Experto \n2.Dificil \n3.Normal \n4.Facil \n5.Muy Facil");
		
		try {
			int nDificultad = teclado.nextInt();
			resultado = auxDificultad(nDificultad);
		} catch (DificultadIncorrecta e1) {
			System.out.println(e1.getMessage());
			resultado = DIF_DEFECTO;
		} catch (InputMismatchException e2) {
	 		System.out.println("Solo se admiten numeros enteros. Se asignara la dificultad por defecto");
	 		resultado = DIF_DEFECTO;
		}

		return resultado;
	}

	private static int auxDificultad(int nDificultad) throws DificultadIncorrecta{
		int resultado;

		if (nDificultad<0 || nDificultad >5) throw new DificultadIncorrecta("Numero no valido. Se asignara la dificultad por defecto");

		switch (nDificultad){
			case 1: resultado = DIF_EXPERTO;
				break;
			case 2: resultado = DIF_DIFICIL;
				break;
			case 3: resultado = DIF_NORMAL;
				break;
			case 4: resultado = DIF_FACIL;
				break;
			case 5: resultado = DIF_MUY_FACIL;
				break;
			default: resultado = DIF_DEFECTO;
		}
		return resultado;
	}

	public static void mostrarTableroSudokuBase(){
		System.out.println("Tablero resuelto:");
		juego1.mostrarTableroSudokuBase();
	}

	public static void mostrarTableroSudokuJugar(){
		String coordenadaColumna = "  0   1   2   3   4   5   6   7   8  ";
		char coordenadaFila ='A';

		System.out.println("Tablero");
		System.out.println(coordenadaColumna);
	 	for(int a = 0; a < (TAMSUDOKU); a++){
	 		System.out.print(coordenadaFila + " ");
	    	for (int b = 0; b < (TAMSUDOKU); b++){
	      		if (juego1.tableroParaJugar[a][b] != 0) System.out.print(juego1.tableroParaJugar[a][b]); 
	      		else System.out.print(" ");
	      		System.out.print(" | ");
	    	}
	  		System.out.println("");
	  		coordenadaFila++;
  		}
	}

	public static int pedirNumeroTeclado() throws NumeroNoValidoParaJugar{ 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresa un numero o pulse cero para rendirse");
		int resultado = teclado.nextInt();
		if (resultado<0 || resultado>9) {
			throw new NumeroNoValidoParaJugar("Numero no valido para jugar, ingrese un valor entre 1 - 9");
		}
		return resultado;
	}

	public static String pedirCoordenadaTeclado() throws CoordenadaIncorrecta{ 
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresa una coordenada");
		String resultado = teclado.nextLine();
		resultado = resultado.toUpperCase();

		int fila = resultado.charAt(0) - 'A';
		if (fila>8) throw new CoordenadaIncorrecta("Coordenada incorrecta, fila no valida");
		String auxColumna = resultado.substring(1);
		int columna = Integer.parseInt(auxColumna);
		if (columna>8) throw new CoordenadaIncorrecta("Coordenada incorrecta, columna no valida");
		
		return resultado;
	}

	public static boolean comprobarValor(int numIng, int fila, int columna){
		return juego1.tableroSudokuBase[fila][columna] == numIng;
	}

	public static void insertarValor(int numIng, int fila, int columna){
		juego1.tableroParaJugar[fila][columna] = numIng;
	}

	public static void jugar(){
		while(auxProxima > 0){
			mostrarTableroSudokuJugar();
			try{
				int numIng = pedirNumeroTeclado();
				if (numIng != 0){
					try {
						String coorTablero = pedirCoordenadaTeclado();
						int fila = coorTablero.charAt(0) - 'A';
						String auxColumna = coorTablero.substring(1);
						int columna = Integer.parseInt(auxColumna);
						if (comprobarValor(numIng, fila, columna)) insertarValor(numIng, fila, columna);
							else System.out.println("Incorrecto, prueba otro numero");
						auxProxima--;
					} catch (CoordenadaIncorrecta e5){
						System.out.println(e5.getMessage());
					}
				} else{
					auxProxima = 0;
					mostrarTableroSudokuBase();
				}
			} catch(NumeroNoValidoParaJugar e3){
				System.out.println(e3.getMessage());
			} catch(InputMismatchException e4){
				System.out.println("Solo se permite numero enteros entre 1 - 9");
			}
		}
	}
}