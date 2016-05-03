package soos;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class PartDoController {

	// Metodo que retorna um funcionario da Lista buscando a partir da matricula;
		// "funcionarios" é uma arryList que está faltando pois precisa da parte de brito;
		public Funcionario verificaFuncionario(String matricula){
			for (Funcionario novoFuncionario: funcionarios){
				if(novoFuncionario.getMatricula().equalsIgnoreCase(matricula)){
					return novoFuncionario;
				}
			}
		}
		
		// Metodo altera senha que primeiramente verifica a matricula e se for igual a matricula do usuario
		// que está usando o sistema ele terá acesso a parte de alterar senha;
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
		public void alteraData(LocalDate data, String matricula){
			Funcionario funcionario = verificaFuncionario(matricula);
			funcionario.setDatanascimento(data);
		}

		// Metodo que Exclui funcionario;
		// Como já foi dito acima, "funcionarios" precisa de uma parte de brito;
		public void excluiFuncionario(String matricula, String senhaDiretor){
			Funcionario funcionario = verificaFuncionario(matricula);
			if(diretor.getSenha() == senhaDiretor){
				funcionarios.remove(funcionario);
			}
		}
		
		// Metodo que verifica se a nova senha que o usuario irá criar está válida;
		public boolean verificaSenha(String senha)throws Exception{
			if (senha.length() < 6 || senha.length() > 12) {
				throw new Exception("Tamanho da senha deve estar entre 6 - 12 caracteres.");
			}
			return true;
		}
		
		// Metodo que verifica se o novo nome que o usuario irá criar está válida;
		public boolean verificaNome(String nome)throws Exception{
			if (nome.length() > 16){
				throw new Exception("Tamanho máximo são 16 caracteres.");
			}
			return true;
		}
	}

