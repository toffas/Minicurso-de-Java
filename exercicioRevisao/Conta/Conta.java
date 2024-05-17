package minicursojava;

import entidade.ContaCorrente;
public class Conta {
	 public static void main(String[] args) {

	        ContaCorrente conta = new ContaCorrente("João Silva", 500.00);
	        
	        System.out.println("Titular: " + conta.getTitular());
	        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

	        conta.depositar(200.00);
	        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
	        
	        conta.sacar(100.00);
	        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

	        conta.sacar(-50.00);

	        conta.sacar(700.00);
	        System.out.println("Saldo final: R$ " + conta.getSaldo());
	    }
	}

