package xfce4Pocante;

import java.util.Scanner;

import entidades.circulo;

import entidades.quadrado;

import entidades.Triangulo;

public class FiguraGeometrica {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	circulo c = new circulo();
	quadrado q = new quadrado();
	Triangulo t = new Triangulo();
	
	System.out.println("Escolha uma opção: ");
	System.out.println("1-Circulo ");
	System.out.println("2- Quadrado");
	System.out.println("3- Triangulo");
	int opcao = sc.nextInt();
	
	switch(opcao) {
	case 1: 
		System.out.println("Digite o raio:");
		c.raio=sc.nextDouble();
		c.resultado = (c.raio * c.raio)*Math.PI;
		System.out.println("A área é " + c.resultado);
		break;
	case 2:
		System.out.println("Digite o lado do quadrado:");
		q.lado = sc.nextDouble();
		q.resultado = (Math.pow(q.lado, q.lado));
		System.out.println("A área do quadrado é " + q.resultado);
		break;
	case 3:
		System.out.println("Digite a altura do triangulo: ");
		t.altura = sc.nextDouble();
		System.out.println("Digite o base do triangulo");
		t.base = sc.nextDouble();
		t.resultado = (t.base*t.altura)/2;
		System.out.println("A área do triangulo é" + t.resultado);
		break;
	}
	sc.close();
}
}
