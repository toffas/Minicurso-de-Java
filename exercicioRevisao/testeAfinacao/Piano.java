package entidade;

public class Piano implements InstrumentoMusical {

    public void tocarNota(String nota) {
        System.out.println("Piano tocando a nota: " + nota);
    }

    public void afinar() {
        System.out.println("Afinando o piano.");
    }
}
