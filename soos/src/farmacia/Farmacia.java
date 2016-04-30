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

	public void adicionaCategoria (Medicamento m, String categoria) throws Exception {
		if (categoria.equals("Analgésico")) {
			m.getCategorias().add(Categoria.ANALGESICO);
		}
		if (categoria.equals("Antibiótico")) {
			m.getCategorias().add(Categoria.ANTIBIOTICO);
		}
		if (categoria.equals("Antiemético")) {
			m.getCategorias().add(Categoria.ANTIEMETICO);
		}
		if (categoria.equals("Anti-inflamatório")) {
			m.getCategorias().add(Categoria.ANTIINFLAMATORIO);
		}
		if (categoria.equals("Antitérmico")) {
			m.getCategorias().add(Categoria.ANTITERMICO);
		}
		if (categoria.equals("Hormonal")) {
			m.getCategorias().add(Categoria.HORMONAL);
		}
		else {
			throw new Exception("A categoria não existe no sistema.");
		}
	}


	public Medicamento buscaPorNome(String nome) {
		for (Medicamento m: estoque) {
			if (nome.equals(m.getNome())) {
				return m;
			}
		}
		return null;
	}

	public ArrayList<String> buscaPorCategoria(String categoria) {

		ArrayList<Medicamento> listaMedicamentos = new ArrayList<Medicamento> ();

		if (categoria.equals("Analgésico")) {
			for (Medicamento m: estoque) {
				if (m.getCategorias().equals(Categoria.ANALGESICO)) {
					listaMedicamentos.add(m);
				}
			}
		}
		if (categoria.equals("Antibiótico")) {
			for (Medicamento m: estoque) {
				if (m.getCategorias().equals(Categoria.ANTIBIOTICO)) {
					listaMedicamentos.add(m);
				}
			}
			if (categoria.equals("Antiemético")) {
				for (Medicamento m: estoque) {
					if (m.getCategorias().equals(Categoria.ANTIEMETICO)) {
						listaMedicamentos.add(m);
					}
				}
			}
			if (categoria.equals("Anti-inflamatório")) {
				for (Medicamento m: estoque) {
					if (m.getCategorias().equals(Categoria.ANTIINFLAMATORIO)) {
						listaMedicamentos.add(m);
					}
				}
			}
			if (categoria.equals("Antitérmico")) {
				for (Medicamento m: estoque) {
					if (m.getCategorias().equals(Categoria.ANTITERMICO)) {
						listaMedicamentos.add(m);
					}
				}
			}
			if (categoria.equals("Hormonal")) {
				for (Medicamento m: estoque) {
					if (m.getCategorias().equals(Categoria.HORMONAL)) {
						listaMedicamentos.add(m);
					}
				}
			}

			else {

			}

			for (int i = 0; i < listaMedicamentos.size(); i++) {
				for (int j=0; j < listaMedicamentos.size(); j++) {
					if (listaMedicamentos.get(i).getPreco() > listaMedicamentos.get(j).getPreco()) {
						//listaMedicamentos.get(i), listaMedicamentos.get(j) = listaMedicamentos.get(j), listaMedicamentos.get(i);

					}
				}
			}
		}

	}
	
	public ArrayList<String> verificaRemediosAlfabetico () {
		ArrayList<String> lista = new ArrayList<String> ();
		for (Medicamento m: estoque) {
			lista.add(m.getNome());
		}
		Collections.sort(lista);
		return lista;
	}
	
	public ArrayList<String> verificaRemediosPorPreco () {
		ArrayList<String> lista = new ArrayList<String> ();
		for (Medicamento m: estoque) {
			
		}
		
	}
}