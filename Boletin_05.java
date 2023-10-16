
 
package boletin_05;
import java.util.Scanner;

public class Boletin_05 {

    public static void main(String[] args) {
        
        Consumo renault=new Consumo();
        renault.setLitros(50);
        renault.setPgas(1.57f);
       System.out.println("Los litros son: " + renault.getLitros());
       System.out.println("Los litros son: " + renault.getPgas());
       //pedimos litros y precio de gasolina
      
        Consumo citroen=new Consumo(5, 66, 555, (float)1.44); // 2º objeto
        
        citroen.setConsumomedio(); // pedimos el consumo medio del segundo objeto
        citroen.setLitros(40);
        System.out.println("La velocidad media es de:" + citroen.getvMed());
        
        
     
    }
    
}
