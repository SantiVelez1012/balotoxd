/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balotoxd;

// EN ESTA CLASE SE REALIZARÁ EL INGRESO DE DATOS
import java.util.Scanner;

public class clsIngresoDatos {
    Scanner teclado = new Scanner(System.in);
    public int[] ingresoDatosUsuario(){
        int[] balotasUsuario = new int[6];
        
        for(int i = 0; i < 6; i ++){
            if(i == 5){
                do{
                    System.out.println("Ingrese la Super Balota (Entre 1 y 16)");
                    balotasUsuario[i] = teclado.nextInt();
                }while(balotasUsuario[i] < 1 || balotasUsuario[i] >16);
                
            }else{
                do{
                    System.out.println("Ingrese la balota numero " + (i+1) + " (RECUERDE -- NUMEROS ENTRE 1 y 43)");
                    balotasUsuario[i] = teclado.nextInt();
                }while(balotasUsuario[i] < 1 || balotasUsuario[i] > 43);
                
            }
            
        }
        
        
        
        return balotasUsuario;
    }
    
    
    
}
