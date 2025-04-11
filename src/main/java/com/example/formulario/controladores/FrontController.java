package com.example.formulario.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {

    // Muestra el formulario de inicio
    @GetMapping("/inicio")
    public String mostrarFormulario(Model model) {
        model.addAttribute("error", false);
        return "formulario";
    }

    // Redirige la pagina a inicio
    @GetMapping("/")
    public String redirigirARaiz() {
        return "redirect:/inicio";
    }

    //Procesa los datos del formulario
    @PostMapping("/inicio")
    public String procesarFormulario(@RequestParam String usuario,
                                     @RequestParam String password,
                                     Model model) {
        if ("admin".equals(usuario) && "1234".equals(password)) {
            model.addAttribute("usuario", usuario);
            return "index";
        } else {
            model.addAttribute("error", true);
            return "formulario";
        }
    }
}