package entidade;

public class Flauta implements InstrumentoMusical {

    public void tocarNota(String nota) {
        System.out.println("Flauta tocando a nota: " + nota);
    }

    public void afinar() {
        System.out.println("Afinando a flauta.");
    }
}