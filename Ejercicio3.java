// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Gutierrez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        System.out.println("La frase en mayusculas es " +frase.toUpperCase());
        System.out.println("La frase en minusculas es " + frase.toLowerCase());
        
    }
    
}
