package interfaces;

import basicas.Desvantagens;


public interface RepositorioDesvantagens {
	 void inserir(Desvantagens desvantagem);
	 Desvantagens procurar(int id);
	 void atualizar(Desvantagens desvantagem);
	 void remover(int id);
	 boolean existe(int id);
	 int tamanho();
}