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
//        assertEquals(1.5, c.getRentalFee(), 0.001); //1.5 costo de alquiler,
//        getRentalFee lo que obstieney y el 0,001 es el delta
//        assertEquals(1, c.getRenterPoints());
//    }
//

    private void assertFeeAndPoints(int fee, int points) {
        assertEquals(fee, c.getRentalFee(), 0.001);
        assertEquals(points, c.getRenterPoints());
    }

    @Test
    public void RegularMovie_OneDay() throws Exception {
        c.addRental("RegularMovie", 1);
        assertFeeAndPoints(150, 1);
    }

    //El segundo ,y tercer dia de alquiler de pleiculas corrientes son gratis
    //y no se gana ningun punto con ellos.
    @Test
    public void RegularMovie_SecondAndThirdDayFree() throws Exception{
        c.addRental("RegularMovie",2);
        assertFeeAndPoints(150,1);
        c.addRental("RegularMovie",3);
        assertFeeAndPoints(150,1);
    }
    //Todos los dias subsiguientes al tercer dia tienene un alquiler
    //1.5 dolares y se gana un punto por alquilador
    @Test
    public void RegularMovieFourDays()throws Exception{
        c.addRental("RegularMovie",4);
        assertFeeAndPoints(300,2);// primer dia: 1.5 cuarto dia: 1,5
        //1 punto por cada dia
    }
}
