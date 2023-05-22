package controller;

import view.PacienteView;
import model.Paciente;
import model.PacienteDAO;

import java.util.List;

public class PacienteController {

    PacienteView pacienteView;
    PacienteDAO pacienteDAO;

    private String operacion;



    public PacienteController() {
        pacienteView = new PacienteView();
        pacienteDAO = new PacienteDAO();
    }

    public void insert() {

        Paciente paciente = pacienteView.datosInsert();

        if (paciente!=null){

            pacienteDAO.insert(paciente);

        }

    }

    public void search(){

        String nombre = pacienteView.nombrePaciente();

        List<Paciente> pacientes = pacienteDAO.buscar(nombre);

        pacienteView.mostrarPacientes(pacientes);

    }

    public void modificar(){

        String nombre = pacienteView.nombrePaciente();
        List<Paciente> pacientes = pacienteDAO.buscar(nombre);
        operacion ="modificar";
        Paciente paciente = pacienteView.seleccionar(pacientes, operacion);
        if (paciente != null){

            pacienteView.datosModificar(paciente);
            pacienteDAO.modificar(paciente);

        }


    }
    public void borrar(){

        String nombre = pacienteView.nombrePaciente();
        List<Paciente> pacientes = pacienteDAO.buscar(nombre);
        operacion ="borrar";
        Paciente paciente = pacienteView.seleccionar(pacientes, operacion);
        if (paciente != null){

            pacienteDAO.borrar(paciente);

        }


    }

}

