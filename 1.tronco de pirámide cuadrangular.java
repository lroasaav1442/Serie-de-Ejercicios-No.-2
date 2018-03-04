import java.util.Scanner; 
import java.lang.Math;
public class tronco_de_pirámide {

	public static void main(String[] args) {

		int b;
		int mayus_B;
		int altura_h;
		double area_lateral;
		int area_de_B_inferior;
		int area_de_b_superior;
		double area_total;

		Scanner entrada = new Scanner (System.in) ; 
		System.out.println ("Ingrese valor de b del lado cuadrado superiro : ");
		b = entrada.nextInt();
		System.out.println ("Ingrese valor de B del lado cuadrado inferior : ");
		mayus_B = entrada.nextInt();
		System.out.println ("Ingrese valor de altura del tronco : ");
		altura_h = entrada.nextInt();

		area_lateral = 4 * (mayus_B + b) * altura_h / 2;

		area_de_B_inferior = mayus_B * mayus_B;
		area_de_b_superior = b * b;

		area_total = area_lateral + area_de_B_inferior + area_de_b_superior;

		System.out.println("El area total es igual a :"+area_total);

		double valor_volumen;

		valor_volumen = altura_h / 3 * (area_de_b_superior + area_de_B_inferior +Math.sqrt(area_de_b_superior*area_de_B_inferior));
		
		System.out.println("El volumen del tronco es de : "+valor_volumen);
	}

}