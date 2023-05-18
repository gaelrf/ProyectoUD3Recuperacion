package model;

import jakarta.persistence.*;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int numero;

    private String uso;

    @OneToOne(cascade = CascadeType.DETACH)
    private Personal medicoAsignado;

}
