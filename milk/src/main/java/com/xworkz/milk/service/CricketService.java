package com.xworkz.milk.service;

import com.xworkz.milk.dto.CricketTournamentFormDto;

import java.util.Collections;
import java.util.List;

public interface CricketService {
    boolean service(CricketTournamentFormDto dto);
    default List<CricketTournamentFormDto> getAll(){
        return Collections.emptyList();
    }
}
