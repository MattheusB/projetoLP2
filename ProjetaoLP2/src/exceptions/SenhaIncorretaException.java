package exceptions;

public class SenhaIncorretaException extends Exception{
	public SenhaIncorretaException(String mensagem){
		super("Nao foi possivel realizar o login." + mensagem);
	}
	
	public SenhaIncorretaException(){
		super("Nao foi possivel realizar o login. Senha incorreta.");
	}

}
