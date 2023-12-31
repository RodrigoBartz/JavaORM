package orm.actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class AtualizarTarefa {

	public static void main(String[] args) {
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(3L);
		tarefa.setDescricao("Estudar muuuuuito Python");
		tarefa.setFinalizacao(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa atualizada, ID: " +tarefa.getId());
		
		manager.close();
	}
}
