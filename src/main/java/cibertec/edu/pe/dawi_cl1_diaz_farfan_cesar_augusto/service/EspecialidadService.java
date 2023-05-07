package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.service;

import cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.model.Especialidad;

import java.util.List;

public interface EspecialidadService {
    List<Especialidad> getAllEspecialidad();
    void saveEspecialidad(Especialidad especialidad);
}
