/**
 	Sintaxis: Predicate<T>
 	
 		La interfaz Predicate representa un 'predicado' que ser� 
 	evaluado como una expresi�n boolean.
 
 * */

package h.eia.in_predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {

		//Evaluando si el n�mero es mayor a cero
		Predicate<Integer> predicado = (Integer valor) -> valor>0; 
		
		System.out.println(predicado.test(19)); //devuleve true porque 19>0
		                                       
	}

}
