package f.eia.in_function;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
	//Sintaxis Function<TipoDatoEntrada, TipoDatoSalida>
		       Function<Integer, String> conversor = x -> x.toString(x);
		       
		       System.out.println(conversor.apply(1).length());
		       System.out.println(conversor.apply(19).length());
		       System.out.println(conversor.apply(119).length());
		       
		       String numToStr1 = conversor.apply(2);
		       String numToStr2 = conversor.apply(3);
		       
		       System.out.println(numToStr1+numToStr2);
	}
}
