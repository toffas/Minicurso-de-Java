package entidade;

public class Moto implements Transporte {

    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    public void frear() {
        System.out.println("A moto está freando.");
    }

    public void virar(String direcao) {
        System.out.println("A moto está virando para " + direcao + ".");
    }
}