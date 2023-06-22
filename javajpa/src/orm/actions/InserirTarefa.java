package orm.actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class InserirTarefa {
	
	public static void main(String[] args) {
		Tarefa tarefa1 = new Tarefa();
		tarefa1.setDescricao("Estudar IA");
		tarefa1.setFinalizacao(false);
		tarefa1.setDataFinalizacao(Calendar.getInstance());
		
		//factory para ddl
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
		//para operar na base: manager
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa1);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa inserida. ID:" +tarefa1.getId());
		
		manager.close();
	}
}


//terminar codigo