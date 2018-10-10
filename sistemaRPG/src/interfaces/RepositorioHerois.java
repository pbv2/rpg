package interfaces;

import basicas.Heroi;


public interface RepositorioHerois {
	void inserir(Heroi heroi);
	 Heroi procurar(String nome);
	 void atualizar(Heroi heroi);
	 void remover(String nome);
	 boolean existe(int id,String nome);
	 int tamanho();
}