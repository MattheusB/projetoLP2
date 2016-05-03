package farmacia;


import java.util.LinkedList;
/**
 * Classe "Medicamento"
 * @author victor
 * 
 * A classe Medicamento será responsável por originar medicamentos com os atributos nome, preço,
 * quantidade e categorias. Cada medicamento poderá ter diversas categorias (vide o Enum Categoria)
 * e podem ser do tipo Medicamento de Rerefência e Medicamento Genérico, formados por outras duas
 * classes que herdam desta classe-mãe.
 */

public class Medicamento implements Comparable<Medicamento>{
	private String nome;
	private double preco;
	private int quantidade;
	private LinkedList<Categoria> categorias;
	
	public Medicamento (String nome, double preco, int quantidade, LinkedList<Categoria> categorias) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.categorias = categorias;
	}
	
	public boolean verificaCategoria(Categoria categoria){
		return this.categorias.contains(categoria);
	}
	
	public void alterPreco(double preco){
		this.setPreco(preco);
	}
	
	public void addCategoria(Categoria categoria){
		this.categorias.add(categoria);
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\nPreco: "+  this.preco + "\nQuantidade: " + this.quantidade;
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
	
	public int comparaNome(Medicamento novo){
		return this.nome.compareTo(novo.getNome());
	}

	@Override
	public int compareTo(Medicamento novo) {
		if(this.preco > novo.getPreco()){
			return 1;
		}
		if(this.preco < novo.getPreco()){
			return -1;
		}
		return 0;
	}

	

	
}