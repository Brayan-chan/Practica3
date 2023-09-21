/**
* Automovil.java
*
* @author H�ctor Quej Cosgaya
* @author Jos� Aguilar Canepa
*
* @created 05/11/12 10:50 PM
*
* Esta clase modela exclusivamente automoviles de la marca "Ford".
*/
public class AutomovilFord {
	
	int velocidad;						// La velocidad a la que se desplaza el auto
	String color;						// El color del auto
	public String modelo;					// El modelo del auto
	Motor motor;						// El motor del auto
	public static final String marca = "Ford";	// La marca del auto
		
	/**
	* Inicializa un nuevo objeto Automovil.
	* 
	* @param modelo: El modelo del auto.
	* @param color: El color del auto
	*/
	public AutomovilFord(String modelo, String color){
		this.modelo = modelo;
		this.color = color;
		velocidad = 0;
		motor = new Motor();
	}
	
	/**
	* Inicializa un nuevo objeto Automovil.
	*/
	public AutomovilFord(){
		this("EcoSport", "Azul");
	}
	
	/**
	* Enciende el motor del automovil.
	*/
	public void encenderMotor() {
		//motor.
		boolean encendido = true;
		motor.setEncendido(encendido);
		System.out.println("Motor encendido");
	}
	
	/**
	* Apaga el motor del automovil.
	*/
	public void apagarMotor() {
		//motor.
		boolean encendido = false;
		motor.setEncendido(encendido);
		System.out.println("Motor apagado");
	}
	
	/**
	* Incrementa la velocidad del automovil en la cantidad de kil�metros/hora especificada.
	*
	* @param cantidad: El n�mero de km/h en que aumentar� la velocidad del auto.
	*/
	public void acelerar() {
		if (motor.getEncendido()) {
			//motor.comprimirMezcla();
			//motor.encenderMezcla();
			//motor.prepararMezcla();	
			motor.revolucionar();		
			velocidad = (motor.getRevoluciones() / 100);
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor est� apagado!");
		}
	}
	
	/**
	* Reduce a cero la velocidad del auto.
	*/
	public void frenar(int cantidad) {
		cantidad = motor.getRevoluciones();
		if(velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " kph");	
	}
	
	/**
	* Nos muestra la velocidad a la que se est� desplazando el auto.
	* 
	* @return la velocidad del auto.
	*/
	public int getVelocidad() {
		return velocidad;
	}
}