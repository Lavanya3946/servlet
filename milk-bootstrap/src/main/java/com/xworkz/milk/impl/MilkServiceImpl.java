package com.xworkz.milk.impl;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.service.MilkService;

public class MilkServiceImpl implements MilkService {
    @Override
    public boolean service(MilkFormDto dto) {
        System.out.println("saved");
        return true;
    }


}
