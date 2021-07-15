/**
 	Sintaxis: Predicate<T>
 	
 		La interfaz Predicate representa un 'predicado' que será 
 	evaluado como una expresión boolean.
 
 * */

package h.eia.in_predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {

		//Evaluando si el número es mayor a cero
		Predicate<Integer> predicado = (Integer valor) -> valor>0; 
		
		System.out.println(predicado.test(19)); //devuleve true porque 19>0
		                                       
	}

}
