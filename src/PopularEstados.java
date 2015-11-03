import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.taipanet.model.Cidade;
import br.com.taipanet.model.Estado;


public class PopularEstados {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaVirtual");
		EntityManager manager = factory.createEntityManager();
		
		Cidade c1 = new Cidade();
		
		Estado e1 = new Estado();
		e1.setDescricao("Acre");
		e1.setUf("AC");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Amazonas");
		e1.setUf("AM");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Alagoas");
		e1.setUf("AL");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Amap�");
		e1.setUf("AP");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Bahia");
		e1.setUf("BA");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Cear�");
		e1.setUf("CE");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Distrito Federal");
		e1.setUf("DF");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Esp�rito Santo");
		e1.setUf("ES");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Goi�s");
		e1.setUf("GO");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Maranh�o");
		e1.setUf("MA");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Minas Gerais");
		e1.setUf("MG");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Mato Grosso");
		e1.setUf("MT");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Mato Grosso do Sul");
		e1.setUf("MS");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Par�");
		e1.setUf("PA");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Para�ba");
		e1.setUf("PB");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Pernambuco");
		e1.setUf("PE");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Piau�");
		e1.setUf("PI");		
		manager.persist(e1);

		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Acau�");	    
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Agricol�ndia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("�gua Branca");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alagoinha do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alegrete do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alto Long�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Altos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alvorada do Gurgu�ia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Amarante");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Angical do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("An�sio de Abreu");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ant�nio Almeida");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Aroazes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Aroeiras do Itaim");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Arraial");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Assun��o do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Avelino Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Baixa Grande do Ribeiro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barra d`Alc�ntara");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barreiras do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barro Duro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Batalha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bela Vista do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bel�m do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Beneditinos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bertol�nia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bet�nia do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Boa Hora");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bocaina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bom Jesus");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bom Princ�pio do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bonfim do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Boqueir�o do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Brasileira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Brejo do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Buriti dos Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Buriti dos Montes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cabeceiras do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cajazeiras do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cajueiro da Praia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caldeir�o Grande do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campinas do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Alegre do Fidalgo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Grande do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Largo do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Maior");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Canavieira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Canto do Buriti");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Capit�o de Campos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Capit�o Gerv�sio Oliveira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caracol");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cara�bas do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caridade do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Castelo do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caxing�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal de Telha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal dos Alves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Coivaras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Col�nia do Gurgu�ia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Col�nia do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Concei��o do Canind�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Coronel Jos� Dias");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Corrente");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cristal�ndia do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cristino Castro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curimat�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Currais");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curral Novo do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curralinhos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Demerval Lob�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dirceu Arcoverde");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dom Expedito Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dom Inoc�ncio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Domingos Mour�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Elesb�o Veloso");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Eliseu Martins");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Esperantina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Fartura do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Flores do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Floresta do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Floriano");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francin�polis");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Ayres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Macedo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Santos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Fronteiras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Geminiano");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Gilbu�s");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Guadalupe");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Guaribas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Hugo Napole�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ilha Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Inhuma");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ipiranga do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Isa�as Coelho");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Itain�polis");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Itaueira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jacobina do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jaic�s");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jardim do Mulato");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jatob� do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jerumenha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jo�o Costa");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Joaquim Pires");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Joca Marques");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jos� de Freitas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Juazeiro do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("J�lio Borges");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jurema");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa Alegre");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa de S�o Francisco");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do Barro do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do S�tio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoinha do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Landri Sales");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lu�s Correia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Luzil�ndia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Madeiro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Manoel Em�dio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Marcol�ndia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Marcos Parente");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Massap� do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Matias Ol�mpio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Miguel Alves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Miguel Le�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Milton Brand�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monsenhor Gil");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monsenhor Hip�lito");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monte Alegre do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Morro Cabe�a no Tempo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Morro do Chap�u do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Murici dos Portelas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nazar� do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Naz�ria");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nossa Senhora de Nazar�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nossa Senhora dos Rem�dios");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nova Santa Rita");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Novo Oriente do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Novo Santo Ant�nio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Oeiras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Olho d`�gua do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Padre Marcos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paes Landim");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paje� do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Palmeira do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Palmeirais");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paquet�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Parnagu�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Parna�ba");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Passagem Franca do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Patos do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pau d`Arco do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paulistana");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pavussu");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pedro II");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pedro Laurentino");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Picos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pimenteiras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pio IX");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Piracuruca");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Piripiri");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Porto");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Porto Alegre do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Prata do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Queimada Nova");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Reden��o do Gurgu�ia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Regenera��o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Riacho Frio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ribeira do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ribeiro Gon�alves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Rio Grande do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Cruz do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Cruz dos Milagres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Filomena");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Luz");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Rosa do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santana do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo Ant�nio de Lisboa");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo Ant�nio dos Milagres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo In�cio do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Braz do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o F�lix do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Francisco de Assis do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Francisco do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Gon�alo do Gurgu�ia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Gon�alo do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o da Canabrava");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o da Fronteira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o da Serra");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o da Varjota");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o do Arraial");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jo�o do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jos� do Divino");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jos� do Peixe");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Jos� do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Juli�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Louren�o do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Luis do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Miguel da Baixa Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Miguel do Fidalgo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Miguel do Tapuio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Pedro do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("S�o Raimundo Nonato");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sebasti�o Barros");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sebasti�o Leal");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sigefredo Pacheco");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sim�es");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Simpl�cio Mendes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Socorro do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sussuapara");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Tamboril do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Tanque do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Teresina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Uni�o");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Uru�u�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Valen�a do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("V�rzea Branca");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("V�rzea Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Vera Mendes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Vila Nova do Piau�");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Wall Ferraz");
		
		e1 = new Estado();
		e1.setDescricao("Paran�");
		e1.setUf("PR");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Rio de Janeiro");
		e1.setUf("RJ");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Rio Grande do Norte");
		e1.setUf("RN");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Rio Grande do Sul");
		e1.setUf("RS");		
		manager.persist(e1);

		e1 = new Estado();
		e1.setDescricao("Rond�nia");
		e1.setUf("RO");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Roraima");
		e1.setUf("RR");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Santa Catarina");
		e1.setUf("SC");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Sergipe");
		e1.setUf("SE");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("S�o Paulo");
		e1.setUf("SP");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Tocantins");
		e1.setUf("TO");		
		manager.persist(e1);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
	}
}
