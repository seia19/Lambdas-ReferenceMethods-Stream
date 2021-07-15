		/** 
		 Existe ambigüedad por inferencia, cuando un método está 
		 haciendo apuntando a dos o más posibles interfaces como 
		 posibles candidatos. Esto es, por que en la inferencia
		 no es necesario declarar el tipo de dato, sin embargo,
		 esto da la posibilidad de error por inferencia, cuando
		 un método se encuentra sobrecargado, por lo que al hacer
		 una llamada a dicho método, utilizando expresiones lambdas, 
		 la máquina virtual de java no sabrá exactamente a cuál de 
		 las dos interfaces es la que se debe utilizar.
		 
		 Esto dará lugar a un error de compilación:
		 
		     ' The method... is ambiguous.' 
		  
		 */

package d.eia.lambda_ambiguo;

public class LambdaTestig {

	public static void main(String[] args) {


		
		
		//operacionEngine((x,y)-> (x+y)); //--> Ambigüedad en la inferencia del método sobrecargado 
		
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
