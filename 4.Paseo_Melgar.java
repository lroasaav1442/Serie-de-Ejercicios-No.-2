import java.util.Scanner; 
import java.lang.*;
public class Paseo_Melgar {

	public static void main(String[] args) {
		
		int estudiantes_gordos = 2; 
		int estudiantes_flacos  = 1;
		int capacidad_de_cupo_de_bus = 35;
		int plato_de_comida = 4500;
		int precio_que_se_paga_por_un_bus_ida_y_vuelta = 525000;
		int gordos_total;
		double estudiantes_total;
		int valor_de_buses;
		double divicion;
		int numero_de_buses;
		int gordos_comida;
		int gordos_cuantas_veces_come = 5 ;
		int flacos_comida;
		int flacos_cuantas_veces_come = 3;
		int platos_de_comida_total_valor1;
		int platos_de_comida_total_valor2;
		int total_valor_de_comida;
		int gordos_dormir;
		int flacos_dormir;
		int numero_de_habitaciones;
		int valor_de_habitacion_hotel_dia = 20000;
		int costo_de_habitaciones;
		int costo_total_de_dias_del_hotel;
		int dias;
		/*
		 * Hallar el número de buses que se van a necesitar para el paseo, sabiendo que en un bus, los estudiantes
		   gordos ocupan dos sillas y los flacos sólo una
		 */
		Scanner entrada = new Scanner (System.in) ;
		System.out.println ("Ingrese numero de esudiantes gordos que van a ir al paseo, tenga en cuenta que los estudiantes gordos ocupan dos asientos: ");
		gordos_total = entrada.nextInt();
		System.out.println ("Ingrese numero de estudiantes flacos que van a ir al paseo :");
		estudiantes_flacos = entrada.nextInt();
		estudiantes_total = (estudiantes_gordos * gordos_total + estudiantes_flacos) ; 
		System.out.println("El numero de sillas que se van a necesitar para los estudiantes es de :"+estudiantes_total+" asientos.");
		divicion = (estudiantes_total / capacidad_de_cupo_de_bus);
		if (estudiantes_total <=70 ){
			System.out.println("\nEl numero de sillas que hay en cada bus es de 35.");
			System.out.println("\nSi el numero de sillas es de "+estudiantes_total+" entonces se van a necesitar 2 buces.");
			 }
		if (estudiantes_total >70 ){
			
			System.out.println("\nSi el numero de sillas es de "+estudiantes_total+" entonces el numero de buses que se van a necesitar seran "+Math.ceil(divicion));
			
			}
		/*
		 * Determinar cuánto dinero nos cuesta alquilar esos buses. Tenga en cuenta que se contratan tanto para ir como para regresar.
		 */
		System.out.println ("\nIngrese numero de buses que se van a contratar :");
		numero_de_buses = entrada.nextInt();
		valor_de_buses = precio_que_se_paga_por_un_bus_ida_y_vuelta * numero_de_buses;
		System.out.println ("El coste del alquiler de los buses para el paseo hasta Melgar ida y vuelta es de "+valor_de_buses+"$");

		/*
		 * Encontrar el valor a pagar por la comida, sabiendo que los estudiantes gordos comen 5 veces al día, mientras los estudiantes flacos solo comen 3 veces al día.
		 */
		System.out.println ("\nIngrese numero de gordos que van a comer el unico plato que hay tiene un valor de 4500$ :");
		gordos_comida = entrada.nextInt();
		System.out.println ("\nIngrese numero de flacos que van a comer el unico plato que hay tiene un valor de 4500$ :");
		flacos_comida = entrada.nextInt();

		platos_de_comida_total_valor1 = (gordos_comida * gordos_cuantas_veces_come);
		platos_de_comida_total_valor2 = ( flacos_comida* flacos_cuantas_veces_come);
		total_valor_de_comida = (platos_de_comida_total_valor1 + platos_de_comida_total_valor2 * plato_de_comida );

		System.out.println("EL valor total de todas las comidas de un dia de los estudiantes es de :" + total_valor_de_comida+" $");

		/*
		 * Hallar el número de habitaciones que se necesitan reservar para que duerman los estudiantes.
		 */
		System.out.println("\nPara las habitciones de hotel, tenga encuenta que se pueden dormir dos estudiantes por habitacion. ");
		System.out.println ("\nIngrese numero de gordos que van a dormir : ");
		gordos_dormir = entrada.nextInt();
		System.out.println ("\nIngrese numero de flacos que van a dormir : ");
		flacos_dormir = entrada.nextInt();
		numero_de_habitaciones = ((gordos_dormir + flacos_dormir) / 2);
		System.out.println("El numero de habitaciones que se van a necesitar es de : " +numero_de_habitaciones);

		/* 
		*Encontrar el valor a pagar por las habitaciones del hotel, diario y en total por la duración del paseo
		*/
		costo_de_habitaciones = numero_de_habitaciones * valor_de_habitacion_hotel_dia;
		System.out.println("\nEl coste de habitaciones por dia es de: "+ costo_de_habitaciones);
		

		System.out.println("\nIngrese el numero de dias que va a durar el paseo");
		dias = entrada.nextInt();
		costo_total_de_dias_del_hotel = costo_de_habitaciones * dias;
		System.out.println(" El valor de las habitaciones por la duracion del paseo es de :"+costo_total_de_dias_del_hotel+"$");
		
	}

}