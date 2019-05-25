package paralela;

public class Moto {
	//dados da moto 
	String placa="";
	String ano;
	String marca;
	String modelo;
	double valor;
	double quilometragem;
	double imposto;

	public Moto(double valor, String placa) {
		this.valor = valor;
		this.placa = placa;
	}
	//calculo do imposto
	void imposto () {
		imposto = (valor * 0.025); 
	}
}
