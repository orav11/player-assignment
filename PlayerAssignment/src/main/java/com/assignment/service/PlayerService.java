package com.assignment.service;

import com.assignment.model.Player;
import com.assignment.model.PlayerDTO;
import com.assignment.repository.PlayerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final ModelMapper modelMapper;
    private Logger logger = LoggerFactory.getLogger(PlayerService.class);

    @Autowired
    public PlayerService(PlayerRepository playerRepository, ModelMapper modelMapper) {
        this.playerRepository = playerRepository;
        this.modelMapper = modelMapper;
    }

    public List<PlayerDTO> getPlayers() {
        return playerRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    private PlayerDTO convertToDto(Player player) {
        return modelMapper.map(player, PlayerDTO.class);
    }

    public PlayerDTO getPlayer(String playerId) {
        logger.info("Fetching player {}", playerId);
        return playerRepository.findById(playerId).map(this::convertToDto)
                .orElseThrow(() -> new EntityNotFoundException("Could not find a player with id " + playerId));
    }
}
