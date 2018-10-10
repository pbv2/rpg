package cadastros;

import basicas.Monstro;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioMonstros;
import repositoriosarray.RepositorioMonstrosArray;
import repositorioslistas.RepositorioMonstrosLista;

public class CadastroMonstros {
	private RepositorioMonstros monstros;
		public CadastroMonstros(RepositorioMonstros monstros){
			this.monstros = monstros;
		}
		public void cadastrar(Monstro monstro) throws ObjetoJaExiste{
			if(this.monstros.existe(monstro.getId(),monstro.getNome())){
				throw new ObjetoJaExiste();
			}else{
				this.monstros.inserir(monstro);
			}
		}
		public void descadastrar(Monstro monstro) throws ObjetoNaoExiste{
			if(!this.monstros.existe(monstro.getId(),monstro.getNome())){
				throw new ObjetoNaoExiste();
			}else{
				this.monstros.remover(monstro.getNome());
			}
		}
		public void atualizar(Monstro monstro) throws ObjetoNaoEncontrado{
			if(!this.monstros.existe(monstro.getId(),monstro.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.monstros.atualizar(monstro);
			}
		}
		public Monstro procurar(Monstro monstro) throws ObjetoNaoEncontrado{
			if(!this.monstros.existe(monstro.getId(),monstro.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.monstros.procurar(monstro.getNome());
			}
		}
		public RepositorioMonstros getRep(){
			return this.monstros;
		}
}