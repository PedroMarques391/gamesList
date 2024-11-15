package com.pedromarques.gamesAPI.services;

import com.pedromarques.gamesAPI.dto.GameMinDTO;
import com.pedromarques.gamesAPI.entities.Game;
import com.pedromarques.gamesAPI.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
