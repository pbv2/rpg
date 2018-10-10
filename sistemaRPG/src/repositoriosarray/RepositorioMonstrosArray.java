package repositoriosarray;

import basicas.Monstro;
import interfaces.RepositorioMonstros;

public class RepositorioMonstrosArray implements RepositorioMonstros{
	private Monstro[] monstros;
	private int posit;
	private int tamanho;
		public RepositorioMonstrosArray(int tamanho){
			this.tamanho = tamanho;
			this.monstros = new Monstro[tamanho];
			this.posit = 0;
		}
		public void inserir(Monstro monstro) {
			this.monstros[posit] = monstro;
			posit++;
		}
		public Monstro procurar(String nome) {
			for(int i = 0; i < this.posit; i++){
				if(nome.equals(monstros[i].getNome())){
					return monstros[i];
				}
			}
			return null;
		}
		public void atualizar(Monstro monstro) {
			for(int i = 0; i < this.posit; i++){
				if(monstro.getNome().equals(monstros[i].getNome())){
					 monstros[i] = monstro;
				}
			}
		}
		public void remover(String nome) {
			for(int i = 0; i < this.posit; i++){
				if(nome.equals(monstros[i].getNome())){
					monstros[i] = null;
					for(int j = i; j < this.tamanho; j++){
						if(j != this.tamanho-1){
							monstros[j] = monstros[j + 1];
						}
					}
					this.posit = this.posit - 1;
				}
			}
		}
		public boolean existe(int id,String nome) {
			if(this.posit!=0){
				for(int i = 0; i < posit; i++){
					if(this.monstros[i].getNome().equals(nome)||this.monstros[i].getId()==id){
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