package view;

public class MenuView {
    public int mainMenu() {

        int op;

        System.out.println("1. Paciente: ");
        System.out.println("2. Consulta: ");
        System.out.println("3. Personal: ");
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

}
