package l.eia.in_biconsumer;

import java.util.function.BiConsumer;

public class BiconsumerTest {

	public static void main(String[] args) {

		
		BiConsumer<Double, Double> biC = (num1,num2)->{
				
				double multi = num1*num2;
				System.out.println("El resultado de la multiplicación de " 
				                    + num1 + " & " + num2 + " es: " + multi);
		};
														
		biC.accept(2.0, 5.0);
	}

}
