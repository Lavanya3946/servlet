package com.xworkz.milk.service;

import com.xworkz.milk.dto.MuseumTicketFormDto;

import java.util.Collections;
import java.util.List;

public interface  MuseumService {
    boolean service(MuseumTicketFormDto dto);
    default List<MuseumTicketFormDto> getAll(){
        return Collections.emptyList();
    }
}
