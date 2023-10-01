package ru.misteriumfrpg.mystery_sea_battle.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {

    private Long uuid;
    private String username;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return uuid.equals(player.uuid) && username.equals(player.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, username);

    }


}
