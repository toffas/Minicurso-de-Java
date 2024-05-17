import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
        Biblioteca biblioteca = new Biblioteca();
        int escolha = 0;
        //-------------
        Livro livro1 = new Livro("Java Programming", "John Doe", "1234567890", 5);
        Livro livro2 = new Livro("Effective Java", "Joshua Bloch", "0987654321", 3);
        //-------------
        Usuario usuario1 = new Usuario("Alice", "U001");
        Usuario usuario2 = new Usuario("Bob", "U002");
        //-------------
        List<Livro> resultadosBusca = biblioteca.buscarLivro("Java");
        //-------------
        Emprestimo emprestimo1 = biblioteca.emprestarLivro(usuario1, livro1);
        //-------------
        
        do {
        	System.out.printf("escolha 1 2 3 4 5 6 7\n");
            escolha = sc.nextInt();
        	switch(escolha) {
            case(1):
            	// Adicionando alguns livros à biblioteca
                biblioteca.adicionarLivro(livro1);
                biblioteca.adicionarLivro(livro2);
                break;
            case(2):
            	// Adicionando usuários
                biblioteca.adicionarUsuario(usuario1);
                biblioteca.adicionarUsuario(usuario2);
                break;
            case(3):
            	// Emprestando um livro
                if (emprestimo1 != null) {
                    System.out.println("Livro emprestado: " + emprestimo1.getLivro());
                } else {
                    System.out.println("Livro não disponível para empréstimo.");
                }
            	break;
            case(4):
            	// Buscando livros
                System.out.println("Resultados da busca por 'Java':");
                for (Livro livro : resultadosBusca) {
                    System.out.println(livro);
                }
                break;
            case(5):
            	// Devolvendo um livro
                System.out.println("Livro devolvido: " + emprestimo1.getLivro());
            case(6):
            	// Atualizando quantidade de livros em estoque
                livro1.setQuantidadeEmEstoque(10);
                System.out.println("Quantidade atualizada de 'Java Programming': " + livro1.getQuantidadeEmEstoque());
                break;
            case(7):
            	// Removendo um livro
                biblioteca.removerLivro(livro2);
                System.out.println("Livro 'Effective Java' removido da biblioteca.");
                break;
            case(-1):
            	System.out.printf("Saída..\n");
            	break;
            default:
            	System.out.printf("Invalido\n");
            	break;
            }
        } while (escolha!=-1);
        
        sc.close();
    }
}
