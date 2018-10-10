package repositorioslistas;

import basicas.Monstro;
import interfaces.RepositorioMonstros;

public class RepositorioMonstrosLista implements RepositorioMonstros {
	private Monstro monstro;
	private RepositorioMonstrosLista next;
		public RepositorioMonstrosLista(){
			this.monstro = null;
			this.next = null;
		}
		public Monstro getMonstro(int posic){
			if(posic == 0){
				return this.monstro;
			}else{
				return this.next.getMonstro(posic -1);
			}
		}
		public void inserir(Monstro monstro) {
			if(this.monstro == null){
				this.monstro = monstro;
				this.next = new RepositorioMonstrosLista();
			}else{
				this.next.inserir(monstro);
			}
		}
		public Monstro procurar(String nome) {
			if(!nome.equals(this.monstro.getNome())){
				return this.next.procurar(nome);
			}else{
				return this.monstro;
			}
		}
		public void atualizar(Monstro monstro) {
				if(this.monstro.getNome().equals(monstro.getNome())){
					this.monstro = monstro;
				}else{
					this.next.atualizar(monstro);
				}
				
		}
		public void remover(String nome) {
				if(this.monstro.getNome().equals(nome)){
					this.monstro = this.next.monstro;
					this.next = this.next.next;
				}else{
					this.next.remover(nome);
				}
			
		}
		public boolean existe(int id,String nome) {
			if(this.monstro!=null){
				if(this.monstro.getNome().equals(nome)||this.monstro.getId()==id){
					return true;
				}else if(this.next.monstro != null){
					return this.next.existe(id,nome);
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		}
		public int tamanho(){
			if(this.monstro!=null){
				return 1+this.next.tamanho();
			}else{
				return 0;
			}
		}
}