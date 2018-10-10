package repositoriosarray;


import basicas.Desvantagens;
import interfaces.RepositorioDesvantagens;

public class RepositorioDesvantagensArray implements RepositorioDesvantagens{
		private Desvantagens[] desvantagens;
		private int posit;
		private int tamanho;
			public RepositorioDesvantagensArray(int tamanho){
				this.tamanho = tamanho;
				this.desvantagens = new Desvantagens[tamanho];
				this.posit = 0;
			}
			public void inserir(Desvantagens desvantagem) {
				this.desvantagens[posit] = desvantagem;
				posit++;
			}
			public Desvantagens procurar(int id){
				for(int i = 0; i < this.posit; i++){
					if(id==this.desvantagens[i].getId()){
						return desvantagens[i];
					}
				}
				return null;
			}
			public void atualizar(Desvantagens desvantagem){
				for(int i = 0; i < this.posit; i++){
					if(this.desvantagens[i].getId()==desvantagem.getId()){
						desvantagens[i] = desvantagem;
					}
				}
			}
			public void remover(int id){
				for(int i = 0; i < this.posit; i++){
					if(id==this.desvantagens[i].getId()){
						this.desvantagens[i] = null;
						for(int j = i; j < this.tamanho; j++){
							if(j != this.tamanho-1){
								desvantagens[j] = desvantagens[j + 1];
							}
						}
						this.posit = this.posit -1;
					}
				}
			}
			public boolean existe(int id) {
				if(this.posit!=0){
					for(int i = 0; i < posit; i++){
						if(this.desvantagens[i].getId()==id){
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