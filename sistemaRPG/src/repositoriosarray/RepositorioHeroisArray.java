package repositoriosarray;


import basicas.Heroi;
import interfaces.RepositorioHerois;

public class RepositorioHeroisArray implements RepositorioHerois{
	private Heroi[] herois;
	private int posit;
	private int tamanho;
		public RepositorioHeroisArray(int tamanho){
			this.tamanho = tamanho;
			this.herois = new Heroi[tamanho];
			this.posit = 0;
		}
	public void inserir(Heroi heroi) {
		this.herois[posit] = heroi;
		posit++;
	}
	public Heroi procurar(String nome) {
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(herois[i].getNome())){
				return herois[i];
			}
		}
		return null;
	}
	public void atualizar(Heroi heroi) {
		for(int i = 0; i < this.posit; i++){
			if(heroi.getNome().equals(herois[i].getNome())){
				 herois[i] = heroi;
			}
		}
	}
	public void remover(String nome) {
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(herois[i].getNome())){
				herois[i] = null;
				for(int j = i; j < this.tamanho; j++){
					if(j != this.tamanho-1){
						herois[j] = herois[j + 1];
					}
				}
				this.posit = this.posit - 1;
			}
		}
	}
	public boolean existe(int id,String nome) {
		if(this.posit!=0){
			for(int i = 0; i < posit; i++){
				if(this.herois[i].getNome().equals(nome)||this.herois[i].getId()==id){
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