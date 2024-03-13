/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        int apuesta;
        Scanner captu = new Scanner (System.in);
        System.out.println("ESCRIBE UN NUMERO 1(SELLO) o 2(AGUILA)");
        apuesta = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("EL VALOR DE LA MONEDA ES "  + moneda);
        //0.5 ES EL RANGO >0.5 CARA, MENOR ES CRUZ
        if(moneda > 0.5 && apuesta==1)
            System.out.println("ADIVINASTE ES SELLO!!!");
        else
            if(moneda<=0.5 && apuesta==2)
                System.out.println("ADIVINASTE ES AGUILA!!!");
            else
                System.out.println("PERDISTE");
    }
    
}
