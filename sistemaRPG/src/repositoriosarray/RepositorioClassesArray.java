package repositoriosarray;

import basicas.Classe;
import interfaces.RepositorioClasses;

public class RepositorioClassesArray implements RepositorioClasses{
	private Classe[] classes;
	private int posit;
	private int tamanho;
		public RepositorioClassesArray(int tamanho){
			this.tamanho = tamanho;
			this.classes = new Classe[tamanho];
			this.posit = 0;
		}
	public void inserir(Classe classe){
		this.classes[posit] = classe;
		posit++;
	}
	public Classe procurar(String nome){
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(classes[i].getNome())){
				return classes[i];
			}
		}
		return null;
	}
	public void atualizar(Classe classe) {
		for(int i = 0; i < this.posit; i++){
			if(classe.getId()==this.classes[i].getId()){
				 classes[i] = classe;
			}
		}
	}
	public void remover(String nome){
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(classes[i].getNome())){
				classes[i] = null;
				for(int j = i; j < this.tamanho; j++){
					if(j != this.tamanho-1){
						classes[j] = classes[j + 1];
					}
				}
				this.posit = this.posit - 1;
			}
		}
	}
	public boolean existe(int id,String nome) {
		if(this.posit != 0){
			for(int i = 0; i < posit; i++){
				if(this.classes[i].getNome().equals(nome)||this.classes[i].getId()==id){
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

	public Classe getClasse(int posic) {
		return classes[posic];
	}	
}

