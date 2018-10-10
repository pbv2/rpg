package repositorioslistas;

import basicas.Raca;
import interfaces.RepositorioRacas;

public class RepositorioRacasLista implements RepositorioRacas{
		private Raca raca;
		private RepositorioRacasLista next;
			public RepositorioRacasLista(){
				this.raca = null;
				this.next = null;
			}
			public Raca getRaca(int posic){
				if(posic == 0){
					return this.raca;
				}else{
					return this.next.getRaca(posic -1);
				}
			}
			public void inserir(Raca raca){
				if(this.raca == null){
					this.raca = raca;
					this.next = new RepositorioRacasLista();
				}else{
					this.next.inserir(raca);
				}
			}
			public Raca procurar(String nome) {
				if(!nome.equals(this.raca.getNome())){
					return this.next.procurar(nome);
				}else{
					return this.raca;
				}
			}
			public void atualizar(Raca raca) {
					if(this.raca.getNome().equals(raca.getNome())){
						this.raca = raca;
					}else{
						this.next.atualizar(raca);
					}
				
			}
			public void remover(String nome) {
					if(this.raca.getNome().equals(nome)){
						this.raca = this.next.raca;
						this.next = this.next.next;
					}else{
						this.next.remover(nome);
					}
			}
			public boolean existe(int id,String nome) {
				if(this.raca!=null){
					if(this.raca.getNome().equals(nome)||this.raca.getId()==id){
						return true;
					}else if(this.next.raca != null){
						return this.next.existe(id,nome);
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
			public int tamanho(){
				if(this.raca!=null){
					return 1+this.next.tamanho();
				}else{
					return 0;
				}
			}
}