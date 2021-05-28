package com.company.package1;

/**
 *
 */
public class Additives {

    /**
     * Default constructor
     */
    public Additives(Boolean m, int s) {
        Milk = m;
        Sugar = s;
    }

    /**
     *
     */
    public Boolean Milk;

    /**
     *
     */
    public int Sugar;

    /**
     * @return
     */
    public int PartAdditives() {

        if (!Milk && Sugar == 0) {
            return 0;
        } else if (!Milk && Sugar == 1) {

            return 1;
        }
        else if(Milk && Sugar==0){return 2;

    }
        return 3;
 }
}