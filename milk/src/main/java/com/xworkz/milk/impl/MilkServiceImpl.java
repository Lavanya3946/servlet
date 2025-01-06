package com.xworkz.milk.impl;

import com.xworkz.milk.dto.MilkFormDto;
import com.xworkz.milk.repositary.MilkRepo;
import com.xworkz.milk.repositary.MilkRepoImpl;
import com.xworkz.milk.service.MilkService;

import java.util.List;

public class MilkServiceImpl implements MilkService {
    private MilkRepo milkRepo = new MilkRepoImpl();


    @Override
    public boolean service(MilkFormDto dto) {
        System.out.println("running service in MilkServiceImpl..");
        milkRepo.save(dto);
        return true;
    }

    @Override
    public List<MilkFormDto> getAll() {
        System.out.println("running getAll in MilkServiceImpl");
        return milkRepo.getAll();
    }
}
