package interfaces;

import basicas.Classe;
import basicas.Poderes;


public interface RepositorioPoderes {
	void inserir(Poderes poder);
	 Poderes procurar(int id);
	 void atualizar(Poderes poder);
	 void remover(int id);
	 boolean existe(int id);
	 int tamanho();
	Poderes getPoder(int i);
}