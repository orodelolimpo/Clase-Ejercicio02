package clases_aviones;

public class Avioness {

	public static void main(String[] args) {
		Avion a1= new Avion("Airbus ",4);
		Avion a2= new Avion ("Lookheed ",4);

		a1.imprimirFabricante();
		a2.imprimirFabricante ();
		
		a2.cambiarFabricante(a1);//cambiar el fabricante al mismo valor del obj pasado por parámetro
		a2.imprimirFabricante ();
		a2.setNombreFabricante("Apache");
		a2.imprimirFabricante ();
		

	}

}
