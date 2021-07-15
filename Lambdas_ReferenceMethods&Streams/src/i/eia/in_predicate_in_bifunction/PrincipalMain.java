package i.eia.in_predicate_in_bifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;



public class PrincipalMain {

	public static void main(String[] args) {
		
		List<Empleados> listaEmpleados = Arrays.asList(

				new Empleados("Rodrigo",25,1500,"Cobranza"),
				new Empleados("Alicia",25,1500,"Ventas"),
				new Empleados("Manolo",30,1500,"Ventas"),
				new Empleados("Cinthia",20,2500,"Mostrador"),
				new Empleados("Esteban",19,7000,"Ventas"),
				new Empleados("Damaris",32,6000,"Telemarketing"),										 
				new Empleados("Lina",25,2500,"Mostrador"),
				new Empleados("Nayeli",34,1000,"Ventas"),
				new Empleados("Flor",35,7000,"Compras"),
				new Empleados("German",20,1500,"Facturacion"),
				new Empleados("Lidia",21,6000,"Telemarketing"),
				new Empleados("Eliazar",33,6000,"Cobranza"),
				new Empleados("Javier",35,6000,"Cobranza"),
				new Empleados("Paola",50,1500,"Compras"),
				new Empleados("Ignacio",41,1500,"Compras"),
				new Empleados("Seia",19,17000,"RH-Management"));
										
	System.out.println("Empleados cuyo salario es mayor o igual a $6000: " + "\n");
		
		EvaluadorEmpleados evaluador = new EvaluadorEmpleados();
		
		Predicate<Empleados> evaluacionEmpleado = (emp)->(emp.getSalario()>=6000) ;
		
		List<Empleados> listaEmpleadosSalarioAlto = evaluador.evaluar(listaEmpleados, evaluacionEmpleado);
		
		for(Empleados e: listaEmpleadosSalarioAlto) {
		System.out.println(e.getNombre() + " --> " + e.getSalario());
		
		}
		
	System.out.println("\n" + "Empleados cuyo nombre inicia con L: " + "\n");

		EvaluadorEmpleados evaluador2 = new EvaluadorEmpleados();
		
		Predicate<Empleados> evLetraIniNombre = (empNombre -> empNombre.getNombre().startsWith("L"));
		
		List<Empleados> listaEmpleadosIniNombre = evaluador2.evaluar(listaEmpleados, evLetraIniNombre);
	
		for(Empleados e: listaEmpleadosIniNombre ) {
			System.out.println(e.getNombre());
		}
		
	System.out.println("\n" + "Empleados jóvenes menores de 25 años: " + "\n");
	
		EvaluadorEmpleados evaluador3 = new EvaluadorEmpleados();
		
		Predicate<Empleados> evEdad = (empEdad) -> (empEdad.getEdad()<25);
		
		List<Empleados> listaEmpPorEdad = evaluador3.evaluar(listaEmpleados, evEdad);
		
		for(Empleados e: listaEmpPorEdad) {
			System.out.println(e.getNombre() + " --> " + e.getEdad());
		}
		
										
											/**-- Predicate & Bifunction --*/
		
	System.out.println("\n" + "Salarios de los Empleados jóvenes menores o iguales a los 25 años: " + "\n");
		
		EvaluadorEmpleados evaluador4 = new EvaluadorEmpleados();
		Predicate<Empleados> evalEmpPorEdad = (e)->e.getEdad()<=25;
		
		List<Empleados> listaEmpEdadMax25 = evaluador4.evaluar(listaEmpleados, evalEmpPorEdad);
		
		for(Empleados empleado: listaEmpEdadMax25) {
			System.out.println(empleado.getNombre() + " --> " + empleado.getSalario());
		}
	
	System.out.println("\n" + "A los Empleados jóvenes con una edad máxima de 25 años se les incrementará en un 15% el salario: " + "\n");
		Funciones funcion1 = new Funciones();
																//el número y tipo de parámetros coincidir con los parámetros especificados en el método .apply()
		BiFunction<Double, Double, Double> salarioIncrementado = (salario,incremento)->(salario+(salario*(incremento/100)));
		
		for(Empleados empleado: listaEmpEdadMax25) {
			
			double nuevoSalario = funcion1.incrementoSalario(empleado, 15, salarioIncrementado);
			
			empleado.setSalario(nuevoSalario);
			
			System.out.println(empleado.getNombre() + " --> " + empleado.getSalario());
			
			
		}
		
		
	}
	
}
