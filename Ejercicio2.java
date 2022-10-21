//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Gutierrez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        nombre = leer.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
    
}
