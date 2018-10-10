package interfaces;

import basicas.Vantagens;

public interface RepositorioVantagens {
	 void inserir(Vantagens vantagem);
	 Vantagens procurar(int id);
	 void atualizar(Vantagens vantagem);
	 void remover(int id);
	 boolean existe(int id);
	 int tamanho();
}