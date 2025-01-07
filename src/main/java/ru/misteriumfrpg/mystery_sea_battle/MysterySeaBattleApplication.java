package ru.misteriumfrpg.mystery_sea_battle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MysterySeaBattleApplication {

    public static void main(String[] args) {
        log.debug("Начинается старт приложения");
        SpringApplication.run(MysterySeaBattleApplication.class, args);
    }

}
