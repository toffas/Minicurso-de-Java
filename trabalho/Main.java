import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando alguns livros à biblioteca
        Livro livro1 = new Livro("Java Programming", "John Doe", "1234567890", 5);
        Livro livro2 = new Livro("Effective Java", "Joshua Bloch", "0987654321", 3);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Adicionando usuários
        Usuario usuario1 = new Usuario("Alice", "U001");
        Usuario usuario2 = new Usuario("Bob", "U002");
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        // Emprestando um livro
        Emprestimo emprestimo1 = biblioteca.emprestarLivro(usuario1, livro1);
        if (emprestimo1 != null) {
            System.out.println("Livro emprestado: " + emprestimo1.getLivro());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }

        // Buscando livros
        List<Livro> resultadosBusca = biblioteca.buscarLivro("Java");
        System.out.println("Resultados da busca por 'Java':");
        for (Livro livro : resultadosBusca) {
            System.out.println(livro);
        }

        // Devolvendo um livro
        biblioteca.devolverLivro(emprestimo1);
        System.out.println("Livro devolvido: " + emprestimo1.getLivro());

        // Atualizando quantidade de livros em estoque
        livro1.setQuantidadeEmEstoque(10);
        System.out.println("Quantidade atualizada de 'Java Programming': " + livro1.getQuantidadeEmEstoque());

        // Removendo um livro
        biblioteca.removerLivro(livro2);
        System.out.println("Livro 'Effective Java' removido da biblioteca.");
    }
}
