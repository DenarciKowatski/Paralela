package paralela;

public class Passeio extends Moto{
	//especificacoes do carro de passeio mais as da moto que sao puxadas pelo extends 
	int assentos;
	double seguro;

	public Passeio(double valor, String placa) {
	super(valor, placa);
	this.seguro = (valor * 0.01);
	}
	//calculo do imposto
	void imposto () {
	imposto = (valor * 0.05);
	}
}
