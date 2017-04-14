package com.laba6; /**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Represents com.laba6.Locomotive-type
 * of train and shows basic info.
 */

class Locomotive {
    private String nameOfLocomotive,
            departure,
            arrival;
    private List<String> cargo = new ArrayList<String>();

    public void setVariables(final String nameOfLocomotive,
                             final String departure,
                             final String arrival) {
        this.nameOfLocomotive = nameOfLocomotive;
        this.departure = departure;
        this.arrival = arrival;
    }

    public void addCargos() {
        cargo.add(nameOfLocomotive);
        cargo.add(departure);
        cargo.add(arrival);
    }

    public int getListSize() {
        return cargo.size();
    }

    public String getNameOfLocomotive() {
        return nameOfLocomotive;
    }

    public String getDeparture() { return departure; }

    public String getArrival() { return arrival; }

    @Override
    public String toString() {
        return "Name of locomotive : " + nameOfLocomotive + "\n"
                + "Departure is : " + departure + "\n"
                + "Arrival is : " + arrival;
    }
}
