package i.eia.in_predicate_in_bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvaluadorEmpleados {

	public List<Empleados> evaluar(List<Empleados> listaEmpleados,
									  Predicate<Empleados> evaluacionEmpleado){
		
		List<Empleados> nuevaListaEmpleados = new ArrayList<Empleados>();
		
		for (Empleados empleadoAprobado: listaEmpleados) {
			
			if(evaluacionEmpleado.test(empleadoAprobado)== true) {
				
				nuevaListaEmpleados.add(empleadoAprobado);
			}
		}
		return nuevaListaEmpleados;
	}
}
