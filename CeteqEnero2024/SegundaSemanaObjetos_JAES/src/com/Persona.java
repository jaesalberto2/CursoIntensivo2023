package com;

public class Persona {

	//esta es una clase que nos va a servir como plantilla
	//para  crear nuevos objetos perosna
	//primero utilizaremos la ABSTRACCION para modelar
	//los atributos de mi objeto aqui
	
	//Atributos que tendria una persona
	/*
	 * existen lo que son los modificadores de acceso
	 * lo cual nos va a permitir ENCAPSULAR o proteger
	 *  el acceso a la informacion
	 *  estos modificadores tienen diversos alcances
	 *  private, public,protected y default 
	 *  y se anteponen antes del tipo de dato
	 */
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	/*
	 * METODOS CONSTRUCTORES
	 * Son metodos que nos van a permitir crear a nuestro objeto 
	 * con sus valores ya iniciados o los que necesitemos iniciar
	 * 
	 * Por lo general contamos con el uso de dos constructores 
	 * constructor vacio que nos permite instanciar nuestro objeto
	 * sin valores asigando
	 * Este se vuelve un "dummie" o comodin con el cual 
	 * podremos asignar valores posteriormente con los metodos 
	 * setters
	 */
	public Persona() {
	
	}
	
	/*
	 * CONSTRUCTOR CON TODOS LOS PARAMETROS
	 * click derecho, source generate constructor using fields
	 */
	

	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
		//Ejemplo de constructor con solo un parametro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//METODOS GETTERS Y SETTERS
	/*
	 * Metodo GET, nos permite recuperar el valor de un atributo asignado
	 * Metodo SET, nos permite estableceer el valor de un atributo
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/*
	 * METODO TOSTRING
	 * nos va a permitir visualizar en String todos los datos de nuestro objeto
	 * de como de comopone
	 */

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
