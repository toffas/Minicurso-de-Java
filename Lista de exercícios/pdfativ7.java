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
		
		System.out.println("Digite um n�mero: ");
		int n1 = leitor.nextInt();
		
		if (palindrome(n1)) {
			System.out.println("� um n�mero palindrono");
		}else {
			System.out.println("N�o � um n�mero palindromo");
		}
		leitor.close();
	}
}
