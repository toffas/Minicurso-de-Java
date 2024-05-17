package entidade;

public class Carro implements Transporte {

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void virar(String direcao) {
        System.out.println("O carro está virando para " + direcao + ".");
    }
}