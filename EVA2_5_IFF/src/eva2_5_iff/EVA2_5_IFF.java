/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_iff;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_5_IFF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int temp;
        //CAPTURAR TEMPERATURA
        Scanner captu = new Scanner (System.in);
         //CAPTURAR TEMPERATURA
         System.out.println("Temperatura (ºC): ");
         temp = captu.nextInt();
         //VAMOS A EVALUAR
         //SI LA TEMPERATURA ES MAYOR A 22º, SE ENCIENDE EL CLIMA
         if(temp > 22)
             System.out.println("ENCENDER EL AIRE");
    }
    
}
