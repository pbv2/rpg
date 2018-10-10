package repositoriosarray;

import basicas.Vantagens;
import interfaces.RepositorioVantagens;

public class RepositorioVantagensArray implements RepositorioVantagens{
	private Vantagens[] vantagens;
	private int posit;
	private int tamanho;
		public RepositorioVantagensArray(int tamanho){
			this.tamanho = tamanho;
			this.vantagens = new Vantagens[tamanho];
			this.posit = 0;
		}

	public void inserir(Vantagens vantagem) {
		this.vantagens[posit] = vantagem;
		posit++;
	}

	public Vantagens procurar(int id) {
		for(int i = 0; i < this.posit; i++){
			if(id==this.vantagens[i].getId()){
				return vantagens[i];
			}
		}
		return null;
	}

	public void atualizar(Vantagens vantagem) {
		for(int i = 0; i < this.posit; i++){
			if(this.vantagens[i].getId()==vantagem.getId()){
				vantagens[i] = vantagem;
			}
		}
	}

	public void remover(int id) {
		for(int i = 0; i < this.posit; i++){
		    if(this.vantagens[i].getId()==id){
		    	this.vantagens[i] = null;
		    		for(int j = i; j < this.tamanho; j++){
		    			if(j != this.tamanho-1){
		    				vantagens[j] = vantagens[j + 1];
		    			}
		    		}
		    	this.posit = this.posit-1;
		    }
		}
	}

	public boolean existe(int id) {
		if(this.posit!=0){
			for(int i = 0; i < posit; i++){
				if(this.vantagens[i].getId()==id){
					return true;
				}else if(i == this.tamanho-1){
					return false;
				}
			}
		}else{
			return false;
		}		
		return false;
	}
	public int tamanho() {
		return this.posit;
	}
	
}