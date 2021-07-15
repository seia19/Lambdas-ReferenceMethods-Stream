package s2.eia.stream_funciones;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream_MedianteFunciones_m_limit {

	public static void main(String[] args) {

						/** -- Métodos iterate() & limit() --*/
		
		/*Sintaxis: iterate(T seed, UnaryOperator<T> T)
		 			long(long maxSize)
		 
		 El método .iterate() devuelve un stream INFINITO,
		 secuencial y ordenado a través de una iteración. 
		 Debido a que este stream es infinito, siempre se 
		 le debe limitar con el uso del método .limit()  
		 
		 recordemos que UnaryOperator, recibe una función
		 (de tipo Consumer), en la cual a través de su método
		 .apply() ejecutará dicha función, para devolver un resultado. 
		 */
		
		System.out.println("Números  del 1 al 10 \n");
		
		UnaryOperator<Long> op = (n)->n+1;
		
		Stream<Long> primerosDiez = Stream.iterate(1L, op)
										  .limit(10L);
		
//      primerosDiez.forEach(num->System.out.println(num));		
		primerosDiez.forEach(System.out::print);
		
		
		System.out.println("\n \n Números pares del 2 al 20 \n");
		
		Stream.iterate(1L, n->n+1)
			  .filter( n -> n%2 == 0) // indica que el residuo de la división entre 2 sea igual a0
			  .limit(10L)             //el límite será hasta que los primeros 10 elementos cumplan con la condición establecida en el filter
			  .forEach(System.out::println);
		
		
		System.out.println("\n \n Números pares después de 100 \n");
		
		Stream.iterate(1L, n->n+1)
			  .filter(n->n%2==0)
			  .skip(50) //esquivará los primeros 50 elementos que cumplan con la condicion del filter
			  .limit(10)
			  .forEach(System.out::println);

	}

}
