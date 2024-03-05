/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author user
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TODO CODE APLICATION LOGIC HERE
        //OPERADORES ARITMETICOS:
 
        //SUMA
        int num1, num2; //DECLARACION DE VARIABLES
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma
        //si en el operador + uno de los terminos es:
        //una cadena, todo se convierte a cadena y se unen
        //concatenacion: union de cadenas de texto
        System.out.println("La suma es: " + suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es:" + prueba);
        
        //MULTIPLICACION
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es:" + multi);
        
        //DIVISION
        int divi = 7 / 2;
        System.out.println("La division de 7/2 es:" + divi);
        double diviDouble = 7 / 2.0;
        System.out.println("La division (double) de 7/2 es:" + diviDouble);
        
        //ACUMULADORES
        //SUMA +=
        //RESTA -=
        //MULTI +=
        //DIVI /=
        int sumatoria = 0;
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;*/
        sumatoria +=90;//AGREGO 90 A SUMATORIA
        sumatoria +=80;
        sumatoria +=80;
        System.out.println("La sumatoria total es:"+sumatoria);
        sumatoria -=70; //LE RESTO 70 A SUMATORIA
        //sumatoria = sumatoria -70;
        System.out.println("La sumatoria:"+sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum = " + multiAcum);
        multiAcum *= 5;
        System.out.println("Multiacum = " + multiAcum);
        
    }
    
}
