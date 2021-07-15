package s4.eia.stream_strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream_Strings_Main {

	public static void main(String[] args) {
		
		System.out.println("Introduce un nombre para ver su secuencia numérica");
		
		Scanner escaner = new Scanner(System.in);
		String entrada = escaner.nextLine();
		
		IntStream streamChars = entrada.chars(); //método .chars() proviene de In_CharSequence
		streamChars.forEach(System.out::println);
		
		escaner.close();
		
	}
}
