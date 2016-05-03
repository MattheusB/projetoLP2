package exceptions;

public class sistemaLiberadoException extends Exception{
	
	public sistemaLiberadoException (String mensagem){
		super("Erro ao liberar o sistema. " + mensagem);
	}
	
	public sistemaLiberadoException(){
		super("Erro ao liberar o sistema. Sistema liberado anteriormente.");
	}

}
