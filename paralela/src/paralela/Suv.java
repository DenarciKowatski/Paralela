package paralela;

public class Suv extends Passeio{
	//especificacoes do SUV, mais as do carro de passeio que sao puxadas pelo extends
	public Suv(double valor, String placa) {
	super(valor, placa);
	this.seguro = (valor * 0.015);
	}
	//calculo do imposto
	void imposto () {
	imposto = (valor * 0.08);
	}
}
