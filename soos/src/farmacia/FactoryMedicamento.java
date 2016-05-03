package farmacia;

import java.util.LinkedList;

public class FactoryMedicamento {
	
	public FactoryMedicamento(){
		
	}
	
	public Medicamento criaMedicamento(String tipo, String nome, double preco, int quantidade, LinkedList<Categoria> categorias) throws Exception {
		// Exceções
		if (nome.equals("")) {
			throw new Exception("Erro no cadastro de medicamento. Nome do medicamento nao pode ser vazio.");
		}
		if (preco < 0) {
			throw new Exception("Erro no cadastro de medicamento. Preco do medicamento nao pode ser negativo.");	
		}
		if (quantidade < 0) {
			throw new Exception("Erro no cadastro de medicamento. Quantidade do medicamento nao pode ser negativo.");
		}
		
		if(tipo.equalsIgnoreCase("Generico")){
			Medicamento medicamento = new MedicamentoGenerico(nome,preco,quantidade,categorias);
			return medicamento;
		}
		
		if(tipo.equalsIgnoreCase("Referencia")){
			Medicamento medicamento = new MedicamentoDeReferencia(nome,preco,quantidade,categorias);
			return medicamento;
		}
		
		return null;
	}

}