package ru.misteriumfrpg.mystery_sea_battle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.misteriumfrpg.mystery_sea_battle.RegistrationService;

@RequiredArgsConstructor
@RestController
public class TriggerController {

    private final RegistrationService registrationService;

    @GetMapping("/")
    public String start() {
        registrationService.startNewGame();
        return "Started!";
    }

}
