package excessoes;

public class ObjetoJaExiste extends Exception{
	public ObjetoJaExiste(){
		super("ID ou nome de objeto já existente!");
	}
}
