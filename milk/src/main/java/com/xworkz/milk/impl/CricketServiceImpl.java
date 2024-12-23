package com.xworkz.milk.impl;

import com.xworkz.milk.dto.CricketTournamentFormDto;
import com.xworkz.milk.repositary.CricketRepo;
import com.xworkz.milk.repositary.CricketRepoImpl;
import com.xworkz.milk.service.CricketService;

public class CricketServiceImpl implements CricketService {
    private CricketRepo cricketRepo=new CricketRepoImpl();


    @Override
    public boolean service(CricketTournamentFormDto dto) {
        System.out.println("saved in serviceimpl");
        cricketRepo.save();
        return true;
    }
}
