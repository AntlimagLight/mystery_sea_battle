package ru.misteriumfrpg.mystery_sea_battle.model;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class Game {

    private static final Map<Integer, String> LITERALS = new HashMap<>();
    static {
        LITERALS.put(1, "А");
        LITERALS.put(2, "Б");
        LITERALS.put(3, "В");
        LITERALS.put(4, "Г");
        LITERALS.put(5, "Д");
        LITERALS.put(6, "Е");
        LITERALS.put(7, "Ж");
        LITERALS.put(8, "З");
        LITERALS.put(9, "И");
        LITERALS.put(10, "К");
    }

    private Long id;
    private final Map<Long, Player> players;
    private List<Cell> cells;

    public Game(Long id, Map<Long, Player> players) {
        this.id = id;
        this.players = players;
        this.cells = generateEmpty10v10field();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return id.equals(game.id) && players.equals(game.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, players);
    }

    private List<Cell> generateEmpty10v10field(){
        var square = new ArrayList<Cell>();
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                square.add(new Cell(LITERALS.get(i), j));
            }
        }
        return square;
    }

}
