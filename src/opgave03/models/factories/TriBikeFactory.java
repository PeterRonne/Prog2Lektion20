package opgave03.models.factories;

import opgave03.models.Bike;
import opgave03.models.parts.Handlebar;
import opgave03.models.parts.Seat;
import opgave03.models.parts.Stel;
import opgave03.models.parts.Wheel;

import java.util.List;

public class TriBikeFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        return new Bike(List.of(
                new Wheel(),
                new Wheel(),
                new Wheel(),
                new Seat(),
                new Stel(),
                new Handlebar()));
    }
}
