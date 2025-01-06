package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.CricketTournamentFormDto;
import com.xworkz.milk.dto.SweetFormDto;

import java.util.Collections;
import java.util.List;

public interface CricketRepo {
    void save(CricketTournamentFormDto dto);


    default List<CricketTournamentFormDto> getAll(){
        return Collections.emptyList();

    }
}
