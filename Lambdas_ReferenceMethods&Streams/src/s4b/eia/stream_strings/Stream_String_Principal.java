package s4b.eia.stream_strings;

import java.util.regex.Pattern;

public class Stream_String_Principal {

	public static void main(String[] args) {
			
				/** Uso del método splitAsStream() & compile() de la clase Pattern*/
		
	
		String str= "HTML, CSS, JavaScript, - Angular, Java, Spring";
		
		Pattern.compile(" - ")
			   .splitAsStream(str)
			   .forEach(System.out::println);
		
		String str2="Eia Seia Eiata . 19";
		Pattern.compile(" . ")
			   .splitAsStream(str2)
			   .forEach(System.out::println);
			   
		String str3 ="Alemania, Francia, España, Inglaterra, Suecia, Italia, Japón, EU, China, Rusia, Portugal";
		Pattern.compile(", ")
				.splitAsStream(str3)
				.forEach(System.out::println);
		
	/*el método .compile() recibe una expresión regular y lo convierte en un patrón
      a identificar mediante un flag*/
	}

}
