package interfaces;

import basicas.Raca;


public interface RepositorioRacas {
	 void inserir(Raca raca);
	 Raca procurar(String nome);
	 void atualizar(Raca raca);
	 void remover(String nome);
	 boolean existe(int id,String nome);
	 int tamanho();
}