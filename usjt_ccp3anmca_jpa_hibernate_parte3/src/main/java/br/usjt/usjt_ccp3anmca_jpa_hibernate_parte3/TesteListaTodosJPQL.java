package br.usjt.usjt_ccp3anmca_jpa_hibernate_parte3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> veiculos = query.getResultList();
		for (Veiculo v : veiculos) {
			System.out.println(v);
		}
		manager.close();
		JPAUtil.close();
	}

}
