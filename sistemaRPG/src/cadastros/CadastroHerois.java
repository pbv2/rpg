package cadastros;

import basicas.Heroi;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioHerois;
import repositoriosarray.RepositorioHeroisArray;
import repositorioslistas.RepositorioHeroisLista;

public class CadastroHerois {
	private RepositorioHerois herois;
		public CadastroHerois(RepositorioHerois herois){
			this.herois = herois;
		}
		public void cadastrar(Heroi heroi) throws ObjetoJaExiste{
			if(this.herois.existe(heroi.getId(),heroi.getNome())){
				throw new ObjetoJaExiste();
			}else{
				this.herois.inserir(heroi);
			}
		}
		public void descadastrar(Heroi heroi) throws ObjetoNaoExiste{
			if(!this.herois.existe(heroi.getId(),heroi.getNome())){
				throw new ObjetoNaoExiste();
			}else{
				this.herois.remover(heroi.getNome());
			}
		}
		public void atualizar(Heroi heroi) throws ObjetoNaoEncontrado{
			if(!this.herois.existe(heroi.getId(),heroi.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.herois.atualizar(heroi);
			}
		}
		public Heroi procurar(Heroi heroi) throws ObjetoNaoEncontrado{
			if(!this.herois.existe(heroi.getId(),heroi.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.herois.procurar(heroi.getNome());
			}
		}
		public RepositorioHerois getRep(){
			return this.herois;
		}
}