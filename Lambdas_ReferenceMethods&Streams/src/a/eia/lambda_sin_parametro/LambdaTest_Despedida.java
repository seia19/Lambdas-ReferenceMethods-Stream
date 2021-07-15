/**                Uso de expresión Lambda - sin parámetro -
 
  Sintaxis Lamda: (parámetro) -> Operación o Expresión a realizar*/

package a.eia.lambda_sin_parametro;

public class LambdaTest_Despedida {

	static LambdaTest_Despedida lambdaTesting = new LambdaTest_Despedida();

	// Expresión Lambda: Apunta al método abstracto .bye() de IFunctionTestDespedida
	static IFunctionTestDespedida ftd = () -> System.out.println("¡Nos vemos! (^.^) ");

	
	public static void main(String[] args) {

		lambdaTesting.despidiendose(ftd);

	}

	
	public void despidiendose(IFunctionTestDespedida functionTest) {
		functionTest.bye();
	}
}
