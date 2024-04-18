package opgave03.models;

import opgave03.models.parts.Part;

import java.util.ArrayList;
import java.util.List;

public class Bike {
    List<Part> parts = new ArrayList<>();

    public Bike(List<Part> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return parts.toString();
    }
}
