package k2.eia.in_consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {

	
	public void  aceptaTodosEstudiantes(List<Estudiante> listaEstudiantes,
									    Consumer<Estudiante> consEstudiantes){
		
		for (Estudiante est: listaEstudiantes) {
			
			consEstudiantes.accept(est);
			//El m�todo .accept() ejecuta la instrucci�n declarada en el Consumer
		}
	
	}
}
