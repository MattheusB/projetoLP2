package farmacia;

import java.util.LinkedList;

public class FactoryMedicamento {
	
	public FactoryMedicamento(){
		
	}
	
	public Medicamento criaMedicamento(String tipo, String nome, double preco, int quantidade, LinkedList<Categoria> categorias){
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
