package h2.eia.in_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Principal {

	public static void main(String[] args) {
		
		List<Empleado_emp> listaEmpleados = Arrays.asList(

				new Empleado_emp("Rodrigo",25,1500,"Cobranza"),
				new Empleado_emp("Alicia",25,1500,"Ventas"),
				new Empleado_emp("Manolo",30,1500,"Ventas"),
				new Empleado_emp("Cinthia",20,2500,"Mostrador"),
				new Empleado_emp("Esteban",19,7000,"Ventas"),
				new Empleado_emp("Damaris",32,6000,"Telemarketing"),										 
				new Empleado_emp("Lina",25,2500,"Mostrador"),
				new Empleado_emp("Nayeli",34,1000,"Ventas"),
				new Empleado_emp("Flor",35,7000,"Compras"),
				new Empleado_emp("German",20,1500,"Facturacion"),
				new Empleado_emp("Lidia",21,6000,"Telemarketing"),
				new Empleado_emp("Eliazar",33,6000,"Cobranza"),
				new Empleado_emp("Javier",35,6000,"Cobranza"),
				new Empleado_emp("Paola",50,1500,"Compras"),
				new Empleado_emp("Ignacio",41,1500,"Compras"),
				new Empleado_emp("Seia",19,17000,"RH-Management"));
										
	System.out.println("Empleados cuyo salario es mayor o igual a $6000: " + "\n");
		
		EvaluadorEmpleado evaluador = new EvaluadorEmpleado();
		
		Predicate<Empleado_emp> evaluacionEmpleado = (emp)->(emp.getSalario()>=6000) ;
		
		List<Empleado_emp> listaEmpleadosSalarioAlto = evaluador.evaluar(listaEmpleados, evaluacionEmpleado);
		
		for(Empleado_emp e: listaEmpleadosSalarioAlto) {
		System.out.println(e.getNombre() + " --> " + e.getSalario());
		
		}
		
	System.out.println("\n" + "Empleados cuyo nombre inicia con L: " + "\n");

		EvaluadorEmpleado evaluador2 = new EvaluadorEmpleado();
		
		Predicate<Empleado_emp> evLetraIniNombre = (empNombre -> empNombre.getNombre().startsWith("L"));
		
		List<Empleado_emp> listaEmpleadosIniNombre = evaluador2.evaluar(listaEmpleados, evLetraIniNombre);
	
		for(Empleado_emp e: listaEmpleadosIniNombre ) {
			System.out.println(e.getNombre());
		}
		
		System.out.println("\n" + "Empleados jóvenes menores de 25 años: " + "\n");
	
		EvaluadorEmpleado evaluador3 = new EvaluadorEmpleado();
		
		Predicate<Empleado_emp> evEdad = (empEdad) -> (empEdad.getEdad()<25);
		
		List<Empleado_emp> listaEmpPorEdad = evaluador3.evaluar(listaEmpleados, evEdad);
		
		for(Empleado_emp e: listaEmpPorEdad) {
			System.out.println(e.getNombre() + " --> " + e.getEdad());
		}
	}
	
	
}
