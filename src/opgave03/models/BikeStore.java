package opgave03.models;

import opgave03.models.factories.BikeFactory;
import opgave03.models.factories.NormalBikeFactory;
import opgave03.models.parts.*;

import java.util.List;

public class BikeStore {
    BikeFactory factory;

    public BikeStore(BikeFactory factory) {
        this.factory = factory;
    }

    public Bike orderBike() {
        return factory.createBike();
    }
}
