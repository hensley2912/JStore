package Ingredients;

public class PizzaSimple implements Pizza {

    @Override
    public double getPrice() {
        return 1.00;
    }

    @Override
    public String getIngredient() {
        return "Masa, ";
    }
}
