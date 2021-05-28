package com.company.package1;

public class ReturnChange implements  ToUser{
    public int returnchange(int coin , int price){
        if (coin<price){
            return coin;
        }
        return coin - price;
    }
}
