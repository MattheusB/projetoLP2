package farmacia;

import java.util.ArrayList;
/**
 * Classe "Medicamento"
 * @author victor
 * 
 * A classe Medicamento será responsável por originar medicamentos com os atributos nome, preço,
 * quantidade e categorias. Cada medicamento poderá ter diversas categorias (vide o Enum Categoria)
 * e podem ser do tipo Medicamento de Rerefência e Medicamento Genérico, formados por outras duas
 * classes que herdam desta classe-mãe.
 */

public class Medicamento {
	private String nome;
	private double preco;
	private int quantidade;
	private ArrayList<Categoria> categorias;
	
	public Medicamento (String nome, double preco, int quantidade, ArrayList<Categoria> categorias) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.setCategorias(new ArrayList <Categoria> ());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
}
