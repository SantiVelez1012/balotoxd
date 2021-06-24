/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balotoxd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// ESTA CLASE SE ENCARGARÁ DE GENERAR EL SORTEO CORRESPONDIENTE
public class recopiladoraInformacion {
    
    
    
    
    public ArrayList<Integer> rellenoNumerosPosibles(){
        ArrayList <Integer> posiblesNumeros1 = new ArrayList<Integer>();
        for(int i = 1; i <= 43; i++){
            
            posiblesNumeros1.add(i);
            
        }
        
        return posiblesNumeros1;
    }
    
    public int[] generacionYValidacion(ArrayList <Integer> posiblesNumeros1){
        int [] balotasSorteo = new int[6];
        Random aleatorio = new Random();
        int indice;
        for(int i = 0; i<6; i++){
            if(i < 5){
                indice = aleatorio.nextInt(posiblesNumeros1.size());
                balotasSorteo[i] = posiblesNumeros1.get(indice);
                posiblesNumeros1.remove(indice);
            }else{
                indice = aleatorio.nextInt(16) + 1;
                balotasSorteo[i] = indice;
            }
        }
        return balotasSorteo;
    }
    
    
    
    
    
    
    
}
