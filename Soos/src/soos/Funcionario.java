package soos;

public class Funcionario {
	private String nome;
	private String datanascimento;
	private int matricula;
	private int senha;
	
	public Funcionario (String nome, String datanascimento) {
		this.setNome(nome);
		this.setDatanascimento(datanascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
