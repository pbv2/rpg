package tester;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


import basicas.*;
import excessoes.*;
import fachada.RPG;
import interfaces.*;
import repositoriosarray.*;
import repositorioslistas.*;

public class Teste {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BufferedReader br;
		String linha = "";
		
		Path file=Paths.get("src/config.txt");
		InputStream is;
		try {
			is = Files.newInputStream(file);
			br = new BufferedReader(new InputStreamReader(is));
			linha = br.readLine();
		} catch (IOException excessao) {
			System.out.println("Erro ao ler o arquivo");
		}
		
		
		//Definir quantidade total de elementos nos repositórios e criar Classe Fachada(p/ array)
		RepositorioClasses classes = null;
		RepositorioDesvantagens desvantagens = null;
		RepositorioHerois herois = null;
		RepositorioMonstros monstros = null;
		RepositorioNPCs npcs = null;
		RepositorioPericias pericias = null;
		RepositorioRacas racas = null;
		RepositorioPoderes poderes = null;
		RepositorioVantagens vantagens = null;
		
		if(linha.equals("array")){
			classes = new RepositorioClassesArray(10);
			desvantagens = new RepositorioDesvantagensArray(10);
			herois = new RepositorioHeroisArray(10);
			monstros = new RepositorioMonstrosArray(10);
			npcs = new RepositorioNPCsArray(10);
			pericias = new RepositorioPericiasArray(10);
			racas = new RepositorioRacasArray(10);
			poderes = new RepositorioPoderesArray(10);
			vantagens = new RepositorioVantagensArray(10);
		}else if(linha.equals("lista")){
			classes = new RepositorioClassesLista();
			desvantagens = new RepositorioDesvantagensLista();
			herois = new RepositorioHeroisLista();
			monstros = new RepositorioMonstrosLista();
			npcs = new RepositorioNPCsLista();
			pericias = new RepositorioPericiasLista();
			racas = new RepositorioRacasLista();
			poderes = new RepositorioPoderesLista();
			vantagens = new RepositorioVantagensLista();
		}else{
			System.out.println("verifique o arquivo e tente novamente");
		}
		
		
		
		RPG rpg = new RPG(classes,desvantagens,herois,monstros,npcs,pericias,poderes,racas,vantagens);
		
		
		
