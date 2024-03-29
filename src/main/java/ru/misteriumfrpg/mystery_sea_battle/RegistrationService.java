package ru.misteriumfrpg.mystery_sea_battle;

import org.springframework.stereotype.Service;
import ru.misteriumfrpg.mystery_sea_battle.model.Cell;
import ru.misteriumfrpg.mystery_sea_battle.model.Coordinates;
import ru.misteriumfrpg.mystery_sea_battle.model.Game;

import java.util.HashMap;
import java.util.Map;

@Service

public class RegistrationService {

    private final Map<Long, Game> games;

    public RegistrationService() {
        this.games = new HashMap<>();
    }

    public void startNewGame() {
        var game = new Game(1L, new HashMap<>());

        for (Cell s : game.getCells().values()) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println(game.getCells().get(new Coordinates("А", 5)));
        System.out.println(game.getCells().get(new Coordinates("Д", 7)));

        games.put(game.getId(), game);

    }

    public void endGame(Long id) {

    }


}
