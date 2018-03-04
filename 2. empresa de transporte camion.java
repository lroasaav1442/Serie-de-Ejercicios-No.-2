/*Determinar el número de viajes que va a realizar el camión si va a llevar una carga a Sasaima. Determine
el número de galones de gasolina que se necesitan para todos los viajes. */

import java.util.Scanner; 

public class prueba {

	public static void main(String[] args) {
		
		double kilos_que_puede_llevar;
		double kilos_que_toca_llevar;
		int numero_de_viajes = 1;
		int multplicacion;
		int divicion;
		double numero_de_galones_hasta_sasaima_de_un_solo_viaje = 26;
		int numero_de_viajes_ha_realizar;
		
		
		Scanner entrada = new Scanner (System.in) ; 
		System.out.println ("Ingrese total de carga que tiene llevar el camion en kilos :");
		kilos_que_toca_llevar = entrada.nextInt();
		multplicacion = (int) (kilos_que_toca_llevar * numero_de_viajes) ; 
		System.out.println ("Ingrese capacidad de carga de camion por viaje en kilos : ");
		kilos_que_puede_llevar = entrada.nextInt() ; 
		divicion = (int) (multplicacion / kilos_que_puede_llevar);
		System.out.println("Numero de viajes que el camion tendra que realizar es de :"+divicion);
		
		System.out.println ("\nIngrese numero de viajes que ha realizar el camion :" );
		numero_de_viajes_ha_realizar = entrada.nextInt();
		multplicacion = (int) (numero_de_viajes_ha_realizar * numero_de_galones_hasta_sasaima_de_un_solo_viaje) ;
		System.out.println("El numero de galones que va ha gastar por todos estos viajes es de : "+multplicacion );

	}

}