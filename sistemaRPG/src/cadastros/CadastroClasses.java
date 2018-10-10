package cadastros;

import basicas.Classe;
import excessoes.ObjetoJaExiste;
import excessoes.ObjetoNaoEncontrado;
import excessoes.ObjetoNaoExiste;
import interfaces.RepositorioClasses;
import repositoriosarray.RepositorioClassesArray;
import repositorioslistas.RepositorioClassesLista;

public class CadastroClasses {
	private RepositorioClasses classes;
		public CadastroClasses(RepositorioClasses classes){
			this.classes = classes;
		}
		public void cadastrar(Classe classe) throws ObjetoJaExiste{
			if(this.classes.existe(classe.getId(),classe.getNome())){
				throw new ObjetoJaExiste();
			}else{
				this.classes.inserir(classe);
			}
		}
		public void descadastrar(Classe classe) throws ObjetoNaoExiste{
			if(!this.classes.existe(classe.getId(),classe.getNome())){
				throw new ObjetoNaoExiste();
			}else{
				this.classes.remover(classe.getNome());
			}
		}
		public void atualizar(Classe classe) throws ObjetoNaoEncontrado{
			if(!this.classes.existe(classe.getId(),classe.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				this.classes.atualizar(classe);
			}
		}
		public Classe procurar(Classe classe) throws ObjetoNaoEncontrado{
			if(!this.classes.existe(classe.getId(),classe.getNome())){
				throw new ObjetoNaoEncontrado();
			}else{
				return this.classes.procurar(classe.getNome());
			}
		}
		public RepositorioClasses getRep(){
			return this.classes;
		}
}