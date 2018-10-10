package cadastros;

import basicas.Poderes;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioPoderes;
import repositoriosarray.RepositorioPoderesArray;
import repositorioslistas.RepositorioPoderesLista;

public class CadastroPoderes {
	private RepositorioPoderes poderes;
		public CadastroPoderes(RepositorioPoderes poderes){
			this.poderes = poderes;
		}
		public void cadastrar(Poderes poder) throws ObjetoJaExiste{
			if(this.poderes.existe(poder.getId())){
				throw new ObjetoJaExiste();
			}else{
				this.poderes.inserir(poder);
			}
		}
		public void descadastrar(Poderes poder) throws ObjetoNaoExiste{
			if(!this.poderes.existe(poder.getId())){
				throw new ObjetoNaoExiste();
			}else{
				this.poderes.remover(poder.getId());
			}
		}
		public void atualizar(Poderes poder) throws ObjetoNaoEncontrado{
			if(!this.poderes.existe(poder.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.poderes.atualizar(poder);
			}
		}
		public Poderes procurar(Poderes poder) throws ObjetoNaoEncontrado{
			if(!this.poderes.existe(poder.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.poderes.procurar(poder.getId());
			}
		}
		
		public RepositorioPoderes getRep(){
			return this.poderes;
		}
}