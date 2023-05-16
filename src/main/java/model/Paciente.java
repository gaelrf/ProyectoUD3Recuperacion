package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellidos;

    private String nuss;

    @ManyToMany
    private List<Personal> medicos;

}
