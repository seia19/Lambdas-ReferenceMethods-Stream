package c.eia.lamda_con_devolucion;

public class LambdaTesting_Calculadora {

	public static void main(String[] args) {
		
		/**Sintaxis Lambda (par�metros) -> Operaci�n o Expresi�n a evaluar*/
		calcularOperacion((x,y) -> (x+y));
		calcularOperacion((x,y) -> (x-y));
		calcularOperacion((x,y) -> (x*y));
		calcularOperacion((x,y) -> (x-y));
		
	}
	
	public static void  calcularOperacion(ICalculadora calculadora) {
		
		int x = 10, y = 5; 
		int resultadoOperacion = calculadora.Calcular(x, y);
		System.out.println("El resultado de la operacion es: " + resultadoOperacion);
		
	}
}
