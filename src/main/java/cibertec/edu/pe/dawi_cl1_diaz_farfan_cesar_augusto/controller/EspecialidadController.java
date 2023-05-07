package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.controller;

import cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.model.Especialidad;
import cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("/frmMantEspecialidad")
    public String frmMantEspecialidad(Model model) {
        model.addAttribute("listaEspecialidad",
                especialidadService.getAllEspecialidad());
        return "Especialidad/frmMantEspecialidad";
    }

    @GetMapping("/frmRegEspecialidad")
    public String frmRegEspecialidad(Model model)
    {
        Especialidad especialidadForm= new Especialidad();
        model.addAttribute("especialidadForm",especialidadForm);
        return "Especialidad/frmRegEspecialidad";
    }

    @PostMapping("frmRegEspecialidad")
    public String registrarEspecialidad(@ModelAttribute("especialidadForm") Especialidad especialidad){
        especialidadService.saveEspecialidad(especialidad);
        return "redirect:/Especialidad/frmMantEspecialidad";
    }

}
