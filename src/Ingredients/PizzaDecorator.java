package Ingredients;

 public abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;
    //private static PizzaDecorator pizzaDecorator;

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

    public final String delIngredient(String ingredient) {
        String ingredientTemp[] = this.getIngredient().split(" ");
        String newIngredientList = "";
        for (String temp : ingredientTemp) {
            if (temp.equals(ingredient)) {
            } else {
                newIngredientList = ingredient;
            }
        }
        return newIngredientList;
    }

    /*
    public synchronized static PizzaDecorator getInstance() {
        if (pizzaDecorator == null) {
            pizzaDecorator = new PizzaDecorator(){};
        }
        return pizzaDecorator;
    }
     * 
     */
}
