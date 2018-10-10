package interfaces;

import basicas.NPC;


public interface RepositorioNPCs {
	void inserir(NPC npc);
	 NPC procurar(String nome);
	 void atualizar(NPC npc);
	 void remover(String nome);
	 boolean existe(int id,String nome);
	 int tamanho();
}