	 /**                Uso de expresión Lambda - sin parámetro -
	  
	   Sintaxis lamda: (parámetro) -> Operación o Expresión a realizar*/

package a.eia.lambda_sin_parametro;


public class LambdaTest_Saludo {

	 public static void main(String[] args) {
		 
		 //Expresión Lambda: Apunta al método abstracto .saludar() de IFunctionTestSaludo
		 IFunctionTestSaludo ft = ()-> System.out.println("¡Hola mundo desde Lambda! n.n");
		 
		 //Invocando el método abstracto .saludar()
		 ft.saludar();
		 
	/*  
	 	  Al utilizar una función Lambda para la llamada a sus métodos,
		  esta sólo puede tener un único método abstracto (aquel método 
		  que NO tiene implementación)
	 */
		 
	}
	 
}
