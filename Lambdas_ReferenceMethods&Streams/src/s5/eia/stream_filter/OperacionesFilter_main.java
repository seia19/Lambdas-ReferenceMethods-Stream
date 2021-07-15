package s5.eia.stream_filter;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter_main {

	public static void main(String[] args) {

		List<Employee> empleados = Employee.listaEmpleados();
		
		System.out.println("Empleados Hombres:" + "\n");
		
		empleados.stream()
				 .filter(emp->emp.esHombre())
				 .forEach(e->System.out.println("Nombre Empleado: "+e.getNombre() + " " +e.getGenero()));
	
	
		System.out.println("\n" + "Empleados Mujeres:" + "\n");

	
		empleados.stream()
			   //.filter(emp->emp.esMujer())
				 .filter(Employee::esMujer)
				 .forEach(em->System.out.println("Nombre Empleado: "+em.getNombre() + " " +em.getGenero()));
	
		System.out.println("\n" + "Empleados mayores a 25 años:" + "\n");
	
		empleados.stream()
				 .filter(emp->emp.getEdad()>25)
				 .forEach(e->System.out.println("Nombre Empleado: "+e.getNombre() + " " +e.getEdad()));
	
		
		System.out.println("\n" + "Empleados Hombres, cuyo nombre inicia con la letra 'A':" + "\n");
	
		empleados.stream()
				 .filter(emp->emp.esHombre()&&emp.getNombre().startsWith("A"))
				 .forEach(e->System.out.println("Nombre Empleado: "+e.getNombre() + " " +e.getGenero()));
				
		System.out.println("\n" + "Empleados con un salario superior a 500" + "\n");

		
		empleados.stream()
				 .filter(emp->emp.getIngresos()>500)
				 .forEach(e->System.out.println("Nombre Empleado: "+e.getNombre() + " " +e.getIngresos()));
	
		
		System.out.println("\n" + "Empleados mujeres, mayor a 25 años, con un ingreso superior a 300" + "\n");
	
	
		Predicate<Employee> empFem = emp->emp.esMujer();
		Predicate<Employee> empMayor25 = emp->emp.getEdad()>25;
		Predicate<Employee> empSueldoMayor300 = emp->emp.getIngresos()>300;
	
		//Utilizando .and() para concatenar los Predicates
		Predicate<Employee> empleadoRequerido = empFem.and(empMayor25).and(empSueldoMayor300);
	
		empleados.stream()
		         .filter(empleadoRequerido)
		         .forEach(e->System.out.println("Nombre Empleado: "+e.getNombre() + " Edad: " + e.getEdad() + 
		        		                        " Género: " + e.getGenero() + " Ingresos: $"+ e.getIngresos()));
	
		System.out.println("\n" + "Número de Empleados que cumplen con al condición de ser mujeres, mayor a 25 años, con un ingreso superior a 300" + "\n");

		System.out.println(empleados.stream()
				                    .filter(empleadoRequerido)
				                    .count());
		
	}

}
