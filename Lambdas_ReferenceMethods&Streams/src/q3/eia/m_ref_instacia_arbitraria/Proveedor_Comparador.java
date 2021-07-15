package q3.eia.m_ref_instacia_arbitraria;

public class Proveedor_Comparador {

	public int compararPorNombre(MiPersona per1, MiPersona per2) {
		
		String nombrePer1 = per1.getNombre();
		String nombrePer2 = per2.getNombre();
		
		return nombrePer1.compareTo(nombrePer2);
	}
	
	public int compararPorEdad(MiPersona per1, MiPersona per2) {
		
		Integer edadPer1 = per1.getEdad();
		Integer edadPer2 = per2.getEdad();
		
		return edadPer1.compareTo(edadPer2);
	}
}
