/**                Uso de expresi�n Lambda - sin par�metro -
 
  Sintaxis Lamda: (par�metro) -> Operaci�n o Expresi�n a realizar*/

package a.eia.lambda_sin_parametro;

public class LambdaTest_Despedida {

	static LambdaTest_Despedida lambdaTesting = new LambdaTest_Despedida();

	// Expresi�n Lambda: Apunta al m�todo abstracto .bye() de IFunctionTestDespedida
	static IFunctionTestDespedida ftd = () -> System.out.println("�Nos vemos! (^.^) ");

	
	public static void main(String[] args) {

		lambdaTesting.despidiendose(ftd);

	}

	
	public void despidiendose(IFunctionTestDespedida functionTest) {
		functionTest.bye();
	}
}
