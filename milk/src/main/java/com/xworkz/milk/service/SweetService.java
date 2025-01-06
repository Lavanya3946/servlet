package com.xworkz.milk.service;

import com.xworkz.milk.dto.SweetFormDto;

import java.util.Collections;
import java.util.List;

public interface SweetService {

    boolean service(SweetFormDto dto);
    default List<SweetFormDto> getAll(){
        return Collections.emptyList();
    }
}
