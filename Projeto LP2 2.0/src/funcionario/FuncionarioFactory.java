package funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FuncionarioFactory {
	public FuncionarioFactory(){}
	
	public Funcionario cadastraFuncionario(String nome, String cargo, String dataNascimento){
		
		//Falta os exceptions
		Funcionario funcionario = null;
		if (cargo.equalsIgnoreCase("Diretor Geral")){
			funcionario = criaDiretor(nome, dataNascimento);
		}
		if (cargo.equalsIgnoreCase("Medico")){
			funcionario = criaMedico(nome, dataNascimento);
		}
		
		if (cargo.equalsIgnoreCase("Tecnico Administrativo")){
			funcionario = criaTecnico(nome, dataNascimento);
		}
		
		return funcionario;
	}
	
	public Funcionario criaDiretor(String nome, String dataNascimento){
		Funcionario diretor = new DiretorGeral(nome, dataNascimento);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataNascimento, formatador);
		return diretor;
	}

	public Funcionario criaMedico(String nome, String dataNascimento){
		Funcionario medico = new Medico(nome, dataNascimento);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataNascimento, formatador);
		return medico;
	}
	
	public Funcionario criaTecnico(String nome, String dataNascimento){
		Funcionario tecnico = new TecnicoAdministrativo(nome, dataNascimento);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataNascimento, formatador);
		return tecnico;
	}

}
