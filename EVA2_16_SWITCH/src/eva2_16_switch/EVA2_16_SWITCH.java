/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_16_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner (System.in);
        System.out.println("INTRODUCE EL NUMERO DEL MES: ");
        mes = captu.nextInt();
        switch (mes){
            case 1:
                System.out.println("ENERO");
                break; //ROMPE EL SWITCH
            case 2:
                System.out.println("FEBRERO");
                break; //ROMPE EL SWITCH
            case 3:
                System.out.println("MARZO");
                break; //ROMPE EL SWITCH
            case 4:
                System.out.println("ABRIL");
                break; //ROMPE EL SWITCH
            case 5:
                System.out.println("MAYO");
                break; //ROMPE EL SWITCH
            case 6:
                System.out.println("JUNIO");
                break; //ROMPE EL SWITCH
            case 7:
                System.out.println("JULIO");
                break; //ROMPE EL SWITCH
            case 8:
                System.out.println("AGOSTO");
                break; //ROMPE EL SWITCH
            case 9:
                System.out.println("SEPTIEMBRE");
                break; //ROMPE EL SWITCH
            case 10:
                System.out.println("OCTUBRE");
                break; //ROMPE EL SWITCH
            case 11:
                System.out.println("NOVIEMBRE");
                break; //ROMPE EL SWITCH
            case 12:
                System.out.println("DICIEMBRE");
                break; //ROMPE EL SWITCH
            default:
                System.out.println("ERROR");
               
            
            
        
        }
    }
    
}
