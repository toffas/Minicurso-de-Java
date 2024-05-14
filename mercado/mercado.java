package xfce4Pocante;

import java.util.Scanner;

import entidades.produto;

public class mercado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		produto x = new produto();
		
		System.out.println("Qual o nome do produto?");
		x.nome = sc.next();
		
		System.out.println("Qual o preço do produto?");
		x.preco= sc.nextDouble();
		
		do {
		System.out.println("Qual a quantidade em estoque?");
		x.qtd= sc.nextDouble();
		
		System.out.println("Deseja mudar a quantidade em estoque? Digite S para mudar a quantidade");
		}while (sc.next().equalsIgnoreCase("S"));
		
		x.qtdFinal = x.qtd;
		
		x.precoTotal = x.qtdFinal * x.preco;
		
		System.out.println("A quantidade final é " + x.qtdFinal + "e o preço em estoque é " + x.precoTotal);
		
		sc.close();
	}
}
