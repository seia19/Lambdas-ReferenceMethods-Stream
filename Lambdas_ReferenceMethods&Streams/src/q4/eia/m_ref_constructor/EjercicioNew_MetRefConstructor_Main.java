package q4.eia.m_ref_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew_MetRefConstructor_Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		List<String> listaNumeros= Arrays.asList("10","10","15","15","25","30","40","60","30");
	
	//  Function<String,Integer> funConvertirStringToInteger =(numString)->new Integer(numString);
		Function<String,Integer> funConvertirStringToInteger = (Integer::new); // Referencia al Constructor de la clase Integer
		
		List<Integer> resultadoConversion = getResults(listaNumeros,funConvertirStringToInteger);
		
		System.out.println("Lista de números: " +"\n");
		resultadoConversion.forEach(System.out::println);
		
		
		System.out.println("\n"+ "Lista de números multiplicados *10: " +"\n");
		
	//	resultadoConversion.forEach(num->System.out.println(num*10));
		resultadoConversion.forEach(num->EjercicioNew_MetRefConstructor_Main.multiplicarPorDiez(num));
	}

	
	public static List<Integer> getResults(List<String> datos, Function<String, Integer> funStrToInteger){
		
		List<Integer> resultadosListado= new ArrayList<>();
		
		datos.forEach(res->resultadosListado.add(funStrToInteger.apply(res)));
		
		return resultadosListado;
	}
	
	
	public static void multiplicarPorDiez(Integer num) {
		System.out.println("El nuevo valor de " + num  + " multiplicado x10 es: " + (num*10));
	}
}
