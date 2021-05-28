package com.company.package1;

public class Coin implements FromUser{
    int value;

    public Coin(int i) {
        value=i;
    }
    public int coin(){
        return value;
    }

}
