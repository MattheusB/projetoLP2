package controller;

import java.time.LocalDate;
import java.util.HashSet;

import exceptions.chaveIncorretaException;
import exceptions.sistemaLiberadoException;
import funcionario.Funcionario;
import funcionario.FuncionarioFactory;

public class Controller {
	int numeroFuncionarios = 000;
	FuncionarioFactory factory = new FuncionarioFactory();
	HashSet<Funcionario> funcionarios = new HashSet<Funcionario>();
	boolean liberacao = false;
	
	public String liberaSistema(String chave, String nome, String dataNascimento) throws Exception{
		Funcionario funcionario = null;
		if (liberacao){
			throw new sistemaLiberadoException();
		}
		else if (chave.equalsIgnoreCase("c041ebf8")){
			liberacao = true;
			cadastraFuncionario(nome, "Diretor Geral", dataNascimento);
			return funcionario.getMatricula();
		}
		else{
			throw new chaveIncorretaException();
		}
		
	}
	
	public boolean realizaLogin(String matricula){
		//N�o entendi muito bem essa parada de logout e fecha sistema. Vou perguntar a Gerson
		return true;
	}
	
	public boolean cadastraFuncionario(String nome, String cargo, String dataNascimento){
		Funcionario funcionario = null;
		if (cargo.equalsIgnoreCase("Diretor")){
			funcionario = factory.criaDiretor(nome, dataNascimento);
			funcionario.setMatricula(geraMatricula(cargo));
			funcionario.setSenha(dataNascimento.substring(6,9) + funcionario.getMatricula().substring(0, 3));
		}
		
		else if (cargo.equalsIgnoreCase("Medico")){
			funcionario = factory.criaMedico(nome, dataNascimento);
			funcionario.setMatricula(geraMatricula(cargo));
			funcionario.setSenha(dataNascimento.substring(6,9) + funcionario.getMatricula().substring(0, 3));
		}
		
		else if (cargo.equalsIgnoreCase("Tecnico Administrativo")){
			funcionario = factory.criaTecnico(nome, dataNascimento);
			funcionario.setMatricula(geraMatricula(cargo));
			funcionario.setSenha(dataNascimento.substring(6,9) + funcionario.getMatricula().substring(0, 3));
			
		}
		
		return funcionarios.add(funcionario);
	}
	
	public String geraMatricula(String cargo){
		String matricula = "";
		if (cargo.equalsIgnoreCase("Diretor")){
			matricula += "12016";
			numeroFuncionarios += 1;
			matricula += numeroFuncionarios;
		}
		
		else if (cargo.equalsIgnoreCase("Medico")){
			matricula += "22016";
			numeroFuncionarios += 1;
			matricula += numeroFuncionarios;
		}
		
		else if (cargo.equalsIgnoreCase("Tecnico Administrativo")){
			matricula += "32016";
			numeroFuncionarios += 1;
			matricula += numeroFuncionarios;
		}
		return matricula;
	}
	
	public Funcionario verificaFuncionario(String matricula){
		for (Funcionario novoFuncionario: funcionarios){
			if(novoFuncionario.getMatricula().equalsIgnoreCase(matricula)){
				return novoFuncionario;
			}
		}
		
		return null;
	}
	
	// Metodo altera senha que primeiramente verifica a matricula e se for igual a matricula do usuario
	// que est� usando o sistema ele ter� acesso a parte de alterar senha;
	public void alteraSenha(String senha, String matricula, String novaSenha) throws Exception{
		Funcionario funcionario = verificaFuncionario(matricula);
		if(funcionario.getSenha().equalsIgnoreCase(senha)){
			if(verificaSenha(novaSenha)){
				funcionario.setSenha(novaSenha);
			}
		}
	}
	// Metodo que altera o nome;
	public void alteraNome(String novoNome, String matricula){
		Funcionario funcionario = verificaFuncionario(matricula);
		funcionario.setNome(novoNome);
	}
	
	// Metodo que altera a data de nascimento;
	public void alteraData(String data, String matricula){
		Funcionario funcionario = verificaFuncionario(matricula);
		funcionario.setDatanascimento(data);
	}

	// Metodo que Exclui funcionario;
	// Como j� foi dito acima, "funcionarios" precisa de uma parte de brito;
	public void excluiFuncionario(String matricula, String senhaDiretor){
		Funcionario funcionario = verificaFuncionario(matricula);
		if(funcionario.getSenha().equalsIgnoreCase(senhaDiretor)){
			funcionarios.remove(funcionario);
		}
	}
	
	// Metodo que verifica se a nova senha que o usuario ir� criar est� v�lida;
	public boolean verificaSenha(String senha)throws Exception{
		if (senha.length() < 8 || senha.length() > 12) {
			throw new Exception("Tamanho da senha deve estar entre 8 - 12 caracteres.");
		}
		return true;
	}
	
	// Metodo que verifica se o novo nome que o usuario ir� criar est� v�lida;
	public boolean verificaNome(String nome)throws Exception{
		if (nome.length() > 16){
			throw new Exception("Tamanho maximo e 16 caracteres.");
		}
		return true;
	}
	
	

}
