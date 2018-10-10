package cadastros;

import basicas.Raca;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioRacas;
import repositoriosarray.RepositorioRacasArray;
import repositorioslistas.RepositorioRacasLista;

public class CadastroRacas {
	private RepositorioRacas racas;
		public CadastroRacas(RepositorioRacas racas){
			this.racas = racas;
		}
		public void cadastrar(Raca raca) throws ObjetoJaExiste{
			if(this.racas.existe(raca.getId(),raca.getNome())){
				throw new ObjetoJaExiste();
			}else{
				this.racas.inserir(raca);
			}
		}
		public void descadastrar(Raca raca) throws ObjetoNaoExiste{
			if(!this.racas.existe(raca.getId(),raca.getNome())){
				throw new ObjetoNaoExiste();
			}else{
				this.racas.remover(raca.getNome());
			}
		}
		public void atualizar(Raca raca) throws ObjetoNaoEncontrado{
			if(!this.racas.existe(raca.getId(),raca.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.racas.atualizar(raca);
			}
		}
		public Raca procurar(Raca raca) throws ObjetoNaoEncontrado{
			if(!this.racas.existe(raca.getId(),raca.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.racas.procurar(raca.getNome());
			}
		}
		public RepositorioRacas getRep(){
			return this.racas;
		}
}