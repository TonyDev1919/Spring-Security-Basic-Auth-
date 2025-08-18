package pe.edu.idat.Spring.Security.Basic.Auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping("/public")
    public String apiPublic(){
        return "Esta es la API publica del proyecto";
    }

    @GetMapping("/private")
    public String apiPrivate(){
        return "Esta es la API privada del proyecto";
    }
}
