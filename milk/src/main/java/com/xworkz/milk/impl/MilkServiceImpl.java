package com.xworkz.milk.impl;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.repositary.MilkRepo;
import com.xworkz.milk.repositary.MilkRepoImpl;
import com.xworkz.milk.service.MilkService;

public class MilkServiceImpl implements MilkService {

     private  MilkRepo milkRepo=new MilkRepoImpl();
    @Override
    public boolean service(MilkFormDto dto) {
        System.out.println("saved");
        milkRepo.save(dto);
        return true;
    }


}
