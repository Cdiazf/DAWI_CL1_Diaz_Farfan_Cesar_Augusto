package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Especialidad")
public class Especialidad {
    @Id
    private String IdEsp;
    private String NomEsp;
    private Double Costo;
}
