package com.xworkz.milk.repositary;

public class SweetRepoImpl implements SweetRepo{
    @Override
    public void save() {
        System.out.println("saved in SweetRepoImpl");
    }
}
