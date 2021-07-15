/**
 	La interfaz Bifunction recibe dos par�metro gen�ricos
 	y genera un Resultado tambi�n gen�rico
 	
 	sintaxis:
 	BiFunction<T, U, R>
 	
 	para ello se basa en el uso de su m�todo .apply()
 	
 
  */

package g.eia.in_bifunction;

import java.util.function.BiFunction;

public class EjercicioBiFunction {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> biFun = (x,y) -> (x+y); 
	
		String conversion = biFun.apply("Hola mundo "," utilizando bifunction");
	
		System.out.println(conversion);
	}
}
