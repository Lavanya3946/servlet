package com.xworkz.milk.service;

import com.xworkz.milk.dto.MilkFormDto;

import java.util.Collections;
import java.util.List;

public interface MilkService {

    boolean service(MilkFormDto dto);

   default List<MilkFormDto> getAll(){
       return Collections.emptyList();
   }
}
