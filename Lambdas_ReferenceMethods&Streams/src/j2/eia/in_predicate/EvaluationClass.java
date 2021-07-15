package j2.eia.in_predicate;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiPredicate;

public class EvaluationClass {

	public List<MiEmpleado> evaluar(List<MiEmpleado> listaEmpleados, 
									BiPredicate<MiEmpleado, MiEmpleado> biPred) {

		List<MiEmpleado> listaEmpleadoRequerimientos = new LinkedList<MiEmpleado>();
		
		
		for (MiEmpleado emp : listaEmpleados) {

			if (biPred.test(emp, emp) == true) {

				listaEmpleadoRequerimientos.add(emp);
			}
		}
		return listaEmpleadoRequerimientos;
	}

}
