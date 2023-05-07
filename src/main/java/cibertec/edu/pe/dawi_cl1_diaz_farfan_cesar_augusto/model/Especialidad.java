package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    private String idesp;
    private String nomesp;
    private Double costo;
}
