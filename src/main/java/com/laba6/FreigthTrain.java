package com.laba6; /**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

/**
 * Describes and shows all
 * enough info about freigth train.
 */
public class FreigthTrain {

    private String route,
            typeOfCargo,
            nameOfTrain;

    public final void setVariables(final String route, final String typeOfCargo,
                                   final String nameOfTrain) {
        this.route = route;
        this.typeOfCargo = typeOfCargo;
        this.nameOfTrain = nameOfTrain;
    }

    public final String getRoute() {
        return route;
    }

    public final String getTypeOfCargo() {
        return typeOfCargo;
    }

    public final String getNameOfTrain() {
        return nameOfTrain;
    }

    /**
     * @return Info about route
     * and type of cargo.
     */
    @Override
    public final String toString() {
        return "Name of train : " + nameOfTrain + "\n" +
                "Type of cargo : " + typeOfCargo + "\n" + "Route : " + route;
    }
}
