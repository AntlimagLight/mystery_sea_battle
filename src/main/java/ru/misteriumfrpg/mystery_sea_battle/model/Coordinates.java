package ru.misteriumfrpg.mystery_sea_battle.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Coordinates {

    private final String vertical;
    private final Integer horizontal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates)) return false;
        Coordinates that = (Coordinates) o;
        return vertical.equals(that.vertical) && horizontal.equals(that.horizontal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertical, horizontal);
    }
}
