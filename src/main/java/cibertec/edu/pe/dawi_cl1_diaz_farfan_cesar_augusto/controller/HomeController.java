package cibertec.edu.pe.dawi_cl1_diaz_farfan_cesar_augusto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }

}
