package EntityLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IngredientsPersist {

    List<String> ingredients = new ArrayList<String>();

    public IngredientsPersist() {
        ingredients.add("Pepperoni");
        ingredients.add("Queso");
        ingredients.add("Pollo");
        ingredients.add("Jalapeño");
        ingredients.add("Champiñones");
        ingredients.add("Piña");
        ingredients.add("Jamon");
        ingredients.add("Salami");
        ingredients.add("Cabanos");
        ingredients.add("Tomate");
        ingredients.add("Tocineta");
        ingredients.add("Maiz");
    }
    private Double[] prices = {
        100.00,
        50.00,
        100.00,
        30.00,
        50.00,
        30.00,
        30.00,
        20.00,
        50.00,
        20.00,
        45.00,
        30.00
    };

    public void insertIngredients() {
        //Entity
        IngredientsEntity ingredientsEntity = new IngredientsEntity();

        //Iterador de la lista declarada arriba..
        //ListIterator<String> iter = ingredients.listIterator(ingredients.size());

        //while (iter.hasPrevious()) {
            //Imprime correctamente
            //System.out.println(iter.previous());

            //Se estable el valor que se almacenara en la Entidad
            ingredientsEntity.setIngredient("prueba");
            
            //Se establece el precio que se almacenarara
            ingredientsEntity.setPrecio(100.00);

            //Se inicia la transaccion
            EntityManagerCreator.getInstance().getEntity().getTransaction().begin();

            //Se almacena
            EntityManagerCreator.getInstance().getEntity().persist(ingredientsEntity);

            //Se asegura
            EntityManagerCreator.getInstance().getEntity().getTransaction().commit();

        //}

        

    }
}
