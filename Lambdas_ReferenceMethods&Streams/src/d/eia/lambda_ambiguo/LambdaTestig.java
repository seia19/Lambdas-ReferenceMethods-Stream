		/** 
		 Existe ambig�edad por inferencia, cuando un m�todo est� 
		 haciendo apuntando a dos o m�s posibles interfaces como 
		 posibles candidatos. Esto es, por que en la inferencia
		 no es necesario declarar el tipo de dato, sin embargo,
		 esto da la posibilidad de error por inferencia, cuando
		 un m�todo se encuentra sobrecargado, por lo que al hacer
		 una llamada a dicho m�todo, utilizando expresiones lambdas, 
		 la m�quina virtual de java no sabr� exactamente a cu�l de 
		 las dos interfaces es la que se debe utilizar.
		 
		 Esto dar� lugar a un error de compilaci�n:
		 
		     ' The method... is ambiguous.' 
		  
		 */

package d.eia.lambda_ambiguo;

public class LambdaTestig {

	public static void main(String[] args) {


		
		
		//operacionEngine((x,y)-> (x+y)); //--> Ambig�edad en la inferencia del m�todo sobrecargado 
		
		ICalculadora_int cal_int = ((x,y)-> (x+y));
		operacionEngine(cal_int);
		
		ICalculator_long cal_long = ((x,y) -> (x-y));
		operacionEngine(cal_long);
		
	}
	
	public static void operacionEngine(ICalculadora_int cal) {
		int x=10, y = 5;
		System.out.println(cal.calcular(x, y));
		
	}
	
	public static void operacionEngine(ICalculator_long cal) {
		
		long x=10, y = 5;
		System.out.println(cal.calcular(x, y));
	}

}
