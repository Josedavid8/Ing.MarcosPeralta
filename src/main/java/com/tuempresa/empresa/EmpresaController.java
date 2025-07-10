package com.tuempresa.empresa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}
