package ControllerLayer;

import Ingredients.*;
import ViewLayer.*;

public class ControlIngredients {

    static Pizza pizza = SinglentonClass.getInstancePizzaSimple();

    public void addIngredient(Object ingredient) {
        //BillPnl billPnl = new BillPnl();
        
        if (ingredient.equals("Pepperoni")) {
            pizza = new Pepperoni(pizza);
        }
        if (ingredient.equals("Queso")) {
            pizza = new Queso(pizza);
        }
        //billPnl.txtTotal.setText(Double.toString(pizza.getPrice()));
        System.out.println("Cost: " + pizza.getPrice() + "; Ingredients: " + pizza.getIngredient());
    }
}
