package exceptions;

public class chaveIncorretaException  extends Exception{
	public chaveIncorretaException(String mensagem){
		super ("Erro ao liberar o sistema. " + mensagem);
	}

	public chaveIncorretaException(){
		super("Erro ao liberar o sistema. Chave invalida.");
	}


}
