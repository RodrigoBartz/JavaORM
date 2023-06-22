package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Tarefa;

public class BuscaTarefas {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		//JPQL: SQL universal de ORM para Java
		String sql = "select t from Tarefa as t where t.finalizacao =:paramFinalizacao";
		
		Query query = manager.createQuery(sql);
		
		query.setParameter("paramFinalizacao", false);
		
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();
		
		for (Tarefa tarefa : lista) {
			System.out.println(tarefa.getDescricao());
		}
		
	}
}
