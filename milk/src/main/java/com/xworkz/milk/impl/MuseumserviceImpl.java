package com.xworkz.milk.impl;

import com.xworkz.milk.dto.MuseumTicketFormDto;
import com.xworkz.milk.repositary.MuseumRepo;
import com.xworkz.milk.repositary.MuseumRepoImpl;
import com.xworkz.milk.service.MuseumService;

import java.util.List;

public class MuseumserviceImpl implements MuseumService {
    private MuseumRepo museumRepo=new MuseumRepoImpl();

    @Override
    public boolean service(MuseumTicketFormDto dto) {
        System.out.println("running service in MuseumServiceImpl..");
       museumRepo.save(dto);
        return true;
    }
    @Override
    public List<MuseumTicketFormDto> getAll() {
        System.out.println("running getAll in MuseumServiceImpl");
        return museumRepo.getAll();
    }
    }


