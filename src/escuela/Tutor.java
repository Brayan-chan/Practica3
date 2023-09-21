package escuela;

/**
 *
 * @author BrayanChan
 */
public class Tutor {
    String nombre;
    int edad;
    Telefono telefono;

    public Tutor() {
    }

    public Tutor(String nombre, int edad, Telefono telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Telefono getTelefono() {
        return telefono;
    }
    
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Tutor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
