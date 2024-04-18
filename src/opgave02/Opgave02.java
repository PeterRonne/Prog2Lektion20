package opgave02;

import opgave02.models.Pizzeria;
import opgave02.models.factories.ChicagoPizzaFactory;
import opgave02.models.factories.NYStylePizzaFactory;
import opgave02.models.factories.PizzaFactory;

public class Opgave02 {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new ChicagoPizzaFactory();
        Pizzeria pizzeria = new Pizzeria(pizzaFactory);
        pizzeria.orderPizza("cheese");
    }

}
