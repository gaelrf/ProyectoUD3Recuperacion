package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellidos;

    private String responsabilidades;

    @OneToOne(mappedBy = "medicoAsignado" , cascade = CascadeType.DETACH)
    private Consulta consulta;

    @ManyToMany(mappedBy = "medicos")
    private List<Paciente> pacientes;

}
