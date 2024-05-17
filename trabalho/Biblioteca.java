import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> buscarLivro(String termo) {
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(termo) || livro.getAutor().contains(termo) || livro.getIsbn().contains(termo)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Emprestimo emprestarLivro(Usuario usuario, Livro livro) {
        if (livro.getQuantidadeEmEstoque() > 0) {
            livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque() - 1);
            usuario.emprestarLivro(livro);
            Emprestimo emprestimo = new Emprestimo("EMP" + (emprestimos.size() + 1), livro, usuario, new Date());
            emprestimos.add(emprestimo);
            return emprestimo;
        }
        return null; // Livro não está disponível
    }

    public void devolverLivro(Emprestimo emprestimo) {
        Livro livro = emprestimo.getLivro();
        livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque() + 1);
        Usuario usuario = emprestimo.getUsuario();
        usuario.devolverLivro(livro);
        emprestimo.setDataDevolucao(new Date());
    }
}
