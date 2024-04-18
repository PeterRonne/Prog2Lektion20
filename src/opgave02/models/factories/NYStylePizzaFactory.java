package opgave02.models.factories;

import opgave02.models.pizza.NYStyleCheesePizza;
import opgave02.models.pizza.NYStylePepperoniPizza;
import opgave02.models.pizza.NYStyleVegetarPizza;
import opgave02.models.pizza.Pizza;

public class NYStylePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("vegetar")) {
            return new NYStyleVegetarPizza();
        } else {
            return null;
        }
    }
}
