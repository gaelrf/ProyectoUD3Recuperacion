package controller;

import model.Consulta;
import model.ConsultaDAO;
import view.ConsultaView;

import java.util.List;

public class ConsultaController {

    ConsultaView consultaView;
    ConsultaDAO consultaDAO;

    private String operacion;



    public ConsultaController() {
        consultaView = new ConsultaView();
        consultaDAO = new ConsultaDAO();
    }

    public void insert() {

        Consulta consulta = consultaView.datosInsert();

        if (consulta!=null){

            consultaDAO.insert(consulta);

        }

    }

    public void search(){

        String nombre = consultaView.nombreConsulta();

        List<Consulta> consultas = consultaDAO.buscar(nombre);

        consultaView.mostrarConsultas(consultas);

    }

    public void modificar(){

        String nombre = consultaView.nombreConsulta();
        List<Consulta> consultas = consultaDAO.buscar(nombre);
        operacion ="modificar";
        Consulta consulta = consultaView.seleccionar(consultas, operacion);
        if (consulta != null){

            consultaView.datosModificar(consulta);
            consultaDAO.modificar(consulta);

        }


    }
    public void borrar(){

        String nombre = consultaView.nombreConsulta();
        List<Consulta> consultas = consultaDAO.buscar(nombre);
        operacion ="borrar";
        Consulta consulta = consultaView.seleccionar(consultas, operacion);
        if (consulta != null){

            consultaDAO.borrar(consulta);

        }


    }

}
