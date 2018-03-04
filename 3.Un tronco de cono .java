
import java.util.Scanner; 
public class Un_tronco_de_cono_3 {

	public static void main(String[] args) {
		
		int area_de_base;
		int area_superior; 
		int h_altura;
		int area;
		int generatriz;
		int suma;
		int area_1;
		int volumen;
		int multi_2;
		Scanner entrada = new Scanner (System.in) ;

		System.out.println ("Ingrese valor valor de la base : ");
		area_de_base = entrada.nextInt();
		System.out.println ("Ingrese valor superior de la tapa : ");
		area_superior = entrada.nextInt();
		System.out.println ("Ingrese valor valor de la generatriz : ");
		generatriz = entrada.nextInt();
		System.out.println ("Ingrese valor valor de altura : ");
		h_altura= entrada.nextInt();

		area = (area_superior * area_superior) + (area_de_base * area_de_base);
		suma = (area_de_base + area_superior)*generatriz;
		area_1 = suma + area;

		System.out.println("El valor del area de nuestro tronco de cono es de: "+area_1);

		System.out.println(" Para calcular el volumen.");

		volumen = (area_de_base*area_de_base)+(area_superior*area_superior)+(area_de_base*area_superior);
		multi_2 = volumen * h_altura /3;

		System.out.println("El volumen del tronco de cono es de: "+ multi_2);
	}

}
