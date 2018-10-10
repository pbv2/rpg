package interfaces;

import basicas.Monstro;


public interface RepositorioMonstros{
	void inserir(Monstro monstro);
	 Monstro procurar(String nome);
	 void atualizar(Monstro monstro);
	 void remover(String nome);
	 boolean existe(int id,String nome);
	 int tamanho();
}