package repositorioslistas;

import basicas.Classe;
import basicas.Vantagens;
import interfaces.RepositorioVantagens;

public class RepositorioVantagensLista implements RepositorioVantagens {
		private Vantagens vantagem;
		private RepositorioVantagensLista next;
			public RepositorioVantagensLista(){
				this.vantagem = null;
				this.next = null;
			}
			public Vantagens getVantagem(int posic){
				if(posic == 0){
					return this.vantagem;
				}else{
					return this.next.getVantagem(posic -1);
				}
			}
			public void inserir(Vantagens vantagem) {
				if(this.vantagem == null){
					this.vantagem = vantagem;
					this.next = new RepositorioVantagensLista();
				}else{
					this.next.inserir(vantagem);
				}
			}
			public Vantagens procurar(int id) {
				if(!(this.vantagem.getId()==id)){
					return this.next.procurar(id);
				}else{
					return this.vantagem;
				}
			}	
			public void atualizar(Vantagens vantagem) {
					if(this.vantagem.getId()==vantagem.getId()){
						this.vantagem = vantagem;
					}else{
						this.next.atualizar(vantagem);
					}
				
			}
			public void remover(int id) {
					if(this.vantagem.getId()==id){
						this.vantagem = this.next.vantagem;
						this.next = this.next.next;
					}else{
						this.next.remover(id);
					}
				
			}
			public boolean existe(int id) {
				if(this.vantagem!=null){
					if(this.vantagem.getId()==id){
						return true;
					}else if(this.next.vantagem != null){
						return this.next.existe(id);
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
			public int tamanho(){
				if(this.vantagem!=null){
					return 1+this.next.tamanho();
				}else{
					return 0;
				}
			}

}