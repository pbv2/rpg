package repositoriosarray;

import basicas.Raca;
import interfaces.RepositorioRacas;

public class RepositorioRacasArray implements RepositorioRacas{
	private Raca[] racas;
	private int posit;
	private int tamanho;
		public RepositorioRacasArray(int tamanho){
			this.tamanho = tamanho;
			this.racas = new Raca[tamanho];
			this.posit = 0;
		}
		
	public void inserir(Raca raca) {
		this.racas[posit] = raca;
		posit++;
	}
	
	public Raca procurar(String nome) {
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(racas[i].getNome())){
				return racas[i];
			}
		}
		return null;
	}
	
	public void atualizar(Raca raca) {
		for(int i = 0; i < this.posit; i++){
			if(raca.getNome().equals(racas[i].getNome())){
				racas[i] = raca;
			}
		}
	}

	public void remover(String nome) {
		for(int i = 0; i < this.posit; i++){
		    if(nome.equals(racas[i].getNome())){
		    	racas[i] = null;
		    		for(int j = i; j < this.tamanho; j++){
		    			if(j != this.tamanho-1){
		    				racas[j] = racas[j + 1];
		    			}
		    		}
		    	this.posit = this.posit-1;
		    }
		}
	}

	public boolean existe(int id,String nome) {
		if(this.posit!=0){
			for(int i = 0; i < posit; i++){
				if(this.racas[i].getNome().equals(nome)||this.racas[i].getId()==id){
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