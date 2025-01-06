package com.xworkz.milk.impl;

import com.xworkz.milk.dto.SweetFormDto;
import com.xworkz.milk.repositary.SweetRepo;
import com.xworkz.milk.repositary.SweetRepoImpl;
import com.xworkz.milk.service.SweetService;

import java.util.List;

public class SweetServiceImpl implements SweetService {
    private SweetRepo sweetRepo = new SweetRepoImpl();

    @Override
    public boolean service(SweetFormDto dto) {
        System.out.println("running service in SweetServiceImpl..");
      sweetRepo.save(dto);
        return true;
    }

    @Override
    public List<SweetFormDto> getAll() {
        System.out.println("running getAll in SweetServiceImpl");
        return sweetRepo.getAll();
    }
}



