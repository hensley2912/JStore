package ControllerLayer;

import Ingredients.PizzaSimple;

public class SinglentonClass {

    private static ModelTable instanceModelTable;
    private static ControlIngredients insControlIngredients;
    private static PizzaSimple insPizzaSimple;

    private SinglentonClass() {
    }

    public synchronized static ModelTable getInstance() {

        if (instanceModelTable == null) {
            instanceModelTable = new ModelTable();
        }
        return instanceModelTable;
    }
    
    public synchronized static ControlIngredients getInstanceControlIngredients(){
        if (insControlIngredients == null) {
            insControlIngredients = new ControlIngredients();
        }
        return insControlIngredients;    
    }
 
    public synchronized static PizzaSimple getInstancePizzaSimple(){
        if (insPizzaSimple == null) {
            insPizzaSimple = new PizzaSimple();
        }
        return insPizzaSimple;    
    }    
}
