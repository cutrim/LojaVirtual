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
		e1.setDescricao("Amapá");
		e1.setUf("AP");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Bahia");
		e1.setUf("BA");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Ceará");
		e1.setUf("CE");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Distrito Federal");
		e1.setUf("DF");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Espírito Santo");
		e1.setUf("ES");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Goiás");
		e1.setUf("GO");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Maranhão");
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
		e1.setDescricao("Pará");
		e1.setUf("PA");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Paraíba");
		e1.setUf("PB");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Pernambuco");
		e1.setUf("PE");		
		manager.persist(e1);
		
		e1 = new Estado();
		e1.setDescricao("Piauí");
		e1.setUf("PI");		
		manager.persist(e1);

		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Acauã");	    
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Agricolândia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Água Branca");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alagoinha do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alegrete do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alto Longá");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Altos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Alvorada do Gurguéia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Amarante");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Angical do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Anísio de Abreu");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Antônio Almeida");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Aroazes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Aroeiras do Itaim");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Arraial");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Assunção do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Avelino Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Baixa Grande do Ribeiro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barra d`Alcântara");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barreiras do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Barro Duro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Batalha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bela Vista do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Belém do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Beneditinos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bertolínia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Betânia do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Boa Hora");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bocaina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bom Jesus");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bom Princípio do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Bonfim do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Boqueirão do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Brasileira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Brejo do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Buriti dos Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Buriti dos Montes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cabeceiras do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cajazeiras do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cajueiro da Praia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caldeirão Grande do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campinas do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Alegre do Fidalgo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Grande do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Largo do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Campo Maior");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Canavieira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Canto do Buriti");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Capitão de Campos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Capitão Gervásio Oliveira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caracol");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caraúbas do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caridade do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Castelo do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Caxingó");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal de Telha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cocal dos Alves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Coivaras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Colônia do Gurguéia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Colônia do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Conceição do Canindé");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Coronel José Dias");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Corrente");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cristalândia do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Cristino Castro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curimatá");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Currais");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curral Novo do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Curralinhos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Demerval Lobão");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dirceu Arcoverde");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dom Expedito Lopes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Dom Inocêncio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Domingos Mourão");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Elesbão Veloso");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Eliseu Martins");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Esperantina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Fartura do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Flores do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Floresta do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Floriano");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francinópolis");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Ayres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Macedo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Francisco Santos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Fronteiras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Geminiano");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Gilbués");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Guadalupe");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Guaribas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Hugo Napoleão");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ilha Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Inhuma");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ipiranga do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Isaías Coelho");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Itainópolis");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Itaueira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jacobina do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jaicós");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jardim do Mulato");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jatobá do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jerumenha");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("João Costa");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Joaquim Pires");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Joca Marques");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("José de Freitas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Juazeiro do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Júlio Borges");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Jurema");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa Alegre");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa de São Francisco");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do Barro do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoa do Sítio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Lagoinha do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Landri Sales");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Luís Correia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Luzilândia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Madeiro");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Manoel Emídio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Marcolândia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Marcos Parente");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Massapê do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Matias Olímpio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Miguel Alves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Miguel Leão");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Milton Brandão");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monsenhor Gil");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monsenhor Hipólito");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Monte Alegre do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Morro Cabeça no Tempo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Morro do Chapéu do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Murici dos Portelas");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nazaré do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nazária");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nossa Senhora de Nazaré");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nossa Senhora dos Remédios");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Nova Santa Rita");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Novo Oriente do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Novo Santo Antônio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Oeiras");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Olho d`Água do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Padre Marcos");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paes Landim");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pajeú do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Palmeira do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Palmeirais");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Paquetá");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Parnaguá");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Parnaíba");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Passagem Franca do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Patos do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Pau d`Arco do Piauí");
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
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Porto Alegre do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Prata do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Queimada Nova");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Redenção do Gurguéia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Regeneração");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Riacho Frio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ribeira do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Ribeiro Gonçalves");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Rio Grande do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Cruz do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Cruz dos Milagres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Filomena");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Luz");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santa Rosa do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santana do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo Antônio de Lisboa");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo Antônio dos Milagres");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Santo Inácio do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Braz do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Félix do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Francisco de Assis do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Francisco do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Gonçalo do Gurguéia");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Gonçalo do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João da Canabrava");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João da Fronteira");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João da Serra");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João da Varjota");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João do Arraial");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São João do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São José do Divino");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São José do Peixe");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São José do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Julião");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Lourenço do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Luis do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Miguel da Baixa Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Miguel do Fidalgo");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Miguel do Tapuio");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Pedro do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("São Raimundo Nonato");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sebastião Barros");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sebastião Leal");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sigefredo Pacheco");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Simões");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Simplício Mendes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Socorro do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Sussuapara");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Tamboril do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Tanque do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Teresina");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("União");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Uruçuí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Valença do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Várzea Branca");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Várzea Grande");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Vera Mendes");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Vila Nova do Piauí");
		c1 = new Cidade();c1.setEstado(e1);c1.setDescricao("Wall Ferraz");
		
		e1 = new Estado();
		e1.setDescricao("Paraná");
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
		e1.setDescricao("Rondônia");
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
		e1.setDescricao("Sâo Paulo");
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
