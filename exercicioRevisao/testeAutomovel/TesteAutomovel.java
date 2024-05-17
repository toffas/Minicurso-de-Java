package minicursojava;
import entidade.Transporte;
import entidade.Caminhao;
import entidade.Carro;
import entidade.Moto;

public class TesteAutomovel {
	  public static void main(String[] args) {
	        Transporte carro = new Carro();
	        Transporte moto = new Moto();
	        Transporte caminhao = new Caminhao();

	        carro.acelerar();
	        carro.frear();
	        carro.virar("esquerda");

	        moto.acelerar();
	        moto.frear();
	        moto.virar("direita");

	        caminhao.acelerar();
	        caminhao.frear();
	        caminhao.virar("esquerda");
	    }
}
