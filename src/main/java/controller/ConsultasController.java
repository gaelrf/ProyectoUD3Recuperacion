package controller;

import model.*;
import view.ConsultasView;
import view.PacienteView;
import view.PersonalView;

import java.util.List;

public class ConsultasController {

    ConsultasView consultasView;
    ConsultasDAO consultasDAO;

    public ConsultasController() {
        consultasView = new ConsultasView();
        consultasDAO = new ConsultasDAO();
    }

    public void pacientesMedico(){

        PersonalDAO personalDAO = new PersonalDAO();
        PersonalView personalView = new PersonalView();

        String nombre = personalView.nombrePersonal();
        List<Personal> personals = personalDAO.buscar(nombre);
        String operacion ="consultar";
        Personal personal = personalView.seleccionar(personals, operacion);
        if (personal != null){

            List<Paciente> pacientes = consultasDAO.pacientesMedico(personal);
            consultasView.pacientesMedico(pacientes);

        }


    }

    public void consultasUso(){

        String uso = consultasView.usoConsulta();

        List <Consulta> consultas = consultasDAO.consultasUso(uso);
        consultasView.consultasPaciente(consultas);

    }

    public void consultasPaciente(){

        PacienteDAO pacienteDAO = new PacienteDAO();
        PacienteView pacienteView = new PacienteView();

        String nombre = pacienteView.nombrePaciente();
        List<Paciente> pacientes = pacienteDAO.buscar(nombre);
        String operacion ="consultar";
        Paciente paciente = pacienteView.seleccionar(pacientes, operacion);
        if (paciente != null){

            List<Consulta> consultas = consultasDAO.consultasPaciente(paciente);
            consultasView.consultasPaciente(consultas);

        }

    }

}
