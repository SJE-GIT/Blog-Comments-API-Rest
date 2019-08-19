package com.example.blogs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author lenovo
 *
 */

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Bienvenu dans l'API Rest de gestion des commentaires de blogs. Vous pouvez lister tous les commentaires, créer, modifier ou supprimer un commentaire pour un blog précis.";
    }
}
