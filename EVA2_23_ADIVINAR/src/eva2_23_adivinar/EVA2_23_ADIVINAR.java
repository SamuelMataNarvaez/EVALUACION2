/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_23_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 5;//numero tiene que adivinar (entre 1 y 10)
        int valor = 0;//valor para almacenar lo que capture el usuario
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("¿cual es el numero? (entre 1 y 10):");
            valor = captu.nextInt();
        }while (nume != valor);
        System.out.println("ADIVINASTE FELICIDADES!!");
        
    }
    
}
