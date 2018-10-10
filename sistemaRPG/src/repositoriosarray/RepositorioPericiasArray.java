package repositoriosarray;

import basicas.Pericias;
import interfaces.RepositorioPericias;

public class RepositorioPericiasArray implements RepositorioPericias {
		private Pericias[] pericias;
		private int posit;
		private int tamanho;
			public RepositorioPericiasArray(int tamanho){
				this.tamanho = tamanho;
				this.pericias = new Pericias[tamanho];
				this.posit = 0;
			}
			public void inserir(Pericias pericia) {
				this.pericias[posit] = pericia;
				posit++;
			}
			public Pericias procurar(int id) {
				for(int i = 0; i < this.posit; i++){
					if(id==this.pericias[i].getId()){
						return pericias[i];
					}
				}
				return null;
			}
			public void atualizar(Pericias pericia) {
				for(int i = 0; i < this.posit; i++){
					if(this.pericias[i].getId()==pericia.getId()){
						pericias[i] = pericia;
					}
				}
			}
			public void remover(int id) {
				for(int i = 0; i < this.posit; i++){
					if(this.pericias[i].getId()==id){
						this.pericias[i] = null;
						for(int j = i; j < this.tamanho; j++){
							if(j != this.tamanho-1){
								pericias[j] = pericias[j + 1];
							}
						}
						this.posit = this.posit - 1;
					}
				}
			}
			public boolean existe(int id) {
				if(this.posit!=0){
					for(int i = 0; i < posit; i++){
						if(this.pericias[i].getId()==id){
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