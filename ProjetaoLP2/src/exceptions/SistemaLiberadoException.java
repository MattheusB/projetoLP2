package exceptions;

public class SistemaLiberadoException extends Exception{
	
	public SistemaLiberadoException (String mensagem){
		super("Erro ao liberar o sistema. " + mensagem);
	}
	
	public SistemaLiberadoException(){
		super("Erro ao liberar o sistema. Sistema liberado anteriormente.");
	}

}
