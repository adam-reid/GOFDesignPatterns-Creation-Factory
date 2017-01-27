package com.training;

/**
 * Created by adame on 1/27/2017.
 */
public class BoatFactory {

    public Boat makeBoat(BoatTypes value) {
        switch (value) {
            case TUGBOAT: return new TugBoat();
            case SPEEDBOAT: return new SpeedBoat();
            case PARTYBOAT: return new PartyBoat();
            default: return null;
        }
    }
}
