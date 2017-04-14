package com.laba6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by NAZAR on 06.04.2017.
 */
public class FreigthTrainTest {
    FreigthTrain freigthTrain = new FreigthTrain();

    @Test
    public void createFreaightTrain() throws Exception {
        freigthTrain.setVariables("Lviv", "Diamonds", "Gruz");
        assertEquals("Lviv", freigthTrain.getRoute());
        assertEquals("Diamonds", freigthTrain.getTypeOfCargo());
        assertEquals("Gruz", freigthTrain.getNameOfTrain());
        String expected = "Name of train : " + freigthTrain.getNameOfTrain() + "\n" +
                "Type of cargo : " + freigthTrain.getTypeOfCargo() + "\n" + "Route : "
                + freigthTrain.getRoute();;
        assertEquals(expected, freigthTrain.toString());
    }
}
