package exceptions;

public class DataInvalidaException extends Exception{
	public DataInvalidaException(String mensagem){
		super("Erro no cadastro de funcionario." + mensagem);
	}
	
	public DataInvalidaException(){
		super("Erro no cadastro de funcionario. Data invalida.");
	}
}
