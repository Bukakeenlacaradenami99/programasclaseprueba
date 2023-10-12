import java.util.*;
public class Extra1 {

	private String nombre;
	private Date fecha;
	
	public Extra1(String nom, int day, int month, int year) {
		
		nombre=nom;
		GregorianCalendar nacim=new GregorianCalendar(1994, 5, 2);
		fecha=nacim.getTime();
		
		
		
	}
	
	public void setNombre() {
		 
		System.out.println("Tu nombre es: " + nombre);
	}
	
	
	public void setFecha() {
		
		System.out.println("Naciste el: " + fecha);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
