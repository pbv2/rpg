package cadastros;

import basicas.NPC;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioNPCs;
import repositoriosarray.RepositorioNPCsArray;
import repositorioslistas.RepositorioNPCsLista;

public class CadastroNPCs {
	private RepositorioNPCs npcs;
		public CadastroNPCs(RepositorioNPCs npcs){
			this.npcs = npcs;
		}
		public void cadastrar(NPC npc) throws ObjetoJaExiste{
			if(this.npcs.existe(npc.getId(),npc.getNome())){
				throw new ObjetoJaExiste();
			}else{
				this.npcs.inserir(npc);
			}
		}
		public void descadastrar(NPC npc) throws ObjetoNaoExiste{
			if(!this.npcs.existe(npc.getId(),npc.getNome())){
				throw new ObjetoNaoExiste();
			}else{
				this.npcs.remover(npc.getNome());
			}
		}
		public void atualizar(NPC npc) throws ObjetoNaoEncontrado{
			if(!this.npcs.existe(npc.getId(),npc.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.npcs.atualizar(npc);
			}
		}
		public NPC procurar(NPC npc) throws ObjetoNaoEncontrado{
			if(!this.npcs.existe(npc.getId(),npc.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.npcs.procurar(npc.getNome());
			}
		}
		public RepositorioNPCs getRep(){
			return this.npcs;
		}
}