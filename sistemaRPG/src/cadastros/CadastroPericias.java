package cadastros;

import basicas.Pericias;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioPericias;
import repositoriosarray.RepositorioPericiasArray;
import repositorioslistas.RepositorioPericiasLista;

public class CadastroPericias {
	private RepositorioPericias pericias;
		public CadastroPericias(RepositorioPericias pericias){
			this.pericias = pericias;
		}
		public void cadastrar(Pericias pericia) throws ObjetoJaExiste{
			if(this.pericias.existe(pericia.getId())){
				throw new ObjetoJaExiste();
			}else{
				this.pericias.inserir(pericia);
			}
		}
		public void descadastrar(Pericias pericia) throws ObjetoNaoExiste{
			if(!this.pericias.existe(pericia.getId())){
				throw new ObjetoNaoExiste();
			}else{
				this.pericias.remover(pericia.getId());
			}
		}
		public void atualizar(Pericias pericia) throws ObjetoNaoEncontrado{
			if(!this.pericias.existe(pericia.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.pericias.atualizar(pericia);
			}
		}
		public Pericias procurar(Pericias pericia) throws ObjetoNaoEncontrado{
			if(!this.pericias.existe(pericia.getId())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.pericias.procurar(pericia.getId());
			}
		}
		/*
		public RepositorioPericiasArray getRep(){
			return this.pericias;
		}
		*/
		public RepositorioPericias getRep(){
			return this.pericias;
		}
}