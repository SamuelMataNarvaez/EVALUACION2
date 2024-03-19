/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner (System.in);
        System.out.println("INTRODUCE TU CALIFICACION 0-100");
        cali = captu.nextInt();
        if(cali >= 90 && cali <=100)
        System.out.println("TU CALIFICACION EN SISTEMA DE EUA ES A");
        else if (cali >= 80 && cali <= 89)
        System.out.println("TU CALIFICACION EN SISTEMA DE EUA ES B");
        else if (cali >= 70 && cali <= 79)
        System.out.println("TU CALIFICACION EN SISTEMA DE EUA ES C");
        else if (cali >= 60 && cali <= 69)
        System.out.println("TU CALIFICACION EN SISTEMA DE EUA ES D ");
        else if (cali >= 0 && cali <= 59)
        System.out.println("TU CALIFICACION EN SISTEMA DE EUA ES F");
        else
        System.out.println("CALIFICACION NO VALIDA!!!!");
                
      
    }
    
}
