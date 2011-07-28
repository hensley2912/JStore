package ControllerLayer;

import Ingredients.PizzaSimple;
import ViewLayer.*;

public class SinglentonClass {

    private static ModelTable instanceModelTable;
    private static ControlIngredients insControlIngredients;
    private static PizzaSimple insPizzaSimple;
    private static BillPnl insBillPnl;
    private static ControlDecorator insControlDecorator;

    private SinglentonClass() {
    }

    public synchronized static ModelTable getInstance() {

        if (instanceModelTable == null) {
            instanceModelTable = new ModelTable();
        }
        return instanceModelTable;
    }

    public synchronized static ControlIngredients getInstanceControlIngredients() {
        if (insControlIngredients == null) {
            insControlIngredients = new ControlIngredients();
        }
        return insControlIngredients;
    }

    public synchronized static PizzaSimple getInstancePizzaSimple() {
        if (insPizzaSimple == null) {
            insPizzaSimple = new PizzaSimple();
        }
        return insPizzaSimple;
    }

    public synchronized static BillPnl getInstanceBillPnl() {
        if (insBillPnl == null) {
            insBillPnl = new BillPnl();
        }
        return insBillPnl;
    }

    public synchronized static ControlDecorator getInstanceControlDecorator() {
        if (insControlDecorator == null) {
            insControlDecorator = new ControlDecorator();
        }
        return insControlDecorator;
    }
}
