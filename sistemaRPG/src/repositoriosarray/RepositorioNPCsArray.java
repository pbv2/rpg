package repositoriosarray;

import basicas.NPC;
import interfaces.RepositorioNPCs;

public class RepositorioNPCsArray implements RepositorioNPCs{
	private NPC[] npcs;
	private int posit;
	private int tamanho;
		public RepositorioNPCsArray(int tamanho){
			this.tamanho = tamanho;
			this.npcs = new NPC[tamanho];
			this.posit = 0;
		}
	public void inserir(NPC npc) {
		this.npcs[posit] = npc;
		posit++;
	}
	public NPC procurar(String nome) {
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(npcs[i].getNome())){
				return npcs[i];
			}
		}
		return null;
	}

	public void atualizar(NPC npc) {
		for(int i = 0; i < this.posit; i++){
			if(npc.getNome().equals(npcs[i].getNome())){
				 npcs[i] = npc;
			}
		}
	}
	public void remover(String nome) {
		for(int i = 0; i < this.posit; i++){
			if(nome.equals(npcs[i].getNome())){
				npcs[i] = null;
				for(int j = i; j < this.tamanho; j++){
					if(j != this.tamanho-1){
						npcs[j] = npcs[j + 1];
					}
				}
				this.posit = this.posit - 1;
			}
		}
	}
	public boolean existe(int id,String nome) {
		if(this.posit!=0){
			for(int i = 0; i < posit; i++){
				if(this.npcs[i].getNome().equals(nome)||this.npcs[i].getId()==id){
					return true;
				}else if(i == this.tamanho-1){
					return false;
				}
			}
		}else{
			return false;
		}	
		return false;
	}
	public int tamanho() {
		return this.posit;
	}	
}