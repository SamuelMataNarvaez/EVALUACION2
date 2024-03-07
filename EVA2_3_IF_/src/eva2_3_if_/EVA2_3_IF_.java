/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if_;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_3_IF_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double calif;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce la calificacion");
        calif = captu.nextDouble();
        if(calif>=70){ //esta seccion --> true
           //las llaves son opcionales, solo cuanto tenemos mas de una instruccion
            System.out.println("APROBASTE!!!!");
        }else{ //la evaluacion false es opcional
            System.out.println("SUERTE PARA LA PROXIMA");
            
        }
    }
    
}
