package i.eia.in_predicate_in_bifunction;

import java.util.function.BiFunction;

public class Funciones {

	public double incrementoSalario(Empleados empleado,
									double incremento,
									BiFunction<Double, Double, Double> biFunction) {
		
		return biFunction.apply(empleado.getSalario(), incremento);
	}
}
