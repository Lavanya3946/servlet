package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.dto.SweetFormDto;

import java.util.Collections;
import java.util.List;

public interface SweetRepo {
    void save(SweetFormDto sweetFormDto);

    default List<SweetFormDto> getAll(){
        return Collections.emptyList();

    }
}
