import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.taipanet.model.Endereco;
import br.com.taipanet.model.SexoEnum;
import br.com.taipanet.model.Status;
import br.com.taipanet.model.Usuario;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaVirtual");
		EntityManager manager = factory.createEntityManager();
		
		/*Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Riachuelo");
		
		Usuario usuario = new Usuario();
		usuario.setCpfCnpj("005.996.373-58");
		usuario.setLogin("admin");
		usuario.setSenha("alvarocj");
		usuario.setNomeRazao("Alvaro Cutrim");
		usuario.setSexo(SexoEnum.M);
		usuario.setStatus(Status.A);
		usuario.setDataCadastro(Calendar.getInstance());
		usuario.setDataUltimaAlteracao(Calendar.getInstance());
		usuario.setEndereco(endereco);
		
		try{
		manager.persist(usuario);
		} catch (Exception e){
			System.out.println("Não pode gravar: " + e.getMessage());
		}
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();*/
		
		System.out.println(new Usuario().criarHash("adminalvarocj"));
		
		factory.close();
	}
}
