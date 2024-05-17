package entidade;

public class Caminhao implements Transporte {

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando.");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("O caminhão está virando para " + direcao + ".");
    }
}

