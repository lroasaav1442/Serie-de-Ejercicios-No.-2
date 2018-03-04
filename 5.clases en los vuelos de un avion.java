package avioncalses;

import java.util.Scanner; 

public class avion {

	public static void main(String[] args) {
		
		int clase1 = 500000;
		int clase2 = 200000;
		int clase3 = 125000;
		double clase;
		double numero_tiquetes_que_ha_seleccionado_cl1;
		double numero_tiquetes_que_ha_seleccionado_cl2;
		double numero_tiquetes_que_ha_seleccionado_cl3;
		double dinero_recogido_en_cl1 = 1;
		double dinero_recogido_en_cl2;
		double dinero_recogido_en_cl3;

		System.out.println(" Bienvenido querido pasajero aqui se podran ver los precios de los asientos :");
		System.out.println((" 1. El asiento de primera clase tiene un precio de 500.000$. ")+("\n 2. El asiento de segunda clase tiene un precio de 200.000$. ")+("\n 3. El asiento de tercera clase tiene un precio de 125.000$."));

		Scanner entrada = new Scanner (System.in) ;
		System.out.println ("\nSeleccione por favor pasajero la clase desea viajar: ");
		clase = entrada.nextInt();

		if(clase == 1){

			System.out.println("Ingrese numero de pasajeros que hay en primera clase:  ");
			numero_tiquetes_que_ha_seleccionado_cl1 = entrada.nextInt();

			dinero_recogido_en_cl1 = numero_tiquetes_que_ha_seleccionado_cl1 * clase1;

			System.out.println("\n El total de dinero de los pasajes vendidos en primera clase es de : "+dinero_recogido_en_cl1);
			}

		if(clase == 2){
			
			System.out.println("Ingrese numero de pasajeros que hay en segunda clase:  ");
			numero_tiquetes_que_ha_seleccionado_cl2 = entrada.nextInt();

			dinero_recogido_en_cl2 = numero_tiquetes_que_ha_seleccionado_cl2 * clase2;

			System.out.println("\n El total de dinero de los pasajes vendidos en segunda clase es de : "+dinero_recogido_en_cl2);
			}
		if(clase == 3){
			
			System.out.println("Ingrese numero de pasajeros que hay en tercera clase:  ");
			numero_tiquetes_que_ha_seleccionado_cl3 = entrada.nextInt();

			dinero_recogido_en_cl3 = numero_tiquetes_que_ha_seleccionado_cl3 * clase3;

			System.out.println("\n El total de dinero de los pasajes vendidos en tercera clase es de : "+dinero_recogido_en_cl3);
			}
		
		}
		
	}