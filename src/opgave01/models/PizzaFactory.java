package opgave01.models;

import opgave01.models.pizzas.*;

import java.lang.reflect.Type;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("vegetar")){
            pizza = new VegetarPizza();
        }
        return pizza;
    }
}
