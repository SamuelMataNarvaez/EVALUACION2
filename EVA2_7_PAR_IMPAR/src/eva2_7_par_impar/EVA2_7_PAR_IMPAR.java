/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_7_PAR_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,divi,resi;
        Scanner captu = new Scanner (System.in);
        System.out.println("INTRODUCE UN NUMERO ENTERO:");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("DIVISION ENTERA DE " +num + " / 2 = " + divi);
        resi = num % 2;
        System.out.println("EL RESIDUO DE  " +num + " % 2 = " + resi);
        
        //NUMERO PAR O IMPAR
        if(resi == 1)
                
        System.out.println(num + " es impar");
        else
        System.out.println(num + " es par");
        
    }
    
}
