package repositorioslistas;

import basicas.Classe;
import interfaces.RepositorioClasses;

public class RepositorioClassesLista implements RepositorioClasses{
	private Classe classe;
	private RepositorioClassesLista next;
		public RepositorioClassesLista(){
			this.classe = null;
			this.next = null;
		}
	public Classe getClasse(int posic){
		if(posic == 0){
			return this.classe;
		}else{
			return this.next.getClasse(posic -1);
		}
	}
	public void inserir(Classe classe) {
		if(this.classe == null){
			this.classe = classe;
			this.next = new RepositorioClassesLista();
		}else{
			this.next.inserir(classe);
		}
	}
	public Classe procurar(String nome) {
			if(!nome.equals(this.classe.getNome())){
				return this.next.procurar(nome);
			}else{
				return this.classe;
			}
	}

	public void atualizar(Classe classe) {
			if(this.classe.getNome().equals(classe.getNome())){
				this.classe = classe;
			}else{
				this.next.atualizar(classe);
			}
			
	}

	public void remover(String nome) {
			if(this.classe.getNome().equals(nome)){
				this.classe = this.next.classe;
				this.next = this.next.next;
			}else{
				this.next.remover(nome);
			}
	}
	public boolean existe(int id,String nome) {
		if(this.classe!=null){
			if(this.classe.getNome().equals(nome)||this.classe.getId()==id){
				return true;
			}else if(this.next.classe != null){
				return this.next.existe(id,nome);
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	public int tamanho(){
		if(this.classe!=null){
			return 1+this.next.tamanho();
		}else{
			return 0;
		}
	}
	
}