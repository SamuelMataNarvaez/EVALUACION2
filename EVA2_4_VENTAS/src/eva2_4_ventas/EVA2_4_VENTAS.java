/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int piezas,calcSaldo;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿cuantas piezas quieres comprar?");
        piezas = (int) captu.nextDouble();
        if (piezas > 1000)
            calcSaldo = piezas * 500;
        else
             calcSaldo = piezas * 800;
        System.out.println("El saldo es: " + calcSaldo);
        
    }
    
}
