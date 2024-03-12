/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author user
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMERO ALEATORIO EN JAVA
        //VALORES ENTRE 0 Y 1
        //0.3134353435
        //0.65467898643
        double moneda;
        moneda = Math.random();
        System.out.println("EL VALOR DE LA MONEDA ES "  +moneda);
        //0.5 ES LA MITAD DEL RANGO
        if(moneda > 0.5)
            System.out.println("AGUILA");
        else
            System.out.println("SELLO");
    }
    
}
