package minucursojava;

import java.util.Scanner;

public class pdfativ9 {
	public static void main (String []args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o n�mero 1: ");
		double n1 = leitor.nextDouble();
		System.out.println("Digite o n�mero 2: ");
		double n2 = leitor.nextDouble();
		System.out.println("Digite o n�mero 3: ");
		double n3 = leitor.nextDouble();
		
		if (n1>n2 && n1>n3) {
			System.out.println("O n�mero 1 � o maior dos 3");
		}else if (n2>n1 && n2>n3) {
			System.out.println("O n�mero 2 � o maior dos 3");
		}else if (n3>n1 && n3>n2) {
			System.out.println("O n�mero 3 � o maior");
		}
		leitor.close();
	}
}
