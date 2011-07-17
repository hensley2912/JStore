package ControllerLayer;

public class TableIngredients {
    private String nomIngredient;
    private Double preIngredient;

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public Double getPreIngredient() {
        return preIngredient;
    }

    public void setPreIngredient(Double preIngredient) {
        this.preIngredient = preIngredient;
    }

    public TableIngredients(String nomIngredient, Double preIngredient) {
        this.nomIngredient = nomIngredient;
        this.preIngredient = preIngredient;
    }
    
}
