package cadastros;

import basicas.Vantagens;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioVantagens;
import repositoriosarray.RepositorioVantagensArray;
import repositorioslistas.RepositorioClassesLista;
import repositorioslistas.RepositorioVantagensLista;

public class CadastroVantagens {
	private RepositorioVantagens vantagens;
		public CadastroVantagens(RepositorioVantagens vantagens){
			this.vantagens = vantagens;
		}
		public void cadastrar(Vantagens vantagem) throws ObjetoJaExiste{
			if(this.vantagens.existe(vantagem.getId())){
				throw new ObjetoJaExiste();
			}else{
				this.vantagens.inserir(vantagem);
			}
		}
		public void descadastrar(Vantagens vantagem) throws ObjetoNaoExiste{
			if(!this.vantagens.existe(vantagem.getId())){
				throw new ObjetoNaoExiste();
			}else{
				this.vantagens.remover(vantagem.getId());
			}
		}
		public void atualizar(Vantagens vantagem) throws ObjetoNaoEncontrado{
			if(!this.vantagens.existe(vantagem.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.vantagens.atualizar(vantagem);
			}
		}
		public Vantagens procurar(Vantagens vantagem) throws ObjetoNaoEncontrado{
			if(!this.vantagens.existe(vantagem.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.vantagens.procurar(vantagem.getId());
			}
		}

		public RepositorioVantagens getRep(){
			return this.vantagens;
		}
}