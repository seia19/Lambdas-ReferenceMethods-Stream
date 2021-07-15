package s2.eia.stream_funciones;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream_MedianteFunciones_m_generate {

	public static void main(String[] args) {

						/** -- M�todos generate() & limit() --*/
		
		/*Sintaxis: generate(Supplier<T> s)
		 			long(long maxSize)
		 
		 El m�todo .generate() devuelve un stream INFINITO,
		 secuencial y desordenado, debido a que este stream
		 es infinito, siempre se le debe limitar con el 
		 uso del m�todo .limit()  
		 
		 recordemos que la Interfaz Supplier, es un proveedor de recursos,
		 que NO Contiene Argumentos en la cual a trav�s de su m�todo
		 .apply() ejecutar� dicha funci�n, para devolver un resultado. 
		 */
		
		System.out.println("Generando n�meros aleatorios, limitado a 5 elementos");
		
		double numRandom = Math.random();
		Supplier<Double> supNum = ()->numRandom;
		
		Stream.generate(supNum)
			  .limit(5)
			  .forEach(System.out::println);
		
//		Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
//		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
		
					/** -- Clase Random() &  m�todo ints() --*/
		
		
		System.out.println("Generando n�meros enteros aleatorios, limitado a 5 elementos");

		Random numeros = new Random();
		
		IntStream numerosAleatorios = numeros.ints(); //.ints() -->Genera streams infinitos de una secuencia de n�meros. 
		numerosAleatorios.limit(5);
		numerosAleatorios.forEach(n->System.out.println(n));
		
//		new Random().ints().limit(5).forEach(System.out::println);
			  
		
	}

}
