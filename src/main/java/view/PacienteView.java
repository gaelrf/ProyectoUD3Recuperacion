package view;

import model.Paciente;

import java.util.List;

public class PacienteView {
    public Paciente datosInsert() {

        Paciente paciente = new Paciente();

        String nombre = Inputs.inputString("Introduzca nombre del paciente: ");
        paciente.setNombre(nombre);
        String apellidos = Inputs.inputString("Introduzca apellidos del paciente: ");
        paciente.setApellidos(apellidos);
        String nuss = Inputs.inputString("Introduzca NUSS del paciente: ");
        paciente.setNuss(nuss);

        System.out.println(paciente);
        char confirmar = Inputs.inputChar("Es este el paciente a insertar?(S/N) ");

        if (confirmar != 'S' && confirmar != 's'){

            paciente=null;

        }

        return paciente;

    }


    public String nombrePaciente() {

        String nombre = Inputs.inputString("Introduzca el nombre del paciente a buscar: ");

        return nombre;
    }

    public void mostrarPacientes(List<Paciente> pacientes) {

        for (Paciente p : pacientes){

            System.out.println(p);

        }

    }

    public Paciente seleccionar(List<Paciente> pacientes, String operacion) {

        char confirmar = 'N';
        Paciente paciente = null;
        int aux = 0;
        while (pacientes.size()>aux && (confirmar != 'S' || confirmar != 's')){

            System.out.println(pacientes.get(aux));
            confirmar = Inputs.inputChar("Es este el paciente que deseas " + operacion + "? (S/N) ");

            if (confirmar == 'S' || confirmar == 's'){

                paciente = pacientes.get(aux);

            }

            aux++;

        }

        return paciente;

    }

    public void datosModificar(Paciente paciente) {

        System.out.println("El nombre actual del paciente es: "+paciente.getNombre());
        String nombre = Inputs.inputString("Introduzca el nuevo nombre del paciente: ");
        paciente.setNombre(nombre);
        System.out.println("Los apellidos actuales del paciente son: "+paciente.getApellidos());
        String apellido = Inputs.inputString("Introduzca los nuevos apellidos del paciente: ");
        paciente.setApellidos(apellido);
        System.out.println("El NUSS actual del paciente es: "+paciente.getNuss());
        String nuss = Inputs.inputString("Introduzca el nuevo NUSS del paciente: ");
        paciente.setNuss(nuss);

    }

}
