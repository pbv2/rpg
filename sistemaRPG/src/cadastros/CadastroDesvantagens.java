package cadastros;

import basicas.Desvantagens;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioDesvantagens;
import repositoriosarray.RepositorioDesvantagensArray;
import repositorioslistas.RepositorioDesvantagensLista;

public class CadastroDesvantagens {
	private RepositorioDesvantagens desvantagens;
		public CadastroDesvantagens(RepositorioDesvantagens desvantagens){
			this.desvantagens = desvantagens;
		}
		public void cadastrar(Desvantagens desvantagem) throws ObjetoJaExiste{
			if(this.desvantagens.existe(desvantagem.getId())){
				throw new ObjetoJaExiste();
			}else{
				this.desvantagens.inserir(desvantagem);
			}
		}
		public void descadastrar(Desvantagens desvantagem) throws ObjetoNaoExiste{
			if(!this.desvantagens.existe(desvantagem.getId())){
				throw new ObjetoNaoExiste();
			}else{
				this.desvantagens.remover(desvantagem.getId());
			}
		}
		public void atualizar(Desvantagens desvantagem) throws ObjetoNaoEncontrado{
			if(!this.desvantagens.existe(desvantagem.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.desvantagens.atualizar(desvantagem);
			}
		}
		public Desvantagens procurar(Desvantagens desvantagem) throws ObjetoNaoEncontrado{
			if(!this.desvantagens.existe(desvantagem.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.desvantagens.procurar(desvantagem.getId());
			}
		}
		/*
		public RepositorioDesvantagensArray getRep(){
			return this.desvantagens;
		}
		*/
		public RepositorioDesvantagens getRep(){
			return this.desvantagens;
		}
}