package rojas.gabriel.projetojogos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rojas.gabriel.projetojogos.model.Games;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class GamesController {

    @GetMapping("/jogos")
    public Games jogo() {
        Games game = new Games();

        game.setName("Crash Bandicoot");
        game.setGenre("Aventura");
        game.setPlataform("PS1");
        game.setReleaseDate("1999");

        return game;
    }

    @GetMapping("/cadastro")
    public ArrayList<Games>jogos() {

        Games game1 = new Games();

        game1.setName("Crash Bandicoot");
        game1.setGenre("Aventura");
        game1.setPlataform("PS1");
        game1.setReleaseDate("1999");

        Games game2 = new Games();

        game2.setName("Resident Evil");
        game2.setGenre("Terror");
        game2.setPlataform("PS1");
        game2.setReleaseDate("1996");

        Games game3 = new Games();

        game3.setName("Call of Duty: Warzone");
        game3.setGenre("Ação, Battle Royale");
        game3.setPlataform("PS4, Xbox One, PC");
        game3.setReleaseDate("2020");

        ArrayList<Games> register = new ArrayList();

        register.add(game1);
        register.add(game2);
        register.add(game3);

        return register;

    }

}
