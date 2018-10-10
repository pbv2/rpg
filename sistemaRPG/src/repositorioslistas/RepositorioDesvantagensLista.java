package repositorioslistas;

import basicas.Desvantagens;
import interfaces.RepositorioDesvantagens;

public class RepositorioDesvantagensLista implements RepositorioDesvantagens{
		private Desvantagens desvantagem;
		private RepositorioDesvantagensLista next;
			public RepositorioDesvantagensLista(){
				this.desvantagem = null;
				this.next = null;
			}
			public Desvantagens getDesvantagem(int posic){
				if(posic == 0){
					return this.desvantagem;
				}else{
					return this.next.getDesvantagem(posic -1);
				}
			}
			public void inserir(Desvantagens desvantagem) {
				if(this.desvantagem == null){
					this.desvantagem = desvantagem;
					this.next = new RepositorioDesvantagensLista();
				}else{
					this.next.inserir(desvantagem);
				}
			}
			public Desvantagens procurar(int id) {
					if(!(this.desvantagem.getId()==id)){
						return this.next.procurar(id);
					}else{
						return this.desvantagem;
					}
			}
			public void atualizar(Desvantagens desvantagem) {
					if(this.desvantagem.getId()==desvantagem.getId()){
						this.desvantagem = desvantagem;
					}else{
						this.next.atualizar(desvantagem);
					}
					
			}
			public void remover(int id) {
					if(this.desvantagem.getId()==id){
						this.desvantagem = this.next.desvantagem;
						this.next = this.next.next;
					}else{
						this.next.remover(id);
					}
				
			}
			public boolean existe(int id) {
				if(this.desvantagem!=null){
					if(this.desvantagem.getId()==id){
						return true;
					}else if(this.next.desvantagem != null){
						return this.next.existe(id);
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
			public int tamanho(){
				if(this.desvantagem!=null){
					return 1+this.next.tamanho();
				}else{
					return 0;
				}
			}

}