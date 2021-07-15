package s8.eia.stream_op_mat;

import java.util.Comparator;
import java.util.List;

public class OperacionesMatematicas_FormaTradicional {

	public static void main(String[] args) {
		
		int [] numeros ={4,6,10,12,15,55,7,8,9,10,2,5,8,9,
						 10,45,6,9,33,66,85,97,81,24,99};
		
		int suma = 0;
		
		for (int i=0; i<numeros.length;i++) {
			
			suma += numeros[i];
		}
		
		System.out.println("La suma es: " + suma);
		
		double promedio = suma/numeros.length;
		System.out.println("\n" + "El promedio es:" + promedio);
		
		/**Obteniendo el n�mero m�ximo del Arreglo*/
		Integer numMax = numeros[0];
		
		for (Integer numEnArray: numeros) {
			if(numEnArray>numMax) {
				numMax = numEnArray;
			}
		}
		
		System.out.println("El n�mero maximo es:" + numMax);
		
		
		/**Obteniendo el n�mero m�nimo del Arreglo*/
		
		int numMin = numeros[0];

		for(int numEnArray: numeros) {
			
			if(numEnArray<numMin) {
				numMin = numEnArray;
			}
		}
		System.out.println("\n" + "El n�mero m�nimo es:" + numMin);
		
		
		System.out.println("\n" + "Operaciones de reducci�n con Empleados");
		
		List<MisEmpleados> listaEmpleados = MisEmpleados.listaMisEmpleados();
		
		double sumaSalariosEmpleados = 0.0;
		
		for(MisEmpleados emps:listaEmpleados) {
			sumaSalariosEmpleados += emps.getIngresos();
		}
		System.out.println("\n" + "La suma del Salario de los Empleados es: " + sumaSalariosEmpleados);
		
		System.out.println("\n" + "La cantidad de empleados son: " + listaEmpleados.size());
		
		
		//Obteniendo el Empleado con el M�ximo Salario
		
		double ingresoMax=0;
		String nombreEmpIngMax="";
		
		for(MisEmpleados emp: listaEmpleados) {
			
			if(ingresoMax<emp.getIngresos()) {
				ingresoMax = emp.getIngresos();
				nombreEmpIngMax = emp.getNombre();
			}
			
		}
		System.out.println("El mayor ingreso es de: " + nombreEmpIngMax + " con $" + ingresoMax + " de sueldo." + "\n");
		
		//Obteniendo el Empleado con el M�nimo Salario
		
		double ingresoMin = 100000.0;
		String nomEmpIngMin="";
		
		for(MisEmpleados emp: listaEmpleados) {
			
			if(ingresoMin>emp.getIngresos()) {
				ingresoMin = emp.getIngresos();
				nomEmpIngMin = emp.getNombre();
			}
		}

		
		System.out.println("El menor ingreso es de: " + nomEmpIngMin + " con $" + ingresoMin + " de sueldo." + "\n");
		
	}

}
