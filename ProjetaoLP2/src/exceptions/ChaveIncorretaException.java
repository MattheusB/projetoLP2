package exceptions;

public class ChaveIncorretaException  extends Exception{
	public ChaveIncorretaException(String mensagem){
		super ("Erro ao liberar o sistema. " + mensagem);
	}

	public ChaveIncorretaException(){
		super("Erro ao liberar o sistema. Chave invalida.");
	}


}
