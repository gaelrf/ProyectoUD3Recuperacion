package controller;

import model.Personal;
import model.PersonalDAO;
import view.PersonalView;

import java.util.List;

public class PersonalController {

    PersonalView personalView;
    PersonalDAO personalDAO;

    private String operacion;



    public PersonalController() {
        personalView = new PersonalView();
        personalDAO = new PersonalDAO();
    }

    public void insert() {

        Personal personal = personalView.datosInsert();

        if (personal!=null){

            personalDAO.insert(personal);

        }

    }

    public void search(){

        String nombre = personalView.nombrePersonal();

        List<Personal> personals = personalDAO.buscar(nombre);

        personalView.mostrarPersonals(personals);

    }

    public void modificar(){

        String nombre = personalView.nombrePersonal();
        List<Personal> personals = personalDAO.buscar(nombre);
        operacion ="modificar";
        Personal personal = personalView.seleccionar(personals, operacion);
        if (personal != null){

            personalView.datosModificar(personal);
            personalDAO.modificar(personal);

        }


    }
    public void borrar(){

        String nombre = personalView.nombrePersonal();
        List<Personal> personals = personalDAO.buscar(nombre);
        operacion ="borrar";
        Personal personal = personalView.seleccionar(personals, operacion);
        if (personal != null){

            personalDAO.borrar(personal);

        }


    }

}
