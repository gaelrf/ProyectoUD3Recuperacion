package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class PersonalDAO {

    EntityManagerFactory emf;
    EntityManager em;

    private void initHibernate() {

        emf = Persistence.createEntityManagerFactory("default");

    }

    public PersonalDAO(){

        initHibernate();

    }


    public void insert(Personal personal) {
        em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(personal);
        em.getTransaction().commit();
        em.close();
    }

    public List<Personal> buscar(String name){

        em = emf.createEntityManager();

        Query query = em.createQuery("select personal from Personal personal where personal.nombre = :name");
        query.setParameter("name", name);

        List<Personal> personals = query.getResultList();

        em.close();

        return personals;

    }

    public void modificar(Personal personal){

        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(personal);
        em.getTransaction().commit();
        em.close();

    }

    public void borrar(Personal personal) {

        em = emf.createEntityManager();
        em.getTransaction().begin();
        personal = em.merge(personal);
        em.remove(personal);
        em.getTransaction().commit();
        em.close();

    }
}
