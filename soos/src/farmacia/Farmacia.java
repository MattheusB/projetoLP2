package farmacia;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe "Farmacia"
 * @author victor
 * 
 * A classe Farmácia será responsável por organizar, criar e armazenar medicamentos num estoque.
 * Será ela que conterá os diversos métodos do sistema.
 */

public class Farmacia {
	private ArrayList<Medicamento> estoque;

	public Farmacia() {
	}

	public void criaMedicamento (String nome, double preco, int quantidade) {
		for (Medicamento m: estoque) {
			if (nome.equals(m.getNome())) {
			}
			else {
				Medicamento medicamento = new Medicamento(nome, preco, quantidade, null);
				estoque.add(medicamento);
			}
		}
	}

	public Medicamento atualizaMedicamento (String nome, String atributo, String novovalor) throws Exception {
		Medicamento novo = verificaMedicamento(nome);
		if (atributo.equals("nome")) {
	       if (atributo.equals(novo.getNome())) {
	        	throw new Exception("Erro ao atualizar medicamento. Nome do medicamento nao pode ser alterado.");
	        }
			novo.setNome(novovalor);
			return novo;
		}
		if (atributo.equals("preco")) {
			if (atributo.equals(novo.getPreco())) {
				throw new Exception("Erro ao atualizar medicamento. Preco do medicamento nao pode ser alterado.");
			}
			novo.setPreco(Double.parseDouble(novovalor));
			return novo;
		}
		if (atributo.equals("quantidade")) {
			if (atributo.equals(novo.getQuantidade())) {
				throw new Exception("Erro ao atualizar medicamento. Quantidade do medicamento nao pode ser alterada.");
			}
			novo.setQuantidade(Integer.parseInt(novovalor));
			return novo;
		}
		if (atributo.equals("tipo")) {
			if (atributo.equals("generico")) {
				if (novo instanceof MedicamentoGenerico) {
					throw new Exception("Erro ao atualizar medicamento. Tipo do medicamento nao pode ser alterado.");
				}
				novo = (MedicamentoGenerico) novo;
				return novo;
			}
			if (atributo.equals("de referencia")) {
				if (novo instanceof MedicamentoDeReferencia) {
					throw new Exception("Erro ao atualizar medicamento. Tipo do medicamento nao pode ser alterado.");
				}
				novo = (MedicamentoDeReferencia) novo;
				return novo;
			}
		} throw new Exception("Erro ao atualizar medicamento. Medicamento nao cadastrado.");
	}
		
	
	public void adicionaCategoria (String nome, String categoria) throws Exception {
		Medicamento novo = verificaMedicamento(nome);
		Categoria categorias = verificaCategoria(categoria);
		novo.addCategoria(categorias);
	}
	
	public void alteraPreco(String nome,double preco)throws Exception{
		Medicamento medicamento = verificaMedicamento(nome);
		medicamento.alterPreco(preco);
	}


	public String buscaPorNome(String nome) throws Exception {
		Medicamento novo = verificaMedicamento(nome);
		return novo.toString();
	}

	public ArrayList<Medicamento> buscaPorCategoria(String categoria)throws Exception {
		ArrayList<Medicamento> listaMedicamentos = new ArrayList<Medicamento> ();
		boolean encontra = false;
		Categoria categorias = verificaCategoria(categoria);
		for(Medicamento novomedicamento : estoque){
				if(novomedicamento.verificaCategoria(categorias)){
					listaMedicamentos.add(novomedicamento);
					encontra = true;
				}
			}
		if (encontra == false) {
			throw new Exception("Erro na consulta de medicamentos. Nao ha remedios cadastrados nessa categoria.");
		}
		Collections.sort(listaMedicamentos);
		return listaMedicamentos;
		}
	
	public ArrayList<Medicamento> buscaPorTodosMedicamentos(String ordenacao) throws Exception {
		if (ordenacao.equals("preco")) {
			return verificaRemediosPorPreco();
		}
		if (ordenacao.equals("alfabetica")) {
			return verificaRemedioPorNome();
		}
		throw new Exception("Erro na consulta de medicamentos. Tipo de ordenacao invalida.");
	}
	
	public ArrayList<Medicamento> verificaRemedioPorNome () {
		ComparaNome ordena = new ComparaNome();
		Collections.sort(estoque,ordena);
		return estoque;
	}
	
	public ArrayList<Medicamento> verificaRemediosPorPreco () {
		Collections.sort(estoque);
		return estoque;
		
	}
	
	private Medicamento verificaMedicamento(String nome) throws Exception{
		for (Medicamento novomedicamento: estoque) {
			if (novomedicamento.getNome().equalsIgnoreCase(nome)) {
				return novomedicamento;
			}
			}
		throw new Exception("Erro na consulta de medicamentos. Medicamento nao cadastrado.");
	}
	
	private Categoria verificaCategoria(String categoria) throws Exception{
		if (categoria.equalsIgnoreCase("Analgesico")) {
			return Categoria.ANALGESICO;
			
		}
		
		if (categoria.equalsIgnoreCase("Antibioticos")) {
			return Categoria.ANTIBIOTICO;
		}
		
		if (categoria.equalsIgnoreCase("Antiemetico")) {
			return Categoria.ANTIEMETICO;
		}
		
		if (categoria.equalsIgnoreCase("Anti-Inflamatorio")) {
			return Categoria.ANTIINFLAMATORIO;
		}
		
		if (categoria.equalsIgnoreCase("Antitermico")) {
			return Categoria.ANTITERMICO;
		}
		
		if (categoria.equalsIgnoreCase("Hormonais")) {
			return Categoria.HORMONAL;
		}
		
		throw new Exception("Erro na consulta de medicamentos. Categoria invalida.");
		
		
	}
	
	
}