
package Main;

import ViewLayer.Store;
import EntityLayer.IngredientsPersist;

public class Main {
    public static void main(String[] args){
        new IngredientsPersist().insertIngredients();
        new Store().windows();
    }
}
