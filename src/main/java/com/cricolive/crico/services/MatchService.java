package com.cricolive.crico.services;

import com.cricolive.crico.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get wc23 point table
    List<List<String>> getPointTable();
}
