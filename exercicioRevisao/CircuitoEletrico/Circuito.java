package minicursojava;

import entidade.CircuitoEletrico;

public class Circuito {
	public static void main(String[] args) {
		
		CircuitoEletrico circuito = new CircuitoEletrico(220, 5);		
		
        System.out.println("Tensão: " + circuito.gettensao() + " V");
        System.out.println("Corrente: " + circuito.getcorrente() + " A");

        System.out.println("Resistência: " + circuito.CalcularResistencia() + " Ω");

        System.out.println("Potência Dissipada: " + circuito.CalcularPotenciaDissipada() + " W");

        circuito.settensao(110);
        circuito.setcorrente(10);

        System.out.println("\nApós a alteração:");
        System.out.println("Tensão: " + circuito.gettensao() + " V");
        System.out.println("Corrente: " + circuito.getcorrente() + " A");

        System.out.println("Resistência: " + circuito.CalcularResistencia() + " Ω");

        System.out.println("Potência Dissipada: " + circuito.CalcularPotenciaDissipada() + " W");
		}
	}

