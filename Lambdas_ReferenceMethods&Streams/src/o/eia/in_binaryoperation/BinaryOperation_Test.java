package o.eia.in_binaryoperation;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperation_Test {
	
	public static void main(String[] args) {

	System.out.println("Utilizando método .apply() en Interfaz BinaryOperator");
		BinaryOperator<Integer> binOpe1 = (num1, num2) -> num1*num2;
		Integer resultadoBinOpe1 = binOpe1.apply(10, 20);
		System.out.println("el resultado es: " + resultadoBinOpe1 + "\n");
		
	System.out.println("Utilizando método .apply() en Interfaz Bifunction");
		BiFunction<Integer,Integer,Integer> biFunA = (num_a, num_b) -> num_a+num_b ;
	    Integer resultadobiFunA = biFunA.apply(resultadoBinOpe1, 19);
	    System.out.println("el resultado es: " + resultadobiFunA + "\n");
	   
    System.out.println("Utilizando método .andThen() en Interfaz Bifunction");
	    BiFunction<Integer,Integer,Integer> biFunB = (num_a, num_b) -> num_a+num_b ;
	    biFunB=biFunB.andThen(rs -> rs *2);
	    Integer resultadobiFunB = biFunB.apply(2, 4);
	    System.out.println("el resultado es: " + resultadobiFunB + "\n");
	    
	System.out.println("Utilizando método .andThen() en Interfaz Bifunction combinada con Intefaz BinaryOperation");	    
	 // BiFunction<Integer, Integer, Integer> biFunC;
		BiFunction<Integer, Integer, Object> biFunC;
		biFunC=binOpe1.andThen(rs->rs+15);
	 // Integer resultado_BiFun_BinaryOpe2 =  biFunC.apply(1, 2);
		Integer resultado_BiFun_BinaryOpe2 = (Integer) biFunC.apply(1, 2);
		System.out.println("el resultado es: " + resultado_BiFun_BinaryOpe2 + "\n");
		
	  
	System.out.println("Utilizando método .minBy() de la Intefaz BinaryOperation");	    
		
		Comparator<Integer> comparacion = ((t1,t2) ->t1.compareTo(t2));
		
		BinaryOperator<Integer> numMenor=BinaryOperator.minBy(comparacion);
		
		Integer resultadoComparacion = numMenor.apply(t1, t2);
		
		System.out.println("el número menor entre " + t1 + " & " + t2 +  " es: " + resultadoComparacion + "\n");
	
	
	System.out.println("Utilizando método .maxBy() de la Intefaz BinaryOperation");	    
		
		BinaryOperator<Integer> numMayor=BinaryOperator.maxBy(comparacion);
	
		resultadoComparacion = numMayor.apply(t1, t2);
		
		System.out.println("el número mayor entre " + t1 + " & " + t2 +  " es: " + resultadoComparacion + "\n");
	
	}
	static int t1 = 1; static int t2=9;
}
