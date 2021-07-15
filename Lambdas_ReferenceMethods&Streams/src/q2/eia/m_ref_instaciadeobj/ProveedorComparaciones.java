package q2.eia.m_ref_instaciadeobj;

public class ProveedorComparaciones {

	public int compararPorNombre(Person per1, Person per2) {
		
		String nombrePer1 = per1.getNombre();
		String nombrePer2 = per2.getNombre();
		
		return nombrePer1.compareTo(nombrePer2);
	}
	
	public int compararPorEdad(Person per1, Person per2) {
		
		Integer edadPer1 = per1.getEdad();
		Integer edadPer2 = per2.getEdad();
		
		return edadPer1.compareTo(edadPer2);
	}
}
