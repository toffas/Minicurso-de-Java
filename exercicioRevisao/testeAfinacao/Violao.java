package entidade;

public class Violao implements InstrumentoMusical {

    public void tocarNota(String nota) {
        System.out.println("Violão tocando a nota: " + nota);
    }

    public void afinar() {
        System.out.println("Afinando o violão.");
    }
}
