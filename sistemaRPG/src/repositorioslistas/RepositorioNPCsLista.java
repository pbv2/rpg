package repositorioslistas;

import basicas.NPC;
import interfaces.RepositorioNPCs;

public class RepositorioNPCsLista implements RepositorioNPCs{
	private NPC npc;
	private RepositorioNPCsLista next;
		public RepositorioNPCsLista(){
			this.npc = null;
			this.next = null;
		}
		public NPC getNPC(int posic){
			if(posic == 0){
				return this.npc;
			}else{
				return this.next.getNPC(posic -1);
			}
		}
	public void inserir(NPC npc) {
		if(this.npc == null){
			this.npc = npc;
			this.next = new RepositorioNPCsLista();
		}else{
			this.next.inserir(npc);
		}
	}

	public NPC procurar(String nome) {
		if(!nome.equals(this.npc.getNome())){
			return this.next.procurar(nome);
		}else{
			return this.npc;
		}
	}

	public void atualizar(NPC npc) {
			if(this.npc.getNome().equals(npc.getNome())){
				this.npc = npc;
			}else{
				this.next.atualizar(npc);
			}
			
	}

	public void remover(String nome) {
			if(this.npc.getNome().equals(nome)){
				this.npc = this.next.npc;
				this.next = this.next.next;
			}else{
				this.next.remover(nome);
			}
		
	}
	public boolean existe(int id,String nome) {
		if(this.npc!=null){
			if(this.npc.getNome().equals(nome)||this.npc.getId()==id){
				return true;
			}else if(this.next.npc != null){
				return this.next.existe(id,nome);
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
	public int tamanho(){
		if(this.npc!=null){
			return 1+this.next.tamanho();
		}else{
			return 0;
		}
	}

}