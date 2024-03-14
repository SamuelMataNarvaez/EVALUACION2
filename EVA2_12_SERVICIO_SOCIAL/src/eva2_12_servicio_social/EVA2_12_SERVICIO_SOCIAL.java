/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_12_SERVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos,semestre;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿QUE SEMESTRE CURSAS?");
        semestre = captu.nextInt();
        System.out.println("¿CUANTOS CREDITOS LLEVAS?");
        creditos = captu.nextInt();
        //INDICAR SI PUEDE O NO REALIZAR EL SERVICIO SOCIAL, IR EN 6TO SEMESTRE O SUPERIOR, TENER AL MENOS 150 CREDITOS
        if ((semestre >= 6) && (creditos >= 150))
        System.out.println("PUEDES REALIZAR EL SERVICIO SOCIAL");
        else
        System.out.println("NO PUEDES REALIZAR SERVICIO SOCIAL");
    }
    
}
