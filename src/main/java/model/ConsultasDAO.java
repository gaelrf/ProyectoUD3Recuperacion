package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ConsultasDAO {

    EntityManagerFactory emf;
    EntityManager em;

    private void initHibernate() {

        emf = Persistence.createEntityManagerFactory("default");

    }

    public ConsultasDAO() {
        initHibernate();
    }

    public List<Paciente> pacientesMedico(Personal personal) {

        em = emf.createEntityManager();

        Query query = em.createQuery("select perosnal.pacientes from Personal perosnal where perosnal.id = :id");
        query.setParameter("id",personal.getId());

        List<Paciente> pacientes = (List<Paciente>) query.getResultList();

        em.close();

        return pacientes;

    }

    public List<Consulta> consultasPaciente(Paciente paciente) {

        em = emf.createEntityManager();

        Query query = em.createQuery("select medico.consulta from Paciente paciente join paciente.medicos medico where paciente.id = :id");
        query.setParameter("id",paciente.getId());

        List<Consulta> consultas = query.getResultList();

        em.close();

        return consultas;
    }

    public List<Consulta> consultasUso(String uso) {

        em = emf.createEntityManager();

        Query query = em.createQuery("select consulta from Consulta consulta where consulta.uso = :uso");
        query.setParameter("uso",uso);

        List<Consulta> consultas = query.getResultList();

        em.close();

        return consultas;


    }
}
