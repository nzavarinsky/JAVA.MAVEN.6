package com.laba6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by NAZAR on 06.04.2017.
 */
public class PassengerTrainTest {
    PassengersTrain passengersTrain = new PassengersTrain();

    @Test
    public void createPassTrain(){
        passengersTrain.setNameOfTransport("Kobzar","Kyiv");
        assertEquals("Kobzar",passengersTrain.getNameOfTransport());
        assertEquals("Kyiv",passengersTrain.getRoute());
        String expected = "Name of passenger train : "
                + passengersTrain.getNameOfTransport() + "\n" +
                "Route : " + passengersTrain.getRoute();
        assertEquals(expected,passengersTrain.toString());
    }
}
