package com.xworkz.milk.impl;

import com.xworkz.milk.dto.SweetFormDto;
import com.xworkz.milk.repositary.SweetRepo;
import com.xworkz.milk.repositary.SweetRepoImpl;
import com.xworkz.milk.service.SweetService;

public class SweetServiceImpl implements SweetService {
    private  SweetRepo sweetRepo=new SweetRepoImpl();


    @Override
    public boolean Service(SweetFormDto dto) {
        System.out.println(" saved in sweetServiceImpl");
        sweetRepo.save();
        return true;

    }
}
