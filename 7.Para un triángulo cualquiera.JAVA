import java.lang.Math;
import java.util.Scanner; 

public class triángulo_cualquiera {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		// a b c
		double valor_de_a;
		double valor_de_b;
		double valor_de_c;
		double semiperimetro;
		double valor_s;
		Scanner entrada = new Scanner (System.in) ;
		// El semiperimetro.
		// Formula s= a + b + c / 2
		System.out.println ("Ingrese por favor el valor de a : ");
		valor_de_a = entrada.nextInt();
		System.out.println ("Ingrese por favor el valor de b : ");
		valor_de_b = entrada.nextInt();
		System.out.println ("Ingrese por favor el valor de c : ");
		valor_de_c = entrada.nextInt();

		semiperimetro = (valor_de_a+valor_de_b+valor_de_c);
		valor_s = semiperimetro / 2;

		System.out.println("El valor del semiperimetro es: "+ valor_s);

		//El area apartir del semiperimetro.
		//Formula.
		int area_A;
		int resta_a;
		int resta_b;
		int resta_c;
		int multiplicaion_a_por_s;
		int multiplicaion_b_por_s;
		int multiplicaion_c_por_s;
		double valor_de_multiplicacion_A;


		valor_de_multiplicacion_A = (Math.sqrt(valor_s * ((valor_s-valor_de_a)*(valor_s-valor_de_b)*(valor_s-valor_de_c))));
		System.out.println(valor_de_multiplicacion_A);

		System.out.println("El area del trinagulo es : "+valor_de_multiplicacion_A);

		//circumradius
		int a_b_c;
		double circumradius1;
		double circumradius;

		a_b_c = (int) (valor_de_a * valor_de_b * valor_de_c);

		circumradius1 = 4*Math.PI * Math.sqrt(valor_s * ((valor_s-valor_de_a)*(valor_s-valor_de_b)*(valor_s-valor_de_c)));
		circumradius = a_b_c / circumradius1;

		System.out.println("EL valor del circumradius: "+circumradius);
	}

}