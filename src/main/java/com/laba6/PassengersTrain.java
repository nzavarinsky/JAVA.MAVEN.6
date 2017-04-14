package com.laba6; /**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

/**
 * Is used to contain all details
 * about passenger train.
 * Shows route information.
 */

public class PassengersTrain {
    private String nameOfTransport, route;


    public final void setNameOfTransport(final String nameOfTransport,
                                         final String route) {
        this.nameOfTransport = nameOfTransport;
        this.route = route;
    }

    public final String getNameOfTransport() {
        return nameOfTransport;
    }

    public final String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "Name of passenger train : " + nameOfTransport + "\n" +
                "Route : " + route;
    }
}
