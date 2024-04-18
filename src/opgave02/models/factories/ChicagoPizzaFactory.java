package opgave02.models.factories;

import opgave02.models.pizza.ChicagoStyleCheesePizza;
import opgave02.models.pizza.ChicagoStylePepperoniPizza;
import opgave02.models.pizza.ChicagoSyleVegetarPizza;
import opgave02.models.pizza.Pizza;

public class ChicagoPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("vegetar")) {
            return new ChicagoSyleVegetarPizza();
        } else {
            return null;
        }
    }
}
