package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.service;

import cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.model.Especialidad;
import cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.respository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadImpService implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;
    @Override
    public List<Especialidad> getAllEspecialidad() {
         return especialidadRepository.findAll();
    }

    @Override
    public void saveEspecialidad(Especialidad especialidad) {
        this.especialidadRepository.save(especialidad);
    }
}
