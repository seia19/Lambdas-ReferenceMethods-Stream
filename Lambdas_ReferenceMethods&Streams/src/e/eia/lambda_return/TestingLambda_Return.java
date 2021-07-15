package e.eia.lambda_return;

public class TestingLambda_Return {

	public static void main(String[] args) {

		TestingLambda_Return tl = new TestingLambda_Return();
		
		System.out.println("Resultado = " + (tl.engineCalc().calcular(10, 9)) + ".");
	}
	
	public ICalculadora_int engineCalc() {
		
		return ((x,y) -> (x+y));
	}
}
