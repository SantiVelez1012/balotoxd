/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balotoxd;




public class clsValidacion {
    
    private int[] balotasUsuario, balotasSorteo;

    public clsValidacion(int[] balotasUsuario, int[] balotasSorteo) {
        this.balotasUsuario = balotasUsuario;
        this.balotasSorteo = balotasSorteo;
    }
    
    
    public int validarBalotasNormales(){
        int cantBalotas = 0;
        for(int i = 0; i < 5; i++){
            if(balotasUsuario[i] == balotasSorteo[i]){
                cantBalotas++;
            }
        }
        
        return cantBalotas;
    }
    
    
    public boolean validarSuperBalota(){
        boolean superBalota = false;
        if(balotasUsuario[5] == balotasSorteo[5]){
            superBalota = true;
        }
        
        return superBalota;
    }
    
    
    public void impresionMensaje(int cantBalotas, boolean superBalota){
        
        if(cantBalotas == 5 && superBalota == true){
            System.out.println("Usted ha ganado el premio mayor, al acertar las 5 balotas y la super balota");
        }
        else if(cantBalotas == 4 && superBalota == true){
            System.out.println("Usted acertó 4 numeros, y la super balota");
        }
        else if(cantBalotas == 3 && superBalota == true){
            System.out.println("Usted acertó 3 numeros, y la super balota");
        }
        else if(cantBalotas == 2 && superBalota == true){
            System.out.println("Usted acertó 2 numeros, y la super balota");
        }
        else if(cantBalotas == 1 && superBalota == true){
            System.out.println("Usted acertó 1 numeros, y la super balota");
        }else if(cantBalotas == 5 && superBalota == false){
            System.out.println("Usted acertó los 5 numeros, pero no la super balota");
        }
        else if(cantBalotas == 4 && superBalota == false){
            System.out.println("Usted acertó 4 numeros, pero no super balota");
        }
        else if(cantBalotas == 3 && superBalota == false){
            System.out.println("Usted acertó 3 numeros, pero no super balota");
        }
        else if(cantBalotas == 2 && superBalota == false){
            System.out.println("Usted acertó 2 numeros, pero no super balota");
        }
        else if(cantBalotas == 1 && superBalota == false){
            System.out.println("Usted acertó 1 numeros, pero no super balota");
        }else if(cantBalotas == 0 && superBalota == true){
            System.out.println("Usted solo acertó la super balota");
        }else{
            System.out.println("Usted no acertó ningún número, ni la superbalota");
        }
        
        
        
        
    }
    
    
}
