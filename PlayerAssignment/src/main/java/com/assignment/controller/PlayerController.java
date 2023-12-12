package com.assignment.controller;

import com.assignment.model.PlayerDTO;
import com.assignment.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
@EnableCaching
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerDTO> getPlayers(){
        return playerService.getPlayers();
    }

    @GetMapping("/{playerId}")
    @Cacheable(key = "#playerId", value = "Player")
    public PlayerDTO getPlayer(@PathVariable String playerId){
        return playerService.getPlayer(playerId);
    }
}
