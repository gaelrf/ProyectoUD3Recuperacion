package controller;

import view.MenuView;

public class MenuController {

    MenuView menuView;
    PacienteController pacienteController;
    ConsultaController consultaController;
    PersonalController personalController;

    public MenuController() {
        menuView = new MenuView();
        pacienteController = new PacienteController();
        consultaController = new ConsultaController();
        personalController = new PersonalController();
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

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

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

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

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
