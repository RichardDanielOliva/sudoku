import java.util.Scanner;
public class ProgramaSudokuResolver extends MetodosParaJugar {
	public static void main(String[] args) {
		inicializar();
		ResolverSudoku resolver = new ResolverSudoku(juego1.tableroParaJugar);
		resolver.mostrarTableroSudokuBase();
		resolver.resolver();
		System.out.println("");
		resolver.mostrarTableroSudokuBase();
	}
}