package m.eia.in_supplier;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		//La interfaz Supplier en un proveedor de recursos, la función no tiene argumentos
		Supplier<String> supp = ()-> "E&A";
		
		System.out.println("Valor proveniente de Supplier es: " + supp.get());
	}
}
