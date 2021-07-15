package g2.eia.in_bifunction;

import java.util.function.BiFunction;

public class Convertidor_Calculadora {

	public String Convertir(BiFunction<Integer, Integer, String> funCalc,
									  Integer num1, Integer num2) {
		
		String conversionCalc = funCalc.apply(num1, num2);
		
		return conversionCalc;
	}
}
