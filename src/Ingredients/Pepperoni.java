package Ingredients;

public class Pepperoni extends PizzaDecorator{

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 1.0;
    }
    
    @Override
    public String getIngredient(){
        return super.getIngredient() + "Pepperoni" + separator;
    }
}
