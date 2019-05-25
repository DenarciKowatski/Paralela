package paralela;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculos {
	
	//função para pegar valor do veiculo
	public static Double pegarValor() {
		Scanner ler = new Scanner(System.in);
		ler = new Scanner(System.in);//pegar a resposta do usuario
		
		System.out.println("Digite o valor do veiculo:");
		double valor = ler.nextDouble();
		ler.nextLine();
		
		return valor;
	}
	
	// funcao para pegar placa
	public static String pegarPlaca() {
		Scanner ler = new Scanner(System.in);
		ler = new Scanner(System.in);
		
		System.out.println("Digite a placa do veiculo:");
		String placa = ler.nextLine();
		
		return placa;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler = new Scanner(System.in);
		
		ArrayList<Moto> lista = new ArrayList();
		//enquanto for verdadeiro ira rodar, ate o usuario colocar a opcao 6
		
		
		
		while (true) {
			System.out.println("Digite uma opcao abaixo:");
			System.out.println("1 - Cadastrar uma moto.");
			System.out.println("2 - Cadastrar um veiculo de passeio.");
			System.out.println("3 - Cadastrar um Suv.");
			System.out.println("4 - Mostrar placa e valor.");
			System.out.println("5 - Mostrar soma dos impostos anuais.");
		

			int opcao = ler.nextInt();
			//cadastrar moto
			
			if (opcao == 1) {
				double valor = pegarValor();
				String placa = pegarPlaca();

				Moto moto = new Moto(valor, placa);
				lista.add(moto);//adiciona uma nova moto na lista	
			}

			//cadastrar carro de passeio 
			else if (opcao == 2) {
				double valor = pegarValor();
				String placa = pegarPlaca();

				Passeio passeio = new Passeio(valor, placa);
				lista.add(passeio);
			}

			//cadastrar SUV
			else if (opcao == 3) {
				double valor = pegarValor();
				String placa = pegarPlaca();

				Suv suv = new Suv(valor, placa);
				lista.add(suv);
			}
			//mostra a placa e o valor dos veiculos
			else if (opcao == 4) {	
				for ( int i = 0; i < lista.size() ; i ++) {
					Moto aux = lista.get(i);// essa variavel aux(auxiliar) pega o elemento da lista no indice(i) do for
					System.out.println("A placa eh: " + aux.placa);
					System.out.println("O valor eh: " + aux.valor);
				}
			}
			
			//o impostoTotal no comeco eh 0, mas depois soma com o imposto anuais de todos os carros que a pessoa cadastrou na lista. 
			else if (opcao == 5) { 
				double impostoTotal = 0;
				for(int j = 0; j < lista.size(); j++) {//este percore a lista e soma todos os impostos
					Moto aux = lista.get(j);
					aux.imposto();
					impostoTotal =aux.imposto + impostoTotal;	
				}
				System.out.println("A soma dos impostos anuais eh: " + impostoTotal * 12 );
			}
			
			//para o programa
			else{ 
				break;
			}
		}
	}
}
