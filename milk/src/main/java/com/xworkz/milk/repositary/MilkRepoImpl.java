package com.xworkz.milk.repositary;

public class MilkRepoImpl implements MilkRepo {
    @Override
    public void save() {
        System.out.println("saved in MilkRepoImpl");
    }
}
