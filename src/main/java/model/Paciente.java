package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    private String nombre;

    private String apellidos;

    @Column(unique = true)
    private String nuss;

    @ManyToMany
    @JoinTable(name= "paciente_medico",
            joinColumns = @JoinColumn(name="id_paciente"),
            inverseJoinColumns = @JoinColumn(name = "id_medico"))
    private List<Personal> medicos;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNuss() {
        return nuss;
    }

    public void setNuss(String nuss) {
        this.nuss = nuss;
    }

    public List<Personal> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Personal> medicos) {
        this.medicos = medicos;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nuss='" + nuss + '\'' +
                '}';
    }

}
