package com.tuempresa.empresa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

    @GetMapping("/intro")
    public String intro() {
        return "intro";  // vista con video
    }
        @GetMapping("/")
        public String inicio() {
            return "index"; // index.html
        }

        @GetMapping("/cooperativa.html")
        public String cooperativa() {
            return "cooperativa.html"; // cooperativa.html
        }

        @GetMapping("/mision.html")
        public String mision() {
            return "mision"; // mision.html
        }

        @GetMapping("/vision.html")
        public String vision() {
            return "vision"; // vision.html
        }

        @GetMapping("/funcionamiento.html")
        public String funcionamiento() {
            return "funcionamiento"; // funcionamiento.html
        }

        @GetMapping("/proyectos.html")
        public String proyectos() {
            return "proyectos"; // proyectos.html
        }

        @GetMapping("/transformacion.html")
        public String transformacion() {
            return "transformacion"; // transformacion.html
        }
    @GetMapping("/proyectos-sociales.html")
    public String proyectosSocial() {
        return "proyectos-sociales";
    }

    @GetMapping("/proyectos-ambientales.html")
    public String proyectosAmbiental() {
        return "proyectos-ambientales";
    }

    @GetMapping("/proyectos-culturales.html")
    public String proyectosCulturales() {
        return "proyectos-culturales";
    }

    @GetMapping("/proyectos-productos.html")
    public String productos() {
        return "proyectos-productos";
    }

}


