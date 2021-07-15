	 /**                Uso de expresi�n Lambda - sin par�metro -
	  
	   Sintaxis lamda: (par�metro) -> Operaci�n o Expresi�n a realizar*/

package a.eia.lambda_sin_parametro;


public class LambdaTest_Saludo {

	 public static void main(String[] args) {
		 
		 //Expresi�n Lambda: Apunta al m�todo abstracto .saludar() de IFunctionTestSaludo
		 IFunctionTestSaludo ft = ()-> System.out.println("�Hola mundo desde Lambda! n.n");
		 
		 //Invocando el m�todo abstracto .saludar()
		 ft.saludar();
		 
	/*  
	 	  Al utilizar una funci�n Lambda para la llamada a sus m�todos,
		  esta s�lo puede tener un �nico m�todo abstracto (aquel m�todo 
		  que NO tiene implementaci�n)
	 */
		 
	}
	 
}
