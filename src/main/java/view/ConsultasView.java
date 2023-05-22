package view;

import model.Consulta;
import model.Paciente;

import java.util.List;

public class ConsultasView {


    public void pacientesMedico(List<Paciente> pacientes) {

        System.out.println(pacientes);

    }

    public void consultasPaciente(List<Consulta> consultas) {
        System.out.println(consultas);
    }

    public String usoConsulta() {

        String uso = Inputs.inputString("Tipo de consulta: ");
        return uso;

    }
}
