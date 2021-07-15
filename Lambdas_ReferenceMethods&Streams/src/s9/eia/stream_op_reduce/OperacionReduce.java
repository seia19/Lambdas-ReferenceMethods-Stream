package s9.eia.stream_op_reduce;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class OperacionReduce {

	public static void main(String[] args) {

		
		int [] numeros ={4,6,10,12,15,55,7,8,9,10,2,5,8,9,
				 10,45,6,9,33,66,85,97,81,24,99};
		
		OptionalInt sumaNum= IntStream.of(numeros)
		                   	   .reduce(Integer::sum); //reduce todo a una operación de cada uno de los números
		 
		
		System.out.println("la suma es: " + sumaNum.getAsInt() + "\n");
		
		
		IntBinaryOperator intBinaryOperator = (num1,num2) -> Integer.sum(num1, num2);
		
		int sumaNum2 = IntStream.of(numeros)
										.reduce(intBinaryOperator)
										.getAsInt();
		
		System.out.println("la suma es: " + sumaNum2 + "\n");
		
		
		//Realizando la resta con .reduce()
		
		IntBinaryOperator intBinaryOperatorResta = (num1,num2) -> (num1-num2);

		int restaNum = IntStream.of(numeros)
				 				.reduce(intBinaryOperatorResta)
				 				.getAsInt();
		
		System.out.println("la resta de todos los números es: " + restaNum + "\n");
		
	}							

}
