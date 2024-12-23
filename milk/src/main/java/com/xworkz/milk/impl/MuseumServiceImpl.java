package com.xworkz.milk.impl;

import com.xworkz.milk.dto.MuseumTicketFormDto;
import com.xworkz.milk.repositary.MuseumRepo;
import com.xworkz.milk.repositary.MuseumRepoImpl;
import com.xworkz.milk.service.MuseumService;

public class MuseumServiceImpl implements MuseumService {
    private MuseumRepo museumRepo=new MuseumRepoImpl();
    @Override
    public boolean service(MuseumTicketFormDto dto) {
        System.out.println("saved ");
        museumRepo.save();
        return  true;
    }
}
