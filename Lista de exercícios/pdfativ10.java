package minucursojava;

import java.util.Scanner;

public class pdfativ10 {
	public static void main (String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a tabuada requerida: ");
		double numero = leitor.nextDouble();
		
		for (int i = 1;i<=10; i++ ) {
			double resultado = numero* i;
			System.out.println(resultado);
		}
		leitor.close();
	}
}
