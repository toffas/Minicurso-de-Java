package minicursojava;

import java.util.Scanner;

import entidade.boletim;

public class AlunoNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boletim b = new boletim();
		
		double[] notas = new double [5];
		
		
		System.out.println("Qual o nome do estudante?");
		b.nome = sc.next();
		
		System.out.println("Qual a matrícula do aluno?");
		b.matricula = sc.nextInt();
		
		System.out.println("Qual a nota do aluno em portugues? ");
		b.notas[0] = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno em matemática? ");
		b.notas[1] = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno em ciências? ");
		b.notas[2] = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno em história? ");
		b.notas[3] = sc.nextDouble();
		
		System.out.println("Qual a nota do aluno em geografia? ");
		b.notas[4] = sc.nextDouble();
		
		
		
		for (int i =0; i<b.notas.length; i++) {
			if (b.notas[i]<6) {
				System.out.println("O aluno: " + b.nome + " com matrícula: " + b.matricula + " não passou!");
				return;
				
			}

			
		}		
		System.out.println("O aluno: " + b.nome + " com matrícula: " + b.matricula + " passou!");
	}
}
