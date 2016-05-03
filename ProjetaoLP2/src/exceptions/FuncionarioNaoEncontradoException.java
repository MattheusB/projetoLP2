package exceptions;

public class FuncionarioNaoEncontradoException extends Exception{
	public FuncionarioNaoEncontradoException (String mensagem){
		super("Nao foi possivel realizar o login." + mensagem);
	}
	
	public FuncionarioNaoEncontradoException(){
		super("Nao foi possivel realizar o login. Funcionario nao cadastrado.");
	}

}
