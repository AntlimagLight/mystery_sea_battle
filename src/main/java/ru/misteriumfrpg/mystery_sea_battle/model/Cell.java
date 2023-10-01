package ru.misteriumfrpg.mystery_sea_battle.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Cell {

    private final Coordinates coordinates;

    private List<Player> players;
    private Bonus bonus;

}
