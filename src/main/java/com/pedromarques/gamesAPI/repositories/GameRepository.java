package com.pedromarques.gamesAPI.repositories;

import com.pedromarques.gamesAPI.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
