/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PEDIRLE AL USUARIO CARA O CRUZ
        //SI INTRODUCE 1 = CARA 2= CRUZ
        double moneda;
        int apuesta;
        Scanner captu = new Scanner (System.in);
        System.out.println("ESCRIBE UN NUMERO 1(SELLO) o 2(AGUILA)");
        apuesta = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("EL VALOR DE LA MONEDA ES "  + moneda);
        
        if(moneda > 0.5)
            System.out.println("AGUILA");
            
        else
            System.out.println("SELLO");
        
        if(moneda > 0.5 && apuesta == 2)
            System.out.println("Ganaste eres la mera verga");
        else{
         if(moneda < 0.5 && apuesta == 1)
                System.out.println("Ganaste eres la pura");
         else
                System.out.println("Perdiste putito");
            }
    }
    
}
