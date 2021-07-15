package n.eia.in_unaryoperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class UnaryOperation_Test {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		UnaryOperator<Integer> operacionUnary = x -> x*x;
		
		List<Integer> listaActualizada = miOperadorUnary(operacionUnary,listaNumeros); 
	
								 
		listaActualizada.forEach(la-> System.out.println(la));
	
		 /*el método .forEach de la interfaz Iterable, recibe un objeto de tipo consumer
		   el cual se expresa a través de una expresión lambda y que es tratado internamente
		 por el método .accept() para generar el resultado proveniente de dicha expresión.*/
	}
	
	
	public static List<Integer> miOperadorUnary (UnaryOperator<Integer> unOp,
											 List<Integer> listaNum){
		
		List<Integer> listaNumActualizada = new ArrayList<Integer>();
		
		Consumer<Integer> consumer = num->listaNumActualizada.add(unOp.apply(num));
		
		                 //consumer.apply() <-- internamente JVM ejecuta el método .apply()
		listaNum.forEach(consumer);
		
		return listaNumActualizada;
		
	}
}
