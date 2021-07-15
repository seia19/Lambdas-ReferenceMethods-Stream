/*
 Ejercicio.
 
 	Se requiere obtener un reporte de los Empleados que cumplan con
 alguno de los siguientes criterios:
 
 a)	Edad de 25 años en adelante que se encuentren el departamento de Ventas o,
 b)	Edad de 25 años en adelante que se encuentren el departamento de Mostrador.
*/
package j2.eia.in_predicate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiPredicate;

public class PrincipalClass {
	
	
	
	public static void main(String[] args) {
		
		PrincipalClass principal = new PrincipalClass();
		EvaluationClass evaluation = new EvaluationClass();
		
		List<MiEmpleado> listaOriginalEmpleados = principal.obtenerListaOriginalEmpleados();
		
	//	BiPredicate<MiEmpleado, MiEmpleado> empleadoByEdadDepto = (edad, depto) -> (edad.getEdad()>=25) && (depto.getDepartamento().equals("Ventas"));

		BiPredicate<MiEmpleado, MiEmpleado> empleadoByEdadDepto = (edad, depto) -> (
																  (edad.getEdad()>=25) && (depto.getDepartamento().equals("Ventas")) || 
																  (edad.getEdad()>=25) && (depto.getDepartamento().equals("Mostrador")) );
																  
		List<MiEmpleado> listaEmpPorEdadDepto = evaluation.evaluar(listaOriginalEmpleados, empleadoByEdadDepto);
		
		
		for(MiEmpleado e: listaEmpPorEdadDepto) {
			
			System.out.println(e.getNombre() + " - Edad: " + e.getEdad() + " --> " + e.getDepartamento());
			
		}
	
	}
	
	
	public List<MiEmpleado> obtenerListaOriginalEmpleados(){
		
		List<MiEmpleado>listaMisEmpleados = Arrays.asList(

				new MiEmpleado("Rodrigo",25,1500,"Cobranza"),
				new MiEmpleado("Alicia",25,1500,"Ventas"),
				new MiEmpleado("Manolo",30,1500,"Ventas"),
				new MiEmpleado("Cinthia",20,2500,"Mostrador"),
				new MiEmpleado("Esteban",19,7000,"Ventas"),
				new MiEmpleado("Damaris",32,6000,"Telemarketing"),										 
				new MiEmpleado("Lina",25,2500,"Mostrador"),
				new MiEmpleado("Nayeli",34,1000,"Ventas"),
				new MiEmpleado("Flor",35,7000,"Compras"),
				new MiEmpleado("German",20,1500,"Facturacion"),
				new MiEmpleado("Lidia",21,6000,"Telemarketing"),
				new MiEmpleado("Eliazar",33,6000,"Cobranza"),
				new MiEmpleado("Javier",35,6000,"Cobranza"),
				new MiEmpleado("Paola",50,1500,"Compras"),
				new MiEmpleado("Ignacio",41,1500,"Compras"),
				new MiEmpleado("Seia",19,17000,"RH-Management"),
				new MiEmpleado("Yolanda",21,1000,"Ventas"),
				new MiEmpleado("Arturo",54,1500,"Cobranza"),
				new MiEmpleado("Olivia",28,5000,"Mostrador"),
				new MiEmpleado("Gerardo",19,6000,"Mostrador"),
				new MiEmpleado("Richard",34,6000,"Mostrador"),
				new MiEmpleado("Manuel",40,2000,"Facturacion"),
				new MiEmpleado("Jocabed",21,4500,"Mostrador"),
				new MiEmpleado("Noe",43,1500,"Cobranza"),
				new MiEmpleado("Silvia",33,1500,"Cobranza"),
				new MiEmpleado("Pablo",22,1500,"Cobranza"),
				new MiEmpleado("Pedro",55,1500,"Compras"),
				new MiEmpleado("Eiata",19,19000,"RH-Management"));
		
		/*
		for (MiEmpleado empleados: listaMisEmpleados) {
			System.out.println(empleados);
		}*/

		return listaMisEmpleados;
	}

}
