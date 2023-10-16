
package boletin_05;
import java.util.Scanner;

public class Consumo {
    
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    
    //constructor con parámetros
    public Consumo(float k, float l, float vM, float pG){
        km=k;  litros=l; vMed=vM; pGas=pG; 
        
        
    }
    // contructor por defecto
    public Consumo(){
        
    }
    public void setKm(float k){
       km=k;
        
    }
   public float getKm(){
       return km;
   }
    public void setVmed(float vM){
        
        vMed=vM;
    }
    public float getvMed(){
        return vMed;
    }
    public void setLitros(float l){
      
        litros=l;
    }
    public float getLitros(){
        return litros;
    }
    public void setPgas(float pG){
       
        pGas=pG;
    }
    public float getPgas(){
        return pGas;
    }
   
    public void getTiempo(){
        System.out.println("El tiempo del viaje es de: " + km/vMed);
    } //metodo para el tiempo de viaje
    public void setConsumomedio(){
        System.out.println("El consumo medio de litros es de: " + (litros/km)*100);
    } // metodo para el consumo de litros
    public void setConsumoeuros(){
        System.out.println("El consumo medio en euros es de:" + (pGas*100)/km);
    } // metodo para el consumo en euros
    
    
    
    
    
    
    
    
}
