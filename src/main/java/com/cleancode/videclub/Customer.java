package com.cleancode.videclub;

import static com.cleancode.videclub.VideoRegistry.VideoType.CHILDRENS;
import static com.cleancode.videclub.VideoRegistry.VideoType.REGULAR;


public class Customer {
    private int days;
    private String title;

    public Customer() {
        VideoRegistry.addMovie("RegularMovie", REGULAR);
        VideoRegistry.addMovie("ChildrenMovie", CHILDRENS);
    }

    public void addRental(String title, int days) {
        this.days = days;
        this.title = title;
    }


    public double getRentalFee() {
        if (VideoRegistry.getType(title) == REGULAR)
            return applyGracePeriod(150, 3);
        else return 100;
    }

    public int getRenterPoints() {
        if (VideoRegistry.getType(title) == REGULAR)
            return applyGracePeriod(1, 3);
        else return 1;
    }

    //days = 5 33 mayores a 3 regla de neocio, grace = 3 regla de negocio.
    public int applyGracePeriod(int amount, int grace) {
        if (days > grace) {
            return amount + amount * (days - grace);
        }
        return amount;
    }
}
