package s2.eia.stream_funciones;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream_MedianteFunciones_m_limit {

	public static void main(String[] args) {

						/** -- M�todos iterate() & limit() --*/
		
		/*Sintaxis: iterate(T seed, UnaryOperator<T> T)
		 			long(long maxSize)
		 
		 El m�todo .iterate() devuelve un stream INFINITO,
		 secuencial y ordenado a trav�s de una iteraci�n. 
		 Debido a que este stream es infinito, siempre se 
		 le debe limitar con el uso del m�todo .limit()  
		 
		 recordemos que UnaryOperator, recibe una funci�n
		 (de tipo Consumer), en la cual a trav�s de su m�todo
		 .apply() ejecutar� dicha funci�n, para devolver un resultado. 
		 */
		
		System.out.println("N�meros  del 1 al 10 \n");
		
		UnaryOperator<Long> op = (n)->n+1;
		
		Stream<Long> primerosDiez = Stream.iterate(1L, op)
										  .limit(10L);
		
//      primerosDiez.forEach(num->System.out.println(num));		
		primerosDiez.forEach(System.out::print);
		
		
		System.out.println("\n \n N�meros pares del 2 al 20 \n");
		
		Stream.iterate(1L, n->n+1)
			  .filter( n -> n%2 == 0) // indica que el residuo de la divisi�n entre 2 sea igual a0
			  .limit(10L)             //el l�mite ser� hasta que los primeros 10 elementos cumplan con la condici�n establecida en el filter
			  .forEach(System.out::println);
		
		
		System.out.println("\n \n N�meros pares despu�s de 100 \n");
		
		Stream.iterate(1L, n->n+1)
			  .filter(n->n%2==0)
			  .skip(50) //esquivar� los primeros 50 elementos que cumplan con la condicion del filter
			  .limit(10)
			  .forEach(System.out::println);

	}

}
