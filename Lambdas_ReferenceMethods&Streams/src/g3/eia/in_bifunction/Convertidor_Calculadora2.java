package g3.eia.in_bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Convertidor_Calculadora2 {

	public List<Double> Convertir(BiFunction<Double, Double, Double> funCalc,
									  List<Empleado> listaEmpleado, 
									  Double incrementeSalario) {
		
		
		
		List<Double> listaSalarios = new ArrayList<Double>();
		
		for(Empleado emp: listaEmpleado ) {
			
			Double salarioIncrementado = funCalc.apply(emp.getSalario(), incrementeSalario);
			
			listaSalarios.add(salarioIncrementado);
			
			System.out.println(emp.getNombre() + " salario anterior: " + emp.getSalario());
		}
		
			
		return listaSalarios;
	}
}
