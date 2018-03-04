package hexagono;

import java.text.DecimalFormat;
import java.util.Scanner; 
import java.text.DecimalFormat;


public class hexagono {

	public static void main(String[] args) {
	

	Scanner entrada = new Scanner (System.in) ; 

	//Preguntar bien por que no se, es un numero 6
	int numero_de_lados;

	double dato_ap;
	double numero_de_lados_1;
	double formula;
	double elvado_l;
	double resultado;
	double numero61 = 6;
	double formula_fina;
	double formula_final;
	double numero;
	int x = 2;

	//Aqui ira para encontrar el apotema:
	DecimalFormat df = new DecimalFormat("0.00");
	System.out.println ("Ingrese de la longitud del lado : ");
	numero_de_lados = entrada.nextInt();
	
	numero_de_lados_1 = numero_de_lados * numero_de_lados;

	resultado = numero_de_lados / 2; 
	
	elvado_l = resultado * resultado;

	formula = numero_de_lados_1 - elvado_l;

	DecimalFormat decimales = new DecimalFormat("0.00");

	System.out.println(decimales.format(Math.sqrt(+formula)));

	//aplicar la formula con la que calculamos el area.
	
	System.out.println("\nIngrese por favor el dato anterior que corresponde al valor del apotema: ");
	dato_ap = entrada.nextDouble();

	numero = numero61 * numero_de_lados;

	formula_final = numero *  dato_ap;

	formula_fina = formula_final / x;

	System.out.println("El area del hexágono es :" + (decimales.format(formula_fina)));
	}

}