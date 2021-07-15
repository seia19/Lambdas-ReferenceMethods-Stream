package h2.eia.in_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvaluadorEmpleado {

	public List<Empleado_emp> evaluar(List<Empleado_emp> listaEmpleados,
									  Predicate<Empleado_emp> evaluacionEmpleado){
		
		List<Empleado_emp> nuevaListaEmpleados = new ArrayList<Empleado_emp>();
		
		for (Empleado_emp empleadoAprobado: listaEmpleados) {
			
			if(evaluacionEmpleado.test(empleadoAprobado)== true) {
				
				nuevaListaEmpleados.add(empleadoAprobado);
			}
		}
		return nuevaListaEmpleados;
	}
}