		//________________________________//
		//Criar classe Guerreiro//
		Classe guerreiro = new Classe(1,"Guerreiro",5);
		try {
			rpg.getCadastroClasses().cadastrar(guerreiro);
			try {
				rpg.getCadastroPoderes().cadastrar(rpg.getCadastroClasses().procurar(guerreiro).getPoderes());
			} catch (ObjetoNaoEncontrado e) {
				e.printStackTrace();
			}
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Adicionar poderes ao guerreiro//
		try {
			rpg.getCadastroClasses().procurar(guerreiro).getPoderes().adicionarPoder("Ataque Duplo");
		} catch (ObjetoNaoEncontrado e16) {
			e16.printStackTrace();
		}
		try {
			rpg.getCadastroClasses().procurar(guerreiro).getPoderes().adicionarPoder("Manejar Espadas");
		} catch (ObjetoNaoEncontrado e15) {
			e15.printStackTrace();
		}
		try {
			rpg.getCadastroClasses().procurar(guerreiro).getPoderes().adicionarPoder("Resistência à fome");
		} catch (ObjetoNaoEncontrado e14) {
			e14.printStackTrace();
		}
		try {
			rpg.getCadastroPoderes().atualizar(rpg.getCadastroClasses().procurar(guerreiro).getPoderes());
		} catch (ObjetoNaoEncontrado e13) {
			e13.printStackTrace();
		}
		
		//Criar classe Ladrão//
		Classe ladrao = new Classe(2,"ladrão",5);
		try {
			rpg.getCadastroClasses().cadastrar(ladrao);
			try {
				rpg.getCadastroPoderes().cadastrar(rpg.getCadastroClasses().procurar(ladrao).getPoderes());
			} catch (ObjetoNaoEncontrado e) {
				e.printStackTrace();
			}
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Adicionar poderes ao ladrão//
		try {
			rpg.getCadastroClasses().procurar(ladrao).getPoderes().adicionarPoder("Velocidade");
		} catch (ObjetoNaoEncontrado e12) {
			e12.printStackTrace();
		}
		try {
			rpg.getCadastroClasses().procurar(ladrao).getPoderes().adicionarPoder("Furtividade");
		} catch (ObjetoNaoEncontrado e11) {
			e11.printStackTrace();
		}
		try {
			rpg.getCadastroClasses().procurar(ladrao).getPoderes().adicionarPoder("Manejar Adagas");
		} catch (ObjetoNaoEncontrado e10) {
			e10.printStackTrace();
		}
		try {
			rpg.getCadastroPoderes().atualizar(rpg.getCadastroClasses().procurar(ladrao).getPoderes());
		} catch (ObjetoNaoEncontrado e9) {
			e9.printStackTrace();
		}
		//Criar classe Mago//
		Classe mago = new Classe(3,"Mago",5);
		try {
			rpg.getCadastroClasses().cadastrar(mago);
			try {
				rpg.getCadastroPoderes().cadastrar(rpg.getCadastroClasses().procurar(mago).getPoderes());
			} catch (ObjetoNaoEncontrado e) {
				e.printStackTrace();
			}
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Adicionar Poderes ao Mago//
			try {
				rpg.getCadastroClasses().procurar(mago).getPoderes().adicionarPoder("Sabedoria");
			} catch (ObjetoNaoEncontrado e8) {
				e8.printStackTrace();
			}
			try {
				rpg.getCadastroClasses().procurar(mago).getPoderes().adicionarPoder("Manejar artes arcanas");
			} catch (ObjetoNaoEncontrado e7) {
				e7.printStackTrace();
			}
			try {
				rpg.getCadastroClasses().procurar(mago).getPoderes().adicionarPoder("Leitura de livros");
			} catch (ObjetoNaoEncontrado e6) {
				e6.printStackTrace();
			}
			try {
				rpg.getCadastroPoderes().atualizar(rpg.getCadastroClasses().procurar(mago).getPoderes());
			} catch (ObjetoNaoEncontrado e5) {
				e5.printStackTrace();
			}
		//Criar classe Bardo//
		Classe bardo = new Classe(4,"Bardo",5);
		try {
			rpg.getCadastroClasses().cadastrar(bardo);
			try {
				rpg.getCadastroPoderes().cadastrar(rpg.getCadastroClasses().procurar(bardo).getPoderes());
			} catch (ObjetoNaoEncontrado e) {
				e.printStackTrace();
			}
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Bardo? Neeeem... Quem joga de Bardo não merece viver//
		try {
			try {
				rpg.getCadastroPoderes().descadastrar(rpg.getCadastroClasses().procurar(bardo).getPoderes());
			} catch (ObjetoNaoEncontrado e) {
				e.printStackTrace();
			}
			rpg.getCadastroClasses().descadastrar(bardo);
		} catch (ObjetoNaoExiste e) {
			e.printStackTrace();
		}
		
		//Vamos ver as características do Ladrão...
		try {
			Classe caracladrao = rpg.getCadastroClasses().procurar(ladrao);
			System.out.println("__________________________________");
			System.out.println("Características da Classe ladrão: ");
			System.out.println("__________________________________");
			System.out.println("ID: "+caracladrao.getId());
			System.out.println("Nome da Classe: "+caracladrao.getNome());
			System.out.print("Poderes: ");
				for(int i = 0; i < caracladrao.getPoderes().getPosit();i++){
					if(i!=caracladrao.getPoderes().getPosit()-1){
						System.out.print(caracladrao.getPoderes().getPoderes()[i]+", ");
					}else{
						System.out.print(caracladrao.getPoderes().getPoderes()[i]);
					}
				}
				System.out.println();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		//Vamos criar uma raça Humano//
		Raca humano = new Raca(1,"Humano");
		try {
			rpg.getCadastroRacas().cadastrar(humano);
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Ops, eu quero mudar o nome do ladrão para Ladrão//
			Classe aux = null;
			try {
				aux = rpg.getCadastroClasses().procurar(ladrao);
			} catch (ObjetoNaoEncontrado e4) {
				e4.printStackTrace();
			}
			aux.setNome("Ladrão");
			try {
				rpg.getCadastroClasses().atualizar(aux);
			} catch (ObjetoNaoEncontrado e3) {
				e3.printStackTrace();
			}
		//Vamos ver se atualizou mesmo...//
		try {
			Classe caracladrao = rpg.getCadastroClasses().procurar(ladrao);
			System.out.println("__________________________________");
			System.out.println("Características da Classe ladrão: ");
			System.out.println("__________________________________");
			System.out.println("ID: "+caracladrao.getId());
			System.out.println("Nome da Classe: "+caracladrao.getNome());
			System.out.print("Poderes: ");
			for(int i = 0; i < caracladrao.getPoderes().getPosit();i++){
				if(i!=caracladrao.getPoderes().getPosit()-1){
					System.out.print(caracladrao.getPoderes().getPoderes()[i]+", ");
				}else{
					System.out.print(caracladrao.getPoderes().getPoderes()[i]);
				}
			}
			System.out.println();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		//Agora vamos criar um Herói//
		Heroi aragorn = null;
		
			try {
				aragorn = new Heroi(1,"Aragorn",2,4,2,2,0,20,15,
						rpg.getCadastroClasses().procurar(guerreiro),rpg.getCadastroRacas().procurar(humano),
						new Vantagens(1,5),new Desvantagens(1,5),
					    new Pericias(1,5),"Um simples guerreiro",0,0);
				try {
					rpg.getCadastroHerois().cadastrar(aragorn);
				} catch (ObjetoJaExiste e) {
					e.printStackTrace();
				}
			} catch (ObjetoNaoEncontrado e3) {
				e3.printStackTrace();
			}
			try {
				try {
					rpg.getCadastroVantagens().cadastrar(rpg.getCadastroHerois().procurar(aragorn).getVantagens());
				} catch (ObjetoNaoEncontrado e) {
					e.printStackTrace();
				}
			} catch (ObjetoJaExiste e2) {
				e2.printStackTrace();
			}
			try {
				try {
					rpg.getCadastroDesvantagens().cadastrar(rpg.getCadastroHerois().procurar(aragorn).getDesvantagens());
				} catch (ObjetoNaoEncontrado e) {
					e.printStackTrace();
				}
			} catch (ObjetoJaExiste e1) {
				e1.printStackTrace();
			}
			try {
				try {
					rpg.getCadastroPericias().cadastrar(rpg.getCadastroHerois().procurar(aragorn).getPericias());
				} catch (ObjetoNaoEncontrado e) {
					e.printStackTrace();
				}
			} catch (ObjetoJaExiste e) {
				e.printStackTrace();
			}
				try {
					rpg.getCadastroHerois().atualizar(aragorn);
				} catch (ObjetoNaoEncontrado e) {
					e.printStackTrace();
				}
			
		//Vamos adicionar Vantagens à Aragorn//
		try {
			rpg.getCadastroHerois().procurar(aragorn).getVantagens().adicionarVantagem("Familiaridade com Gondor");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroHerois().procurar(aragorn).getVantagens().adicionarVantagem("Falar com Humano");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroHerois().procurar(aragorn).getVantagens().adicionarVantagem("Passado Heróico");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroVantagens().atualizar(rpg.getCadastroHerois().procurar(aragorn).getVantagens());
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		//Vamos adicionar Desvantagens à Aragorn//
		try {
			rpg.getCadastroHerois().procurar(aragorn).getDesvantagens().adicionarDesvantagem("Leitura Fraca");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroHerois().procurar(aragorn).getDesvantagens().adicionarDesvantagem("Dificuldade de locomoção");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroHerois().procurar(aragorn).getDesvantagens().adicionarDesvantagem("Procurado em cidades");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroDesvantagens().atualizar(rpg.getCadastroHerois().procurar(aragorn).getDesvantagens());
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		//Vamos adicionar Perícias à Aragorn//
		try {
			rpg.getCadastroHerois().procurar(aragorn).getPericias().adicionarPericia("Acampamento");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroHerois().procurar(aragorn).getPericias().adicionarPericia("Caça");
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
		try {
			rpg.getCadastroPericias().atualizar(rpg.getCadastroHerois().procurar(aragorn).getPericias());
		} catch (ObjetoNaoEncontrado e1) {
			e1.printStackTrace();
		}
				
		//Vamos ver as características do meu herói//
		try {
			Heroi caracHeroi = rpg.getCadastroHerois().procurar(aragorn);
			System.out.println("____________________________");
			System.out.println("Características de Aragorn: ");
			System.out.println("____________________________");
			System.out.println("Nome: " + caracHeroi.getNome());
			System.out.println("Força: " + caracHeroi.getForca());
			System.out.println("Habilidade: " + caracHeroi.getHabilidade());
			System.out.println("Resistencia: " + caracHeroi.getHabilidade());
			System.out.println("Armadura: " + caracHeroi.getArmadura());
			System.out.println("Poder de Fogo: " + caracHeroi.getPoderdeFogo());
			System.out.println("Ponto de Vida: " + caracHeroi.getPontodeVida());
			System.out.println("Ponto de Mana: " + caracHeroi.getPontoDeMana());
			System.out.println("Classe: " + caracHeroi.getClasse().getNome());
			
			System.out.print("Poderes da CLasse: ");
			for(int i = 0; i < caracHeroi.getClasse().getPoderes().getPosit();i++){
				if(i != caracHeroi.getClasse().getPoderes().getPosit()-1){
					System.out.print(caracHeroi.getClasse().getPoderes().getPoderes()[i]+", ");
				}else{
					System.out.println(caracHeroi.getClasse().getPoderes().getPoderes()[i]);
				}
			}
			System.out.println("Raça: " + caracHeroi.getRaca().getNome());
			System.out.print("Vantagens: ");
				for(int i = 0; i < caracHeroi.getVantagens().getPosit(); i++){
					if(i != caracHeroi.getVantagens().getPosit()-1){
						System.out.print(caracHeroi.getVantagens().getVantagens()[i]+", ");
					}else{
						System.out.println(caracHeroi.getVantagens().getVantagens()[i]);
					}
				}
			System.out.print("Desvantagens: ");
			for(int i = 0; i < caracHeroi.getDesvantagens().getPosit(); i++){
				if(i != caracHeroi.getDesvantagens().getPosit()-1){
					System.out.print(caracHeroi.getDesvantagens().getDesvantagens()[i]+", ");
				}else{
					System.out.println(caracHeroi.getDesvantagens().getDesvantagens()[i]);
				}
			}
			System.out.print("Pericias: ");
			for(int i = 0; i < caracHeroi.getPericias().getPosit(); i++){
				if(i != caracHeroi.getPericias().getPosit()-1){
					System.out.print(caracHeroi.getPericias().getDescricoesPericias()[i]+", ");
				}else{
					System.out.println(caracHeroi.getPericias().getDescricoesPericias()[i]);
				}
			}
			System.out.println("História: " + caracHeroi.getHistoria());
			System.out.println("Pontos: " + caracHeroi.getPontos());
			System.out.println("Pontos de Experiência: " + caracHeroi.getExperiencia());
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		//Vamos criar uma classe de Monstros//
		Classe chefe = new Classe(42,"Chefe",10);
		try {
			rpg.getCadastroClasses().cadastrar(chefe);
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		try {
			rpg.getCadastroPoderes().cadastrar(rpg.getCadastroClasses().procurar(chefe).getPoderes());
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		//Vamos criar uma nova raça//
		Raca espirito = new Raca(2,"Espírito Encarnado");
		try {
			rpg.getCadastroRacas().cadastrar(espirito);
		} catch (ObjetoJaExiste e1) {
			e1.printStackTrace();
		}
		//Vamos criar um monstrinho :3//
		Monstro sauron=null;
		try {
			sauron = new Monstro(1000,"Sauron",4,5,5,4,5,500,450,
					rpg.getCadastroClasses().procurar(chefe),rpg.getCadastroRacas().procurar(espirito),
					new Vantagens(1000,10),new Desvantagens(1000,10),new Pericias(1000,10));
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		try {
			rpg.getCadastroMonstros().cadastrar(sauron);
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		try {
			rpg.getCadastroPericias().cadastrar(rpg.getCadastroMonstros().procurar(sauron).getPericias());
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		try {
			rpg.getCadastroVantagens().cadastrar(rpg.getCadastroMonstros().procurar(sauron).getVantagens());
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		try {
			rpg.getCadastroDesvantagens().cadastrar(rpg.getCadastroMonstros().procurar(sauron).getDesvantagens());
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		//Vamos ver as características de Sauron//
		try {
			Monstro caracMonstro = rpg.getCadastroMonstros().procurar(sauron);
			System.out.println("____________________________");
			System.out.println("Características de Sauron: ");
			System.out.println("____________________________");
			System.out.println("Nome: " + caracMonstro.getNome());
			System.out.println("Força: " + caracMonstro.getForca());
			System.out.println("Habilidade: " + caracMonstro.getHabilidade());
			System.out.println("Resistencia: " + caracMonstro.getHabilidade());
			System.out.println("Armadura: " + caracMonstro.getArmadura());
			System.out.println("Poder de Fogo: " + caracMonstro.getPoderdeFogo());
			System.out.println("Ponto de Vida: " + caracMonstro.getPontodeVida());
			System.out.println("Ponto de Mana: " + caracMonstro.getPontodeMana());
			System.out.println("Classe: " + caracMonstro.getClasse().getNome());
			
			System.out.print("Poderes da CLasse: ");
			for(int i = 0; i < caracMonstro.getClasse().getPoderes().getPosit();i++){
				if(i != caracMonstro.getClasse().getPoderes().getPosit()-1){
					System.out.print(caracMonstro.getClasse().getPoderes().getPoderes()[i]+", ");
				}else{
					System.out.println(caracMonstro.getClasse().getPoderes().getPoderes()[i]);
				}
			}
			System.out.println();
			System.out.println("Raça: " + caracMonstro.getRaca().getNome());
			System.out.print("Vantagens: ");
				for(int i = 0; i < caracMonstro.getVantagens().getPosit(); i++){
					if(i != caracMonstro.getVantagens().getPosit()-1){
						System.out.print(caracMonstro.getVantagens().getVantagens()[i]+", ");
					}else{
						System.out.println(caracMonstro.getVantagens().getVantagens()[i]);
					}
				}
				System.out.println();
			System.out.print("Desvantagens: ");
			for(int i = 0; i < caracMonstro.getDesvantagens().getPosit(); i++){
				if(i != caracMonstro.getDesvantagens().getPosit()-1){
					System.out.print(caracMonstro.getDesvantagens().getDesvantagens()[i]+", ");
				}else{
					System.out.println(caracMonstro.getDesvantagens().getDesvantagens()[i]);
				}
			}
			System.out.println();
			System.out.print("Pericias: ");
			for(int i = 0; i < caracMonstro.getPericias().getPosit(); i++){
				if(i != caracMonstro.getPericias().getPosit()-1){
					System.out.print(caracMonstro.getPericias().getDescricoesPericias()[i]+", ");
				}else{
					System.out.println(caracMonstro.getPericias().getDescricoesPericias()[i]);
				}
			}
		} catch (ObjetoNaoEncontrado e) {
			e.printStackTrace();
		}
		System.out.println();
		//Vamos ver o nome de todas as classes disponíveis no sistema//
		System.out.println("___________________________________________");
		System.out.println("Classes do Sistema: ");
		for(int i = 0; i < rpg.getCadastroClasses().getRep().tamanho(); i++){
			if(i!= rpg.getCadastroClasses().getRep().tamanho()-1){
				System.out.print(rpg.getCadastroClasses().getRep().getClasse(i).getNome()+", ");
			}else{
				System.out.print(rpg.getCadastroClasses().getRep().getClasse(i).getNome());
				System.out.println();
			}
		}
		//Ah, é? vamos ver se eu adicionar mais uma...//
		Classe magosupremodasgalaxias = new Classe(1,"Mago supremo das Galáxias",10);
		/*
		 //TESTAR EXCESSÃO OBJETO JÁ EXISTE/
		try {
			rpg.getCadastroClasses().cadastrar(magosupremodasgalaxias);
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		*/
		//Opa, hehehe, ja tem uma classe com esse ID//
		magosupremodasgalaxias.setId(50);
		try {
			rpg.getCadastroClasses().cadastrar(magosupremodasgalaxias);
		} catch (ObjetoJaExiste e) {
			e.printStackTrace();
		}
		//Agora vamos ver se adicionou//
		System.out.println("___________________________________________");
		System.out.println("Classes do Sistema: ");
		for(int i = 0; i < rpg.getCadastroClasses().getRep().tamanho(); i++){
			if(i!= rpg.getCadastroClasses().getRep().tamanho()-1){
				System.out.print(rpg.getCadastroClasses().getRep().getClasse(i).getNome()+", ");
			}else{
				System.out.print(rpg.getCadastroClasses().getRep().getClasse(i).getNome());
				System.out.println();
			}
		}
		/*
		 //Para array//
		 	for(int i = 0; i < rpg.getCadastroClasses().getRep().tamanho(); i++){
			if(i!= rpg.getCadastroClasses().getRep().tamanho()-1){
				System.out.print(rpg.getCadastroClasses().getRep()[i]+", ");
			}else{
				System.out.print(rpg.getCadastroClasses().getRep()[i]);
				System.out.println();
			}
		}
		 */
		//Mas só tá testando classe nesse coisa...Quero ver os poderes já cadastrados//
		System.out.println("--------------------------------------------------------");
		System.out.println("___________________________________________");
		System.out.println("Poderes do Sistema: ");
		for(int i = 0; i < rpg.getCadastroPoderes().getRep().tamanho(); i++){
			System.out.println("Poderes da Classe de ID "+rpg.getCadastroPoderes().getRep().getPoder(i).getId()+": ");
			System.out.println("___________________________________");
			for(int j = 0; j < rpg.getCadastroPoderes().getRep().getPoder(i).getPosit();j++){
				if(j!=rpg.getCadastroPoderes().getRep().getPoder(i).getPosit()-1){
					System.out.print(rpg.getCadastroPoderes().getRep().getPoder(i).getPoderes()[j]+", ");
				}else{
					System.out.print(rpg.getCadastroPoderes().getRep().getPoder(i).getPoderes()[j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("_________________________________________________");
		}
		/*
		 //Para array//
		System.out.println("--------------------------------------------------------");
		System.out.println("___________________________________________");
		System.out.println("Poderes do Sistema: ");
		for(int i = 0; i < rpg.getCadastroPoderes().getRep().tamanho(); i++){
			System.out.println("Poderes da Classe de ID "+rpg.getCadastroPoderes().getRep()[i].getId()+": ");
			System.out.println("___________________________________");
			for(int j = 0; j < rpg.getCadastroPoderes().getRep()[i].getPosit();j++){
				if(j!=rpg.getCadastroPoderes().getRep()[i].getPosit()-1){
					System.out.print(rpg.getCadastroPoderes().getRep()[i].getPoderes().[j]+", ");
				}else{
					System.out.print(rpg.getCadastroPoderes().getRep()[i].getPoderes().[j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("_________________________________________________");
	*/
	}
	
	

}