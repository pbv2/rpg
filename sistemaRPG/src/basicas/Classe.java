package basicas;

import interfaces.RepositorioPoderes;
import repositoriosarray.RepositorioPoderesArray;
import repositorioslistas.RepositorioPoderesLista;

public class Classe {
	private int id;
	private String nomeclasse;
	private Poderes poderes;
		public Classe(int id,String nomeclasse,int tamanhopoderes){
			this.id = id;
			this.nomeclasse = nomeclasse;
			this.poderes = new Poderes(id,tamanhopoderes);
		}		
	public int getId(){
		return this.id;
	}
	public String getNome(){
		return this.nomeclasse;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setNome(String nome){
		this.nomeclasse = nome;
	}
	public Poderes getPoderes(){
		return this.poderes;
	}
}