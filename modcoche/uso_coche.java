package modcoche;

public class uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Citroen=new Coche();
		
		
		Citroen.dime_color("rosa");
		
		System.out.println(Citroen.dame_color());
		
		System.out.println(Citroen.dime_todo());
		
		Citroen.establece_asientos("si");
		
		System.out.println(Citroen.dime_asientos());
		
		Citroen.configura_climatizador("si");
		
		System.out.println(Citroen.dime_climatizador());
		
		Citroen.configura_radio("si");
		
		System.out.println(Citroen.dime_radio());
		
		System.out.println(Citroen.dime_peso_coche_final());
		
		System.out.println(" El precio final de esta pocilga es " + Citroen.precio_coche());
		
		
		
		
		

	}

}
