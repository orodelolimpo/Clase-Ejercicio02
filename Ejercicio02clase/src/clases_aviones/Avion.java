package clases_aviones;

public class Avion {
//	Ejercicio 2
//	Clase Avión 
//	1. Se tiene un código que modela una clase Avión que posee dos atributos: 
//	nombre del fabricante del avión (tipo String) y número de motores del avión 
//	(tipo int). La clase tiene un constructor y métodos get y set para cada atributo. 
//	Además, tiene los siguientes métodos adicionales: 
//	2. Un método denominado imprimirFabricante(), que muestra en pantalla el 
//	nombre del fabricante de un avión. 
//	• Un método denominado cambiarFabricante(Avión a), que recibe como 
//	parámetro un objeto de tipo Avión y le cambia el valor de su atributo fabricante 
//	a un valor pasado como parámentro. 
//	En el método main se crean dos aviones: a1 (fabricante “Airbus” con cuatro 
//	motores) y a2 (fabricante “Lookheed” con cuatro motores). Luego, los datos de 
//	cada avión se imprimen por pantalla. Después, se realizan llamadas a los métodos 
//	setFabricante y cambiarFabricante, los cuales cambiarán los valores de sus 
//	atributos. ¿Cuál es el resultado final de la ejecución del método main? Determinar 
//	lo que se imprime en pantalla.
	
	//1.

	private String nombreFabricante;
	private int numMotores;
	
	//constructor
		public Avion () {
		this.nombreFabricante="";
		this.numMotores=0;
	}  //Este sería a 0
	
	//contructor con datos/parámetros
	
	public Avion(String nombreFabricante, int numMotores) {
		super();
		this.nombreFabricante = nombreFabricante;
		this.numMotores = numMotores;
	}
	
	
	//getter 

	public String getNombreFabricante() {
		return nombreFabricante;
	}


	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	//métodos adicionales
	
	public void imprimirFabricante() {
		System.out.println("El fabricante es: "+this.nombreFabricante);
	
	}
	
	public void cambiarFabricante(Avion a) {
		this.nombreFabricante=a.nombreFabricante;
		
	}
	

}
