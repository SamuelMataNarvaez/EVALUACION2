/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el año
        System.out.print("Ingresa un año: ");
        int year = scanner.nextInt();
        
        // Verificar si el año es bisiesto o no
        if (esBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
    
    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int year) {
        // Un año es bisiesto si es divisible entre 4
        // pero no es divisible entre 100, excepto si también es divisible entre 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

    }
    
