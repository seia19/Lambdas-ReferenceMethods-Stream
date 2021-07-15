package s8.eia.stream_op_mat;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OperacionesMatematicas_ConStreams {

	public static void main(String[] args) {

		
		int [] numeros ={4,6,10,12,15,55,7,8,9,10,2,5,8,9,
				 10,45,6,9,33,66,85,97,81,24,99};
		
		int sumaNumeros = IntStream.of(numeros)
				                   .sum();
		
		System.out.println("Suma Total de los números: " + sumaNumeros + "\n");
		
		
		OptionalDouble promedio = IntStream.of(numeros)
										   .average();

		System.out.println("Suma Total de los números: " + promedio.getAsDouble() + "\n");
		
		
		OptionalInt numMin = IntStream.of(numeros)
				 					  .min();
		
		System.out.println("El número minimo es: " + numMin.getAsInt() + "\n");
		
		
		OptionalInt numMax = IntStream.of(numeros)
									  .max();

		System.out.println("El número minimo es: " + numMax.getAsInt() + "\n");

		
		long numTotElementos = IntStream.of(numeros)
										.count();
		
		System.out.println("El número Total de Elementos en el Array es: " + numTotElementos + "\n");
		
			
		/**Operaciones con MisEmpleados*/
		
		List<MisEmpleados> listaEmpleados = MisEmpleados.listaMisEmpleados();
		
		double sumatoriaSalario = listaEmpleados.stream()
									//			.mapToDouble(emp->emp.getIngresos())
					  							.mapToDouble(MisEmpleados::getIngresos)
					  							.sum();
					  
		System.out.println("El total de la sumatoria de todos los ingresos de MisEmpleados es: " + sumatoriaSalario + "\n");

		
		
		double cantidadEmpleados = listaEmpleados.stream()
											      .count();
		
		System.out.println("El total de MisEmpleados es: " + cantidadEmpleados + "\n");

		
		OptionalDouble promedioEmpleados = listaEmpleados.stream()
											//			 .mapToDouble(MisEmpleados::getIngresos)
												 		 .mapToDouble(emp->emp.getIngresos())
												 		 .average();
		
		System.out.println("El Promedio de Salario de MisEmpleados es: " + promedioEmpleados.getAsDouble() + "\n");

		
		MisEmpleados empIngresoMax = listaEmpleados.stream()
					  							   .max((sueldoEmpA, sueldoEmpB) -> (int)sueldoEmpA.getIngresos() - (int)sueldoEmpB.getIngresos()) //JVM utiliza internamente .compare()
					  							   .get();
	
		System.out.println("El Empleado con el Ingreso máximo es: " + empIngresoMax.getNombre() + " con un ingreso de $" +  empIngresoMax.getIngresos() + "\n");

		
		MisEmpleados empIngresoMin = listaEmpleados.stream()
												   .min((salarioEmpA, salarioEmpB) -> (int)salarioEmpA.getIngresos() - (int)salarioEmpB.getIngresos()) //JVM utiliza internamente .compare(
												   .get();
	
		System.out.println("El Empleado con el Ingreso mínimo es: " + empIngresoMin.getNombre() + " con un ingreso de $" +  empIngresoMin.getIngresos() + "\n");

		
	}							

}
