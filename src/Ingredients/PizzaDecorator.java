package Ingredients;

abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;
    protected String separator = ", ";

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getIngredient() {
        return pizza.getIngredient();
    }
}
