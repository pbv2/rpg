package abstratas;

import basicas.Classe;
import basicas.Desvantagens;
import basicas.Pericias;
import basicas.Raca;
import basicas.Vantagens;


public abstract class Personagem extends Entidade{
	private String historia;
	private int pontos;
	private int experiencia;
		public Personagem(int id,String nome, int forca, int habilidade, int resistencia, int armadura, 
				int poderdefogo, int pontodevida, int pontodemana,
				Classe classe, Raca raca,
				Vantagens vantagens,
				Desvantagens desvantagens,Pericias pericias,
				String historia, int pontos, int experiencia){
			super(id,nome,forca,habilidade,resistencia,armadura,poderdefogo,pontodevida,pontodemana,
					classe,raca,vantagens,desvantagens,pericias);
			this.historia = historia;
			this.pontos = pontos;
			this.experiencia = experiencia;
		}
		public String getNome(){
			return super.nome;
		}
		public int getForca(){
			return super.forca;
		}
		public int getHabilidade(){
			return super.habilidade;
		}
		public int getResistencia(){
			return super.resistencia;
		}
		public int getArmadura(){
			return super.armadura;
		}
		public int getPoderDeFogo(){
			return super.poderdefogo;
		}
		public int getPontoDeVida(){
			return super.pontodevida;
		}
		public int getPontoDeMana(){
			return super.pontodemana;
		}
		public Classe getClasse(){
			return super.classe;
		}
		public Raca getRaca(){
			return super.raca;
		}
		
		public Vantagens getVantagens(){
			return super.vantagens;
		}
		public Desvantagens getDesvantagens(){
			return super.desvantagens;
		}
		public Pericias getPericias(){
			return super.pericias;
		}
		
		public String getHistoria(){
			return this.historia;
		}
		public int getPontos(){
			return this.pontos;
		}
		public int getExperiencia(){
			return this.experiencia;
		}
}