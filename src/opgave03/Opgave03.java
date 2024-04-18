package opgave03;

import opgave03.models.Bike;
import opgave03.models.BikeStore;
import opgave03.models.BikeType;
import opgave03.models.factories.NormalBikeFactory;

public class Opgave03 {
    public static void main(String[] args) {

// En cykelbutik laver cykler på bestilling, delene man skal bruge for hver type cykel er gemt i
// orderBike metode i klassen BikeStore. Kan I bruge jeres viden om Factory Methods til at
// ændre BikeStore.

// Implementer en abstract factory pattern ved at følge bogen, fra side 144 og frem til side 161

        BikeStore bikeStore = new BikeStore(new NormalBikeFactory());
        Bike bike = bikeStore.orderBike();
        System.out.println(bike);
    }
}
