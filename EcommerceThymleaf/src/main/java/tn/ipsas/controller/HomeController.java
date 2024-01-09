package tn.ipsas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // pour déclarer un contrôleur
public class HomeController {
    @RequestMapping(value = "/acceuil")
    public String acceuil(){
        return "Accuil";
    }
}
