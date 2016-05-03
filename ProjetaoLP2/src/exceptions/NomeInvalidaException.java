package exceptions;

public class NomeInvalidaException extends Exception{
	public NomeInvalidaException(String mensagem){
		super("Erro no cadastro de funcionario." + mensagem);
		
	}
	
	public NomeInvalidaException(){
		super("Erro no cadastro de funcionario. Nome do funcionario nao pode ser vazio.");
	}

}
