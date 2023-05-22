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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Personal getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Personal medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "numero=" + numero +
                ", uso='" + uso + '\'' +
                ", medicoAsignado=" + medicoAsignado +
                '}';
    }
}
