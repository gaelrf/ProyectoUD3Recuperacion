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

    @ManyToMany
    private List<Paciente> pacientes;

}
