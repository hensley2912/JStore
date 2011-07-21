package Ingredients;

public class Queso extends PizzaDecorator{

    public Queso(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Queso" + separator;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
    
    
    
}
