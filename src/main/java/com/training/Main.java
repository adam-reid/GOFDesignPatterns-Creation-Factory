package com.training;

import static com.training.BoatTypes.*;

/**
 * Created by adame on 1/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        BoatFactory boatFactory = new BoatFactory();

        Boat myBoat = boatFactory.makeBoat(TUGBOAT);

        Boat myBoat2 = boatFactory.makeBoat(SPEEDBOAT);

        myBoat.makeBoatSound();
        myBoat2.makeBoatSound();
    }
}
