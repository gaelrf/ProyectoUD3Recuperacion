package model;

import jakarta.persistence.*;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int numero;

    private String uso;

    @ManyToOne
    private Personal medicoAsignado;

}
