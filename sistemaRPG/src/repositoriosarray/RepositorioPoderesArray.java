package repositoriosarray;


import basicas.Poderes;
import interfaces.RepositorioPoderes;

public class RepositorioPoderesArray implements RepositorioPoderes{
	private Poderes[] poderes;
	private int posit;
	private int tamanho;
		public RepositorioPoderesArray(int tamanho){
			this.tamanho = tamanho;
			this.poderes = new Poderes[tamanho];
			this.posit = 0;
		}
	public void inserir(Poderes poder) {
		this.poderes[posit] = poder;
		posit++;
	}
	public Poderes procurar(int id) {
		for(int i = 0; i < this.posit; i++){
			if(this.poderes[i].getId()==id){
				return poderes[i];
			}
		}
		return null;
	}

	public void atualizar(Poderes poder) {
		for(int i = 0; i < this.posit; i++){
			if(this.poderes[i].getId()==poder.getId()){
				 poderes[i] = poder;
			}
		}
	}

	public void remover(int id) {
		for(int i = 0; i < this.posit; i++){
			if(this.poderes[i].getId()==id){
				this.poderes[i] = null;
				for(int j = i; j < this.tamanho; j++){
					if(j != this.tamanho-1){
						poderes[j] = poderes[j + 1];
					}
				}
				this.posit = this.posit-1;
			}
		}
	}
	public boolean existe(int id) {
		if(this.posit!=0){
			for(int i = 0; i < posit; i++){
				if(this.poderes[i].getId()==id){
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
	public Poderes getPoder(int i) {
		return poderes[i];
	}
	
}