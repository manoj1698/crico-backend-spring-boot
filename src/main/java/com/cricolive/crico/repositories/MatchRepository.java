package com.cricolive.crico.repositories;

import com.cricolive.crico.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match,Integer> {
    //custom finder method
    Optional<Match> findByTeamHeading (String teamHeading);
}
