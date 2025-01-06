package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MuseumTicketFormDto;

import java.util.Collections;
import java.util.List;

public interface MuseumRepo {
    void save(MuseumTicketFormDto dto);

    default List<MuseumTicketFormDto> getAll(){
        return Collections.emptyList();

    }
}
