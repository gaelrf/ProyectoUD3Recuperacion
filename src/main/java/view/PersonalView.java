package view;

import model.Personal;

import java.util.List;

public class PersonalView {
    public Personal datosInsert() {

        Personal personal = new Personal();

        String nombre = Inputs.inputString("Introduzca nombre del personal: ");
        personal.setNombre(nombre);
        String apellidos = Inputs.inputString("Introduzca apellidos del personal: ");
        personal.setApellidos(apellidos);
        String nuss = Inputs.inputString("Introduzca la responsabilidad del personal: ");
        personal.setResponsabilidades(nuss);

        System.out.println(personal);
        char confirmar = Inputs.inputChar("Es este el personal a insertar?(S/N) ");

        if (confirmar != 'S' && confirmar != 's'){

            personal=null;

        }

        return personal;

    }


    public String nombrePersonal() {

        String nombre = Inputs.inputString("Introduzca el nombre del personal a buscar: ");

        return nombre;
    }

    public void mostrarPersonals(List<Personal> personals) {

        for (Personal p : personals){

            System.out.println(p);

        }

    }

    public Personal seleccionar(List<Personal> personals, String operacion) {

        char confirmar = 'N';
        Personal personal = null;
        int aux = 0;
        while (personals.size()>aux && (confirmar != 'S' && confirmar != 's')){

            System.out.println(personals.get(aux));
            confirmar = Inputs.inputChar("Es este el personal que deseas " + operacion + "? (S/N) ");

            if (confirmar == 'S' || confirmar == 's'){

                personal = personals.get(aux);

            }

            aux++;

        }

        return personal;

    }

    public void datosModificar(Personal personal) {

        System.out.println("El nombre actual del personal es: "+personal.getNombre());
        String nombre = Inputs.inputString("Introduzca el nuevo nombre del personal: ");
        personal.setNombre(nombre);
        System.out.println("Los apellidos actuales del personal son: "+personal.getApellidos());
        String apellido = Inputs.inputString("Introduzca los nuevos apellidos del personal: ");
        personal.setApellidos(apellido);
        System.out.println("El NUSS actual del personal es: "+personal.getResponsabilidades());
        String nuss = Inputs.inputString("Introduzca la nueva responsabilidad del personal: ");
        personal.setResponsabilidades(nuss);

    }

}
