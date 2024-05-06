package minucursojava;

import java.util.Scanner;

public class pdfativ7 {
	public static boolean palindrome(int num) {
		
		String numStr = Integer.toString(num);
		
		StringBuilder reversedStr = new StringBuilder(numStr).reverse();
		
		return numStr.equals(reversedStr.toString());
	}
	public static void main (String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = leitor.nextInt();
		
		if (palindrome(n1)) {
			System.out.println("É um número palindrono");
		}else {
			System.out.println("Não é um número palindromo");
		}
		leitor.close();
	}
}
