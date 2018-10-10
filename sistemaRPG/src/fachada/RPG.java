package fachada;

import cadastros.*;
import interfaces.*;
import repositoriosarray.*;
import repositorioslistas.*;


public class RPG {
	private CadastroClasses cadastroclasses;
	private CadastroDesvantagens cadastrodesvantagens;
	private CadastroHerois cadastroherois;
	private CadastroMonstros cadastromonstros;
	private CadastroNPCs cadastronpcs;
	private CadastroPericias cadastropericias;
	private CadastroPoderes cadastropoderes;
	private CadastroRacas cadastroracas;
	private CadastroVantagens cadastrovantagens;
	   
		public RPG(RepositorioClasses c, RepositorioDesvantagens d, 
				RepositorioHerois h, RepositorioMonstros m, 
				RepositorioNPCs n, RepositorioPericias pe, 
				RepositorioPoderes po, RepositorioRacas r,
				RepositorioVantagens v){
			this.cadastroclasses = new CadastroClasses(c);
			this.cadastrodesvantagens = new CadastroDesvantagens(d);
			this.cadastroherois = new CadastroHerois(h);
			this.cadastromonstros = new CadastroMonstros(m);
			this.cadastronpcs = new CadastroNPCs(n);
			this.cadastropericias = new CadastroPericias(pe);
			this.cadastropoderes= new CadastroPoderes(po);
			this.cadastroracas = new CadastroRacas(r);
			this.cadastrovantagens = new CadastroVantagens(v);
		}
		
		public RPG(){
			this.cadastroclasses = new CadastroClasses(new RepositorioClassesLista());
			this.cadastrodesvantagens = new CadastroDesvantagens(new RepositorioDesvantagensLista());
			this.cadastroherois = new CadastroHerois(new RepositorioHeroisLista());
			this.cadastromonstros = new CadastroMonstros(new RepositorioMonstrosLista());
			this.cadastronpcs = new CadastroNPCs(new RepositorioNPCsLista());
			this.cadastropericias = new CadastroPericias(new RepositorioPericiasLista());
			this.cadastropoderes= new CadastroPoderes(new RepositorioPoderesLista());
			this.cadastroracas = new CadastroRacas(new RepositorioRacasLista());
			this.cadastrovantagens = new CadastroVantagens(new RepositorioVantagensLista());
		}
		public CadastroClasses getCadastroClasses(){
			return this.cadastroclasses;
		}
		public CadastroDesvantagens getCadastroDesvantagens(){
			return this.cadastrodesvantagens;
		}
		public CadastroHerois getCadastroHerois(){
			return this.cadastroherois;
		}
		public CadastroMonstros getCadastroMonstros(){
			return this.cadastromonstros;
		}
		public CadastroNPCs getCadastroNPCs(){
			return this.cadastronpcs;
		}
		public CadastroPericias getCadastroPericias(){
			return this.cadastropericias;
		}
		public CadastroPoderes getCadastroPoderes(){
			return this.cadastropoderes;
		}
		public CadastroRacas getCadastroRacas(){
			return this.cadastroracas;
		}
		public CadastroVantagens getCadastroVantagens(){
			return this.cadastrovantagens;
		}
		
}