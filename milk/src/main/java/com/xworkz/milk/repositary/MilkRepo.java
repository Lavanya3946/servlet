package com.xworkz.milk.repositary;

import com.xworkz.milk.dto.MilkFormDto;


import java.util.Collections;
import java.util.List;

public interface MilkRepo {
    void save(MilkFormDto milkFormDto);


   default List<MilkFormDto> getAll(){
      return Collections.emptyList();

   }

}
