/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String usuario,pwd;
       String USUARIO = "Admin";
       String PASSWORD = "Admin";
       
       Scanner captu = new Scanner(System.in);
       //COMO ES UN CONTROL DE ACCESO, DEBEMOS PREGUNTAR UN NUMERO INDETERMINADO DE VECES, HASTA QUE ESTO ESTE CORRECTO
       while (true){
           System.out.println("USUARIO");
           usuario = captu.nextLine();
           System.out.println("CONTRASEÑA: ");
           pwd = captu.nextLine();
           if (usuario.equals(USUARIO)&& pwd.equals(PASSWORD))//USUARIO Y CONTRASEÑA CORRECTOS
               break;
       }
        System.out.println("BIENVENIDO AL SISTEMA");
       
    }
    
}
