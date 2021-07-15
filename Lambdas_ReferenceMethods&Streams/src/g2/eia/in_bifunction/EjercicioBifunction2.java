package g2.eia.in_bifunction;

import java.util.function.BiFunction;

public class EjercicioBifunction2 {

	public static void main(String[] args) {
		Convertidor_Calculadora calculadora = new Convertidor_Calculadora();
		
		BiFunction<Integer, Integer, String> operacion = (x,y)->"Str:" + (x*y);
		
		//se realiza la operación x*y -> 1*9 y se convierte a string
		String resultado = calculadora.Convertir(operacion, 1, 19);
	
		System.out.println("El resultado de la operación convertida a String es: " + resultado);
		System.out.println("caracteres -String- utilizados : " + resultado.length());
		
		for (int i=0;i<resultado.length(); i++) {
			System.out.println("caracter"+i+": "+resultado.charAt(i));
		}
	}
}
