package basicas;

import abstratas.Entidade;
import repositoriosarray.RepositorioDesvantagensArray;
import repositoriosarray.RepositorioPericiasArray;
import repositoriosarray.RepositorioVantagensArray;
import repositorioslistas.RepositorioDesvantagensLista;
import repositorioslistas.RepositorioPericiasLista;
import repositorioslistas.RepositorioVantagensLista;

public class Monstro extends Entidade{

	public Monstro(int id,String nome, int forca, int habilidade, int resistencia, int armadura, int poderdefogo,
			int pontodevida, int pontodemana, Classe classe, Raca raca, Vantagens vantagens,
			Desvantagens desvantagens, Pericias pericias) {
		super(id, nome, forca, habilidade, resistencia, armadura, poderdefogo, pontodevida, pontodemana, classe, raca, vantagens,
				desvantagens, pericias);
	}

}