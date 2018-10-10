package basicas;

import abstratas.Personagem;
import repositoriosarray.RepositorioDesvantagensArray;
import repositoriosarray.RepositorioPericiasArray;
import repositoriosarray.RepositorioVantagensArray;
import repositorioslistas.RepositorioDesvantagensLista;
import repositorioslistas.RepositorioPericiasLista;
import repositorioslistas.RepositorioVantagensLista;

public class Heroi extends Personagem{

	public Heroi(int id, String nome, int forca, int habilidade, int resistencia, int armadura, int poderdefogo,
			int pontodevida, int pontodemana, Classe classe, Raca raca,
			Vantagens vantagens,
			Desvantagens desvantagens,Pericias pericias,String historia, int pontos,
			int experiencia) {
		super(id, nome, forca, habilidade, resistencia, armadura, poderdefogo, pontodevida, pontodemana, classe, raca, vantagens,
				desvantagens, pericias, historia, pontos, experiencia);
	}
	
}