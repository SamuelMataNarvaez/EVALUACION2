/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("INTRODUCE EL NUMERO DE LA SEMANA EN NUMERO (1-7):");
        dia = captu.nextInt();
        if (dia == 1)
            System.out.println("DOMINGO");
        else if (dia == 2)
                System.out.println("LUNES");
        else if (dia == 3)
                System.out.println("MARTES");
        else if (dia == 4)
                System.out.println("MIERCOLES");
        else if (dia == 5)
                System.out.println("JUEVES");
        else if (dia == 6)
                System.out.println("VIERNES");
        else if (dia == 7)
                System.out.println("SABADO");
        else
            System.out.println("EL NUMERO NO ES UN DIA VALIDO");
       
    }
    
}
