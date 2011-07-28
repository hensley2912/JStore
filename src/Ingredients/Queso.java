package Ingredients;

public class Queso extends PizzaDecorator {

    public Queso(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Queso ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.00;
    }
}
