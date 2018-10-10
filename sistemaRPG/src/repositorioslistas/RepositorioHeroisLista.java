package repositorioslistas;

import basicas.Heroi;
import interfaces.RepositorioHerois;

public class RepositorioHeroisLista implements RepositorioHerois{
	private Heroi heroi;
	private RepositorioHeroisLista next;
		public RepositorioHeroisLista(){
			this.heroi = null;
			this.next = null;
		}
		public Heroi getHeroi(int posic){
			if(posic == 0){
				return this.heroi;
			}else{
				return this.next.getHeroi(posic -1);
			}
		}
	public void inserir(Heroi heroi) {
		if(this.heroi == null){
			this.heroi = heroi;
			this.next = new RepositorioHeroisLista();
		}else{
			this.next.inserir(heroi);
		}
	}
	public Heroi procurar(String nome) {
		if(!nome.equals(this.heroi.getNome())){
			return this.next.procurar(nome);
		}else{
			return this.heroi;
		}
	}

	public void atualizar(Heroi heroi) {
			if(this.heroi.getNome().equals(heroi.getNome())){
				this.heroi = heroi;
			}else{
				this.next.atualizar(heroi);
			}
			
	}
	public void remover(String nome) {
			if(this.heroi.getNome().equals(nome)){
				this.heroi = this.next.heroi;
				this.next = this.next.next;
			}else{
				this.next.remover(nome);
			}
		
	}
	public boolean existe(int id,String nome) {
		if(this.heroi!=null){
			if(this.heroi.getNome().equals(nome)||this.heroi.getId()==id){
				return true;
			}else if(this.next.heroi != null){
				return this.next.existe(id,nome);
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
	public int tamanho(){
		if(this.heroi!=null){
			return 1+this.next.tamanho();
		}else{
			return 0;
		}
	}
}