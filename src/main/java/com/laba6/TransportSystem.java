package com.laba6; /**
 * @author Zavarynskyi Nazarii
 * @since 22.02.17
 */

import java.io.IOException;

/**
 * Calls choosing menu.
 */

class TransportSystem {
    public static void main(final String[] args) throws IOException {
        Manager mg = new Manager();
        mg.createPassengersTrain();
        mg.createLocomotive();
        mg.creatCargo();
    }
}
