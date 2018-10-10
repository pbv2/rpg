package repositorioslistas;

import basicas.Poderes;
import interfaces.RepositorioPoderes;

public class RepositorioPoderesLista implements RepositorioPoderes {
	private Poderes poder;
	private RepositorioPoderesLista next;
		public RepositorioPoderesLista(){
			this.poder = null;
			this.next = null;
		}
		public Poderes getPoder(int posic){
			if(posic == 0){
				return this.poder;
			}else{
				return this.next.getPoder(posic -1);
			}
		}
		public void inserir(Poderes poder) {
			if(this.poder == null){
				this.poder = poder;
				this.next = new RepositorioPoderesLista();
			}else{
				this.next.inserir(poder);
			}
		}
		public Poderes procurar(int id) {
			if(!(this.poder.getId()==id)){
				return this.next.procurar(id);
			}else{
				return this.poder;
			}
		}
		public void atualizar(Poderes poder) {
				if(this.poder.getId()==poder.getId()){
					this.poder = poder;
				}else{
					this.next.atualizar(poder);
				}
				
		}
		public void remover(int id) {
				if(this.poder.getId()==id){
					this.poder = this.next.poder;
					this.next = this.next.next;
				}else{
					this.next.remover(id);
				}
			
		}
		public boolean existe(int id) {
			if(this.poder!=null){
				if(this.poder.getId()==id){
					return true;
				}else if(this.next.poder != null){
					return this.next.existe(id);
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		}
		public int tamanho(){
			if(this.poder!=null){
				return 1+this.next.tamanho();
			}else{
				return 0;
			}
		}
		
}