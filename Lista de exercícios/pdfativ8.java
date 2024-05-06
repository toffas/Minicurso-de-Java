package minucursojava;

import java.util.Scanner;

public class pdfativ8 {
	public static void main(String []args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a tempetatura em celcius: ");
		double c = leitor.nextDouble();
		
		double resultado = (c * 1.8)+32;
		
		System.out.println("Em fahrenheit é "+resultado);
		
		leitor.close();
	}
}
