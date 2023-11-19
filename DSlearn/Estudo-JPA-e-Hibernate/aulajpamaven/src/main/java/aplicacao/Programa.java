package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/* Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Pedro Henrique", "pedro@gmail.com");
		Pessoa p3 = new Pessoa(null, "Giovanna Senna", "giovanna@gmail.com"); 
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); - Operação para a criação e inserção de dados no MySQL*/
		
		/* Pessoa p = em.find(Pessoa.class, 2); - Operação para buscar dados 
		 * 
		 * Objeto monitorado = Objeto que acabou de inserir um objeto que voce buscou do BD e ainda nao fechou o E.M.   */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
