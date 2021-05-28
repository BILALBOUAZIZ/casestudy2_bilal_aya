package com.company;

import com.company.package1.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        while (true) {
            int s, c,t;
            int mil;
            int finalcoffee;
            int teaprice = 5;
            int coffeeprice = 10;
            boolean m = false;
            System.out.println("--------------------------------- \n");
            System.out.println("WELCOME TO AYA&BILAL Coffee Machine \n");
            System.out.println("Please select 0 for coffee and 1 for tea\n");
            Scanner scanner = new Scanner( System.in );
            t= scanner.nextInt();
            boolean tea = new Tea().tea(t);
            if (tea){
                System.out.println("please insert 5 dh");
                c= scanner.nextInt();
                System.out.println("take your change please "+new ReturnChange().returnchange(c,teaprice)+"\n");
                if (c>=teaprice){
                    new Controller().te();
                    System.out.println(new CupOfWater().cupofwater()+"\n");
                }
                else {
                    System.out.println("you need "+(teaprice-c)+" more dh\n" );
                }
            }
            else {
                System.out.println("please insert 10 dh");
                c = scanner.nextInt();
                System.out.println("take your change please "+new ReturnChange().returnchange(c, coffeeprice)+"\n");
                if (c >= coffeeprice) {
                    new Controller().cf();
                    System.out.println("please select 1 if you want your coffee with milk and 0 otherwise\n");
                    mil = scanner.nextInt();
                    if (mil == 1) {
                        m = true;
                    }
                    System.out.println("please select 1 if you want your coffee with sugar and 0 otherwise\n");
                    s = scanner.nextInt();
                    finalcoffee = new Coffee(m, s).PartAdditives();
                    if (finalcoffee == 0) {
                        System.out.println(new CupOfCoffee().cupofcoffee() + " without milk nor sugar \n");
                    } else if (finalcoffee == 1) {
                        System.out.println(new CupOfCoffee().cupofcoffee() + " with sugar and no milk \n");
                    } else if (finalcoffee == 2) {
                        System.out.println(new CupOfCoffee().cupofcoffee() + " with milk and no sugar \n");

                    } else if (finalcoffee == 3) {
                        System.out.println(new CupOfCoffee().cupofcoffee() + " with milk and sugar \n");
                    }

                }
                else {
                    System.out.println("you need "+(coffeeprice-c)+" more dh\n" );

                }
            }
            System.out.println("we've sold "+new Controller().nbrcoffee+" cup of coffee and "+new Controller().nbrtea+" cup of tea till now");

        }
    }
}
