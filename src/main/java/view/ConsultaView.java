package view;

import model.Consulta;

import java.util.List;

public class ConsultaView {
    public Consulta datosInsert() {

        Consulta consulta = new Consulta();

        int numero = Inputs.inputInt("Introduzca numero de la consulta: ");
        consulta.setNumero(numero);
        String uso = Inputs.inputString("Introduzca uso de la consulta: ");
        consulta.setUso(uso);

        System.out.println(consulta);
        char confirmar = Inputs.inputChar("Es este el consulta a insertar?(S/N) ");

        if (confirmar != 'S' && confirmar != 's'){

            consulta=null;

        }

        return consulta;

    }


    public String nombreConsulta() {

        String nombre = Inputs.inputString("Introduzca el nombre del consulta a buscar: ");

        return nombre;
    }

    public void mostrarConsultas(List<Consulta> consultas) {

        for (Consulta p : consultas){

            System.out.println(p);

        }

    }

    public Consulta seleccionar(List<Consulta> consultas, String operacion) {

        char confirmar = 'N';
        Consulta consulta = null;
        int aux = 0;
        while (consultas.size()>aux && (confirmar != 'S' || confirmar != 's')){

            System.out.println(consultas.get(aux));
            confirmar = Inputs.inputChar("Es este el consulta que deseas " + operacion + "? (S/N) ");

            if (confirmar == 'S' || confirmar == 's'){

                consulta = consultas.get(aux);

            }

            aux++;

        }

        return consulta;

    }

    public void datosModificar(Consulta consulta) {

        System.out.println("El numero actual del consulta es: "+consulta.getNumero());
        int numero = Inputs.inputInt("Introduzca el nuevo numero de la consulta: ");
        consulta.setNumero(numero);
        System.out.println("El uso actuales del consulta es: "+consulta.getUso());
        String apellido = Inputs.inputString("Introduzca el nuevo uso de la consulta: ");
        consulta.setUso(apellido);

    }

}
