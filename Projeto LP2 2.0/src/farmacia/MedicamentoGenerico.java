package farmacia;


import java.util.LinkedList;

/**
 * Classe "MedicamentoGenerico"
 * @author victor
 * 
 * A classe Medicamento Genérico servirá apenas para saber quando um medicamento será de 
 * referência ou genérico através de sua instância. Caso o medicamento seja genérico, ele
 * receberá um preço parcial de 60%.
*/

public class MedicamentoGenerico extends Medicamento {

	public MedicamentoGenerico(String nome, double preco, int quantidade, LinkedList<Categoria> categorias) {
		super(nome, preco, quantidade, categorias);
		calculaPreco();
	}
	
	private void calculaPreco(){
		double novopreco = this.getPreco();
		novopreco -= this.getPreco() * 0.4;
		this.setPreco(novopreco);
	}

}
