package Ingredients;

public class PizzaSimple implements Pizza{
    private  double price = 150.00;
    private  String ingredient = "Masa";
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getIngredient() {
        return ingredient;
    }
}
