package view;

public class MenuView {
    public int mainMenu() {

        int op;

        System.out.println("1. Paciente: ");
        System.out.println("2. Consulta: ");
        System.out.println("3. Personal: ");
        System.out.println("-1. Consultas parametrizadas: ");
        System.out.println("0. Salir: ");
        op = Inputs.inputInt("Seleccione entidad a usar: ");

        return op;

    }

    public int operationMenu() {

        int op;

        System.out.println("1. Crear: ");
        System.out.println("2. Buscar: ");
        System.out.println("3. Modificar: ");
        System.out.println("4. Borrar: ");
        System.out.println("0. Salir: ");
        op = Inputs.inputInt("Seleccione operación a realizar: ");

        return op;

    }

    public int consultasMenu() {

        int op;

        System.out.println("1. Lista de Pacientes de un médico: ");
        System.out.println("2. Consultas por uso: ");
        System.out.println("3. Consultas de un Paciente: ");
        System.out.println("0. Salir: ");
        op = Inputs.inputInt("Seleccione consulta a realizar: ");

        return op;
    }

}
