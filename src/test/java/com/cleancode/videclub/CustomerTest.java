package com.cleancode.videclub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Las peliculas corrientes se alquilan el primer dia por 1.50 dolares
//y se gana 1 punto de alquilador por dia alquiladas.
public class CustomerTest {
    private static Customer c;

    @BeforeEach
    public void setUp() {
        c = new Customer();
    }

    //    @Test
//    public void RegularMovie_OneDay() throws Exception {
//
//        c.addRental("Regular Movie", 1); //peli + nro de dias.
//        assertEquals(1.5, c.getRentalFee(), 0.001); //
//        assertEquals(1, c.getRenterPoints());
//    }
//

    private void assertFeeAndPoints(double fee, int points) {
        assertEquals(fee, c.getRentalFee(), 0.001);
        assertEquals(points, c.getRenterPoints());
    }

    @Test
    public void RegularMovie_OneDay() throws Exception {
        c.addRental("RegularMovie", 1);
        assertFeeAndPoints(1.5, 1);
    }
}
