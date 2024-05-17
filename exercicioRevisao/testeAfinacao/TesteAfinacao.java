package minicursojava;
import entidade.InstrumentoMusical;
import entidade.Violao;
import entidade.Flauta;
import entidade.Piano;

public class TesteAfinacao {
	public class Main {
	    public static void main(String[] args) {
	        InstrumentoMusical violao = new Violao();
	        InstrumentoMusical piano = new Piano();
	        InstrumentoMusical flauta = new Flauta();

	        // Testando o violão
	        violao.tocarNota("C");
	        violao.afinar();

	        // Testando o piano
	        piano.tocarNota("D");
	        piano.afinar();

	        // Testando a flauta
	        flauta.tocarNota("E");
	        flauta.afinar();
	    }
	}
}
