package opgave03.models.factories;

import opgave03.models.Bike;
import opgave03.models.parts.*;

import java.util.List;

public class EBikeFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        return new Bike(List.of(
                new Wheel(),
                new Wheel(),
                new Seat(),
                new Stel(),
                new Handlebar(),
                new Motor(),
                new Battery()));
    }
}
