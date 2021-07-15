package s4.eia.stream_strings;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Stream_String_Main2 {

	public static void main(String[] args) {

		System.out.println("Introduce un Nombre Completo & Números");
		
		Scanner scaneo = new Scanner(System.in);
		String lecturaEntrada = scaneo.nextLine();
		
		
		System.out.println("\n"+"Quitando números y espacios..." + "\n");
		
										//   Devuelve todos aquellos chars que No sean Digitos y que No sean espacios en blanco
		IntPredicate quitaEspaciosYNumeros = (n->!Character.isDigit((char)n) && !Character.isWhitespace((char)n));
		
		IntStream secuenciaDatosConFiltro = lecturaEntrada.chars().filter(quitaEspaciosYNumeros);
		
		System.out.println("\n" + "Mostrando los caracteres del nombre introducido" + "\n" );
	
		secuenciaDatosConFiltro.forEach(n->System.out.print((char)n));
	
		scaneo.close();
	}

}
