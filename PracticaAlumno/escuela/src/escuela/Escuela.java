package escuela;

import java.util.Scanner;

public class Escuela {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Alumno pepito = new Alumno("Brayan", "ISC", 71392, 3, 'B');
        //Tutor tutor = new Tutor("Consuelo del Carmen Pacheco Che", 49);
        //Telefono telefono = new Telefono("+52 ", "981-", "112-23-34");
        Telefono telefonoTutor = new Telefono("+52", "981", "112-23-34");
        Tutor tutor = new Tutor("Consuelo del Carmen Pacheco Che", 49, telefonoTutor);
        Alumno pepito = new Alumno("Brayan", "ISC", 71392, 3, 'B', tutor);
        
        String telefono = pepito.getTutor().getTelefono().toString();
        System.out.println("El telefono del tutor de: " + pepito + "\n" + tutor + ":" + telefono);
        //pepito.setTutor(tutor);
        
        
        //System.out.println(alumno.getNombre());
        //System.out.println(alumno.getCarrera());
        //System.out.println(alumno.toString());
    
    }
}
  
    

