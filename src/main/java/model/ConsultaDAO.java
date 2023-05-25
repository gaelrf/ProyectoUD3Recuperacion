package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ConsultaDAO{

    EntityManagerFactory emf;
    EntityManager em;

    private void initHibernate() {

        emf = Persistence.createEntityManagerFactory("default");

    }

    public ConsultaDAO(){

        initHibernate();

    }


    public void insert(Consulta consulta) {
        em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(consulta);
        em.getTransaction().commit();
        em.close();
    }

    public List<Consulta> buscar(String name){

        em = emf.createEntityManager();

        Query query = em.createQuery("select consulta from Consulta consulta where consulta.numero = :name");
        query.setParameter("name", name);

        List<Consulta> consultas = query.getResultList();

        em.close();

        return consultas;

    }

    public void modificar(Consulta consulta){

        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(consulta);
        em.getTransaction().commit();
        em.close();

    }

    public void borrar(Consulta consulta) {

        em = emf.createEntityManager();
        em.getTransaction().begin();
        consulta = em.merge(consulta);
        em.remove(consulta);
        em.getTransaction().commit();
        em.close();

    }
}
