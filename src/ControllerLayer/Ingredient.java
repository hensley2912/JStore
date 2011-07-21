package ControllerLayer;

public class Ingredient {

    private String nomIngredient;
    private double preIngredient;

    public double getPreIngredient() {
        return preIngredient;
    }

    public void setPreIngredient(double preIngredient) {
        this.preIngredient = preIngredient;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public Ingredient(String nomIngredient, double preIngredient) {
        this.nomIngredient = nomIngredient;
        this.preIngredient = preIngredient;
    }


}
