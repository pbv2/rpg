package repositorioslistas;

import basicas.Pericias;
import interfaces.RepositorioPericias;

public class RepositorioPericiasLista implements RepositorioPericias{
		private Pericias pericia;
		private RepositorioPericiasLista next;
			public RepositorioPericiasLista(){
				this.pericia = null;
				this.next = null;
			}
			public Pericias getPericia(int posic){
				if(posic == 0){
					return this.pericia;
				}else{
					return this.next.getPericia(posic -1);
				}
			}
			public void inserir(Pericias pericia) {
				if(this.pericia == null){
					this.pericia = pericia;
					this.next = new RepositorioPericiasLista();
				}else{
					this.next.inserir(pericia);
				}
			}
			public Pericias procurar(int id) {
				if(!(this.pericia.getId()==id)){
					return this.next.procurar(id);
				}else{
					return this.pericia;
				}
			}
			public void atualizar(Pericias pericia) {
					if(this.pericia.getId()==pericia.getId()){
						this.pericia = pericia;
					}else{
						this.next.atualizar(pericia);
					}
					
			}
			public void remover(int id) {
					if(this.pericia.getId()==id){
						this.pericia = this.next.pericia;
						this.next = this.next.next;
					}else{
						this.next.remover(id);
					}
				
			}
			public boolean existe(int id) {
				if(this.pericia!=null){
					if(this.pericia.getId()==id){
						return true;
					}else if(this.next.pericia != null){
						return this.next.existe(id);
					}else{
						return false;
					}
				}else{
					return false;
				}
				
			}
			public int tamanho(){
				if(this.pericia!=null){
					return 1+this.next.tamanho();
				}else{
					return 0;
				}
			}
}