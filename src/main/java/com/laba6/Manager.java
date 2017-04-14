package com.laba6;

import java.util.ArrayList;
import java.util.List;

/**
 * Creats objects of every class.
 */
public class Manager {
    List<String> trains = new ArrayList<String>();

    public final void createPassengersTrain() {
        PassengersTrain passengersTrain = new PassengersTrain();
        passengersTrain.setNameOfTransport("Kobzar", "Lviv-Zhmerynka");
        System.out.println("__________________\nName of train is : "
                + passengersTrain.getNameOfTransport());
        System.out.println("Route is : " + passengersTrain.getRoute());
        trains.add("Kobzar");
    }

    public final void createLocomotive() {

        Locomotive locomotive = new Locomotive();
        locomotive.setVariables("Kobzar","Lviv","Kyiv");
        System.out.println(locomotive.toString());
        trains.add("Locomotiv");
    }

    public final void creatCargo() {
        FreigthTrain freigthTrain = new FreigthTrain();
        freigthTrain.setVariables("Lviv", "Diamonds", "Gruz");
        System.out.println(freigthTrain.toString());
        trains.add("Gruz");
    }
}

