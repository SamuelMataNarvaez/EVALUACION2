/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String ejemplo;
        int numeroEjem;
        Scanner captu =  new Scanner  (System.in);
        System.out.println("pon un mensaje");
        ejemplo = captu.nextLine();
        System.out.println("¿cuantas veces quieres imprimir el mensaje?");
        numeroEjem = captu.nextInt();
        
        for (int i = 1; i <= numeroEjem; i++) {
            System.out.println(ejemplo);
        }
     int entero,suma;
      suma = 0;
        System.out.println("introdcue el numero a sacar sumatoria");
        entero = captu.nextInt();
        for (int i = 1; i <= entero; i++) {
        suma+=i;
            System.out.print(i);
            if (i<entero)System.out.print("+");
        }
        System.out.println(" = " + suma);
        System.out.println("");
        
        
        int numero = 0;
        System.out.println("introduce un numero (entero)");
        numero = captu.nextInt();
        for (int i = 1  ; i <= numero; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.print("*");     
            }
            System.out.println("");
        }
        for (int k=numero; k>=1; k--){
            for (int i=1; i<=k; i++)
            System.out.println("*");
            
        }
        System.out.print("");
    }    
}
