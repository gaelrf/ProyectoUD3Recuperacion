package controller;

import view.MenuView;

public class MenuController {

    MenuView menuView;
    PacienteController pacienteController;
    ConsultaController consultaController;
    PersonalController personalController;
    ConsultasController consultasController;
    CitaController citaController;

    public MenuController() {
        menuView = new MenuView();
        pacienteController = new PacienteController();
        consultaController = new ConsultaController();
        personalController = new PersonalController();
        consultasController = new ConsultasController();
        citaController = new CitaController();
    }

    public void mainMenu(){



        int op;

        do {

            op = menuView.mainMenu();

            switch (op){

                case 1:

                    pacienteMenu();
                    break;

                case 2:

                    consultaMenu();
                    break;

                case 3:

                    personalMenu();
                    break;

                case 4:

                    citaMenu();
                    break;

                case -1:

                    consultasMenu();
                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op != 0);

    }


    private void pacienteMenu() {

        int op;

        do {

            op = menuView.operationMenu();

            switch (op){

                case 1:

                    pacienteController.insert();
                    break;

                case 2:

                    pacienteController.search();
                    break;

                case 3:

                    pacienteController.modificar();
                    break;

                case 4:

                    pacienteController.borrar();
                    break;

                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op!=0);

    }

    private void consultaMenu() {

        int op;

        do {

            op = menuView.operationMenu();

            switch (op){

                case 1:

                    consultaController.insert();
                    break;

                case 2:

                    consultaController.search();
                    break;

                case 3:

                    consultaController.modificar();
                    break;

                case 4:

                    consultaController.borrar();
                    break;

                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op!=0);

    }

    private void personalMenu() {

        int op;

        do {

            op = menuView.operationMenu();

            switch (op){

                case 1:

                    personalController.insert();
                    break;

                case 2:

                    personalController.search();
                    break;

                case 3:

                    personalController.modificar();
                    break;

                case 4:

                    personalController.borrar();
                    break;

                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op!=0);

    }
    private void citaMenu() {

        int op;

        do {

            op = menuView.operationMenu();

            switch (op){

                case 1:

                    citaController.insert();
                    break;

                case 2:

                    citaController.search();
                    break;

                case 3:

                    citaController.modificar();
                    break;

                case 4:

                    citaController.borrar();
                    break;

                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op!=0);

    }

    private void consultasMenu() {

        int op;

        do {

            op = menuView.consultasMenu();

            switch (op){

                case 1:

                    consultasController.pacientesMedico();
                    break;

                case 2:

                    consultasController.consultasUso();
                    break;

                case 3:

                    consultasController.consultasPaciente();
                    break;

                case 0:

                    break;

                default:

                    //todo Control de errores de entrada
                    break;

            }

        } while (op!=0);


    }

}
