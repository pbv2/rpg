package interfaces;

import basicas.Pericias;


public interface RepositorioPericias {
	void inserir(Pericias pericia);
	 Pericias procurar(int id);
	 void atualizar(Pericias pericia);
	 void remover(int id);
	 boolean existe(int id);
	 int tamanho();
}