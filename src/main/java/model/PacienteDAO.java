package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class PacienteDAO {

    EntityManagerFactory emf;
    EntityManager em;

    private void initHibernate() {

        emf = Persistence.createEntityManagerFactory("default");

    }

    public PacienteDAO(){

        initHibernate();

    }


    public void insert(Paciente paciente) {

        System.out.println(paciente);

        em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(paciente);
        em.getTransaction().commit();
        em.close();

    }

    public List<Paciente> buscar(String name){

        em = emf.createEntityManager();

        Query query = em.createQuery("select paciente from Paciente paciente where paciente.nombre = :name");
        query.setParameter("name", name);

        List<Paciente> pacientes = query.getResultList();

        em.close();

        return pacientes;

    }

    public void modificar(Paciente paciente){

        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(paciente);
        em.getTransaction().commit();
        em.close();

    }

}
