package b.eia.lambda_con_parametro;

public class LambdaTest_Operaciones {

	public static void main(String[] args) {
		
		/** Ej 1. Lamda apuntando al método imprimirOperacion de IOperaciones*/
		IOperaciones operacionSuma = (int num1,int num2)-> System.out.println("La suma es: " + (num1+num2));
		operacionSuma.imprimirOperacion(10, 2);
		
		/** Ej 2. */
		IOperaciones operacionResta = (int num1,int num2)-> System.out.println("La resta es: " + (num1-num2));
		
		LambdaTest_Operaciones lambdaTest = new LambdaTest_Operaciones();
		
		lambdaTest.misOperaciones(operacionResta, 10, 2);
		
	}
	
	public void misOperaciones(IOperaciones operacion, int num1, int num2) {
		
		operacion.imprimirOperacion(num1, num2);
	}
}
