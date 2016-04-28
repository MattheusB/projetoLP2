package soos;

public class Funcionarios {
	
	private String nome;
	private String data;
	private String senha;
	private String matricula;
	
	public Funcionarios (String nome, String data){
		this.nome = nome;
		this.data = data;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
