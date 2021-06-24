/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balotoxd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Balotoxd {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        recopiladoraInformacion equisde = new recopiladoraInformacion();
        
        
        clsIngresoDatos ingresoUsuario = new clsIngresoDatos();
        
        
        ArrayList<Integer> posiblesNumeros = equisde.rellenoNumerosPosibles();
        
        
        int comprobacion = 0, cantBalotas;
        
        boolean superBalota;;
        
        
        int[] balotasSorteo = equisde.generacionYValidacion(posiblesNumeros);
        
        
        
        
        
        
        
        do{
            
            
            System.out.println("BIENVENIDO AL BALOTO");
            
            System.out.println("-------------------------------- PROCEDA A INGRESAR LOS NUMEROS ELEGIDOS PARA SU SORTEO -------------------------------");
            
            int[] balotasUsuario = ingresoUsuario.ingresoDatosUsuario();
            
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            
            
            System.out.println("Los numeros ingresados por usted son: " + Arrays.toString(balotasUsuario));
            
            
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            
            clsValidacion validacion = new clsValidacion(balotasUsuario, balotasSorteo);
            
            cantBalotas = validacion.validarBalotasNormales();
            
            superBalota = validacion.validarSuperBalota();
            
            System.out.println("A CONTINUACION SE LE MOSTRARÁ SU RESULTADO");
            
            validacion.impresionMensaje(cantBalotas, superBalota);
            
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            
            System.out.println("Si desea ingresar otro conjunto de numeros, escriba 0, si desea salir y conocer los numeros ganadores escriba 1");
            comprobacion = teclado.nextInt();
            
            
            
            
            
            
        }while(comprobacion != 1);
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Los numeros ganadores de este sorteo son: " + Arrays.toString(balotasSorteo));
        
    }
    
}
