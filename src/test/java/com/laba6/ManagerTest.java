package com.laba6;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Tests for com.laba5.Manager Class
 * @author Nazarii Zavarynskyi
 * @version 1.0
 * @since 22.03.2017
 */
public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void createManag() {
        manager.creatCargo();
        assertEquals(1,manager.trains.size());
        manager.createLocomotive();
        assertEquals(2, manager.trains.size());
        manager.createPassengersTrain();
        assertEquals(3,manager.trains.size());
    }
}