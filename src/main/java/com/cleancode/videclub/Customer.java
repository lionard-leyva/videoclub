package com.cleancode.videclub;

public class Customer {
    private int days;

    public void addRental(String title, int days) {
        this.days = days;
    }

    public double getRentalFee() {
        return applyGracePeriod(150, 3);
    }

    public int getRenterPoints() {
        return applyGracePeriod(1, 3);
    }

    //days = 5 33 mayores a 3 regla de neocio, grace = 3 regla de negocio.
    public int applyGracePeriod(int amount, int grace) {
        if (days > grace) {
            return amount + amount * (days - grace);
        }
        return amount;
    }
}
