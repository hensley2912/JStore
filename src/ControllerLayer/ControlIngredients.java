package ControllerLayer;

import Ingredients.*;
import ViewLayer.BillPnl;

public class ControlIngredients {

    public static Pizza pizza = SinglentonClass.getInstancePizzaSimple();

    public void addIngredient(Object ingredient) {
        //BillPnl billPnl = new BillPnl();

        if (ingredient.equals("Pepperoni")) {
            pizza = new Pepperoni(pizza);
        }
        if (ingredient.equals("Queso")) {
            pizza = new Queso(pizza);
        }

        BillPnl.txtTotal.setText(pizza.getPrice() + "");

        //System.out.println("Cost: " + pizza.getPrice() + "; Ingredients: " + pizza.getIngredient());
    }
}
