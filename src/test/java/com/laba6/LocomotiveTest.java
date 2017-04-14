package com.laba6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NAZAR on 06.04.2017.
 */
public class LocomotiveTest {
    Manager manager = new Manager();
    Locomotive locomotive = new Locomotive();

    @Test
    public void createCargo() throws Exception {
        manager.creatCargo();
        locomotive.addCargos();
        assertEquals(3, locomotive.getListSize());
        locomotive.setVariables("TTE16","Lviv","Kyiv");
        assertEquals("TTE16",locomotive.getNameOfLocomotive());
        String expected = "Name of locomotive : " + locomotive.getNameOfLocomotive() + "\n"
                + "Departure is : " + locomotive.getDeparture() + "\n"
                + "Arrival is : " + locomotive.getArrival();
        assertEquals(expected,locomotive.toString());
    }
}
