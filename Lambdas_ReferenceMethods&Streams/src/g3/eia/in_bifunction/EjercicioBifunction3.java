package g3.eia.in_bifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


public class EjercicioBifunction3 {

	public static void main(String[] args) {
		
		List<Empleado>  listaEmp =  Arrays.asList(
				
				new Empleado("eia",30000.00),
				new Empleado("seia",60000.00),
				new Empleado("eiata",90000.00),
				new Empleado("seiata",150000.00)
												  );
		
		Convertidor_Calculadora2 calculadora = new Convertidor_Calculadora2();
	
		BiFunction<Double, Double, Double> operacion = (salario,incremento)-> salario+(salario*(incremento/100));
		
		List<Double> inc = calculadora.Convertir(operacion, listaEmp, 10.00); //el salario tendrá un incremento del 10%
	
		
		for(Double payRise: inc) {
					System.out.println(" Nuevo salario: " + payRise);
			
		}
	

		
	}
	
}
