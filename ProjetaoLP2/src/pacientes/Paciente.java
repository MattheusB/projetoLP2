package pacientes;

import java.util.UUID;

public class Paciente implements Comparable<Paciente>{
	
	private String nome;
	private String dataDeNascimento;
	private double peso;
	private String tipoSanguineo;
	private String sexo;
	private String genero;
	private UUID id;
	
	
	public Paciente(String nome, String dataDeNacimento, double peso, String tipoSanguineo, String sexo, String genero, UUID id){
		this.nome = nome;
		this.dataDeNascimento = dataDeNacimento;
		this.peso = peso;
		this.tipoSanguineo = tipoSanguineo;
		this.sexo = sexo;
		this.genero = genero;
		this.id = id;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\nData de Nascimento: " + this.dataDeNascimento + "\nPeso: " + this.peso 
				+ "\nTipo Sanguineo: " + this.tipoSanguineo + "\nSexo: " + this.sexo + "\nGenero: " + this.genero + "\nID: " + this.id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getTipoSanguineo() {
		return tipoSanguineo;
	}


	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}





	@Override
	public int compareTo(Paciente novo) {
		
		return this.nome.compareTo(novo.getNome());
	}

}
