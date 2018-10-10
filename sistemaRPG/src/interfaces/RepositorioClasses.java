package interfaces;

import basicas.Classe;

public interface RepositorioClasses {
	 void inserir(Classe classe);
	 Classe procurar(String nome);
	 void atualizar(Classe classe);
	 void remover(String nome);
	 boolean existe(int id,String nome);
	 int tamanho();
	 public Classe getClasse(int posic);
}