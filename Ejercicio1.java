
package holamundo;

//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los

import java.util.Scanner;

// dos. El programa deberá después mostrar el resultado de la suma
public class Ejercicio1 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es " + suma);
        
    }
    
}
