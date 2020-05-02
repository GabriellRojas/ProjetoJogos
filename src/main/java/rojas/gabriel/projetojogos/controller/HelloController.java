package rojas.gabriel.projetojogos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Bem-vindos ao sistema de JOGOS!";
    }

}
