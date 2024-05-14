package xfce4Pocante;

import java.util.Scanner;

import entidades.banco;
public class ContaBancaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		banco cliente = new banco();
		
		System.out.println("Digite o nome do titular da conta:");
		cliente.nome =sc.next();
		
		System.out.println("Digite o número da conta do cliente" + cliente.nome);
		cliente.num = sc.nextInt();
		
		System.out.println("Digite o saldo do cliente: ");
		cliente.saldo = sc.nextDouble();
		
		System.out.println("Escolha alguma função:");
		System.out.println("1- Verificar saldo da conta");
		System.out.println("2- Depositar");
		System.out.println("3- Saque");
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1: 
			System.out.println(cliente.saldo);
			break;
		case 2:
			System.out.println("Qual o valor do deposito?");
			cliente.deposito = sc.nextDouble();
			cliente.saldoFinal = (cliente.deposito + cliente.saldo);
			System.out.println("O valor final com deposito é " + cliente.saldoFinal);
			break;
		case 3:
			System.out.println("Qual o valor do saque?");
			cliente.deposito = sc.nextDouble();
			cliente.saldoFinal = (cliente.saldo - cliente.deposito);
			System.out.println("O saldo final com o saque é" + cliente.saldoFinal);
		}
		sc.close();
		
	}
}
