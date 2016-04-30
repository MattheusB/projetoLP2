package farmacia;

import java.util.ArrayList;

/**
 * Classe "MedicamentoDeRerefencia"
 * @author victor
 * 
 * A classe Medicamento de Referência servirá apenas para saber quando um medicamento será de 
 * referência ou genérico através de sua instância. Caso o medicamento seja de referência, ele
 * receberá o preço integral (100%).
*/

public class MedicamentoDeReferencia extends MedicamentoGenerico {

	public MedicamentoDeReferencia(String nome, double preco, int quantidade, ArrayList<Categoria> categorias) {
		super(nome, preco, quantidade, categorias);
	}

}