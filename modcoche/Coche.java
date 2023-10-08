package modcoche;

public class Coche {
	
	private int ruedas;
	
	private int ancho;
	
	private int largo;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	private boolean radio_coche;
	
	
	
	
	
	public Coche() {
		
		
		ruedas=4;
		
		ancho=300;
		
		largo=2000;
		
		motor=1600;
		
		peso_plataforma=500;
		
		
				
		
	}
	
	public String dime_todo() {
		
		
		return "el largo de tu coche es " + largo/1000 + " metros " + " la plataforma del vehIculo pesa " + peso_plataforma + " kilogramos " + 
				"el vehiculo tiene " + ruedas + " ruedas" + " y un ancho de " + ancho + " cm con un motor de " + motor + " cv";
	}
			
	
	public void dime_color(String color_coche) {
		
		
	color=color_coche;	
	
	}
	
	
	public String dame_color() {
	
	return"el color del coche es " + color;	
		
	}
	
	
	public void establece_asientos(String asientos_cuero) {
		
		
	if(asientos_cuero.equalsIgnoreCase("si")){
		
		
		this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;}
		}
	
	public String dime_asientos() {
		
		if(asientos_cuero==true) {
		
		return" tu coche tiene asientos de cuero ";
				}
				
		else{
			
		return " tu coche tiene asientos de serie ";	
			
		}
				
			
	}
	
	
	public void configura_climatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")){
			
			this.climatizador=true;
			
		}else{this.climatizador=false;
			}
			
		}
	
	
	
	public String dime_climatizador() {
		
		if(climatizador==true) {
			
			return "tu coche tiene climatizador";
		}
		else {
			
			return "tu coche se puede ir a la mierda";
		}
	}
	
	
	public void configura_radio(String radio_coche) {
		
		if(radio_coche.equalsIgnoreCase("si")) {
			
			this.radio_coche=true;
			
		}
		
		else {this.radio_coche=false;
		
		}
	}
	
	
	public String dime_radio() {
		
		if(radio_coche==true) {
			
			return "tu coche puede escuchar el partidazo de cope y sus paridas de florentino";
		} else {
			return "no tienes radio, así que te jodes moro de mierda";
		}
		
		
	}
	
	public String dime_peso_coche_final() {
		
	
	int peso_carroceria=700;
	
	peso_total=peso_plataforma+peso_carroceria;
	
	if(asientos_cuero==true) {
		
	peso_total=peso_total+100;
	
	if(climatizador==true) {
		
		peso_total=peso_total+40;
	}
		
	}
	
	return " el peso de tu coche es " + peso_total;
		
	}
	
	public int precio_coche() {
		
	int precio_final=20000;	
	
	
	if(asientos_cuero==true) {
		
		precio_final+=3000;}
		
	if(climatizador==true) {
		
		precio_final+=89;}
		
	if(radio_coche==true) {
		
		precio_final+=500;
	}
	
	
	return precio_final;	
	}
	
	
	}


