package abstratas;

import basicas.Classe;
import basicas.Desvantagens;
import basicas.Pericias;
import basicas.Raca;
import basicas.Vantagens;


public abstract class Entidade {
	protected int id;
	protected String nome;
	protected int forca;
	protected int habilidade;
	protected int resistencia;
	protected int armadura;
	protected int poderdefogo;
	protected int pontodevida;
	protected int pontodemana;
	protected Classe classe;
	protected Raca raca;
	protected Vantagens vantagens;
	protected Desvantagens desvantagens;
	protected Pericias pericias;
		public Entidade(int id,String nome, int forca, int habilidade, int resistencia, int armadura, 
				int poderdefogo, int pontodevida, int pontodemana,
				Classe classe, Raca raca,
				Vantagens vantagens,
				Desvantagens desvantagens,Pericias pericias){
			this.id = id;
			this.nome = nome;
			this.forca = forca;
			this.habilidade = habilidade;
			this.resistencia = resistencia;
			this.armadura = armadura;
			this.poderdefogo = poderdefogo;
			this.pontodevida = pontodevida;
			this.pontodemana = pontodemana;
			this.classe = classe;
			this.raca = raca;
			this.vantagens = vantagens;
			this.desvantagens = desvantagens;
			this.pericias = pericias;
		}
		public int getId(){
			return this.id;
		}
		public String getNome(){
			return this.nome;
		}
		public int getForca(){
			return this.forca;
		}
		public int getHabilidade(){
			return this.habilidade;
		}
		public int getResistencia(){
			return this.resistencia;
		}
		public int getArmadura(){
			return this.armadura;
		}
		public int getPoderdeFogo(){
			return this.poderdefogo;
		}
		public int getPontodeVida(){
			return this.pontodevida;
		}
		public int getPontodeMana(){
			return this.pontodemana;
		}
		public Classe getClasse(){
			return this.classe;
		}
		public Raca getRaca(){
			return this.raca;
		}
		
		public Vantagens getVantagens(){
			return this.vantagens;
		}
		public Desvantagens getDesvantagens(){
			return this.desvantagens;
		}
		public Pericias getPericias(){
			return this.pericias;
		}
		
}