
package ControllerLayer;

import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class ModelTable extends AbstractTableModel {

    ArrayList<TableIngredients> arrayContainer;
    String[] columsName = {"Ingredientes", "Precio"};

    public ModelTable() {
    }

    @Override
    public int getRowCount() {
        int intReturn = 0;
        if (arrayContainer != null) {
            intReturn = arrayContainer.size();
        }
        return intReturn;
    }

    @Override
    public int getColumnCount() {
        return columsName.length;
    }

    @Override
    public Object getValueAt(int x, int y) {
        String objectRetorn = "";
        TableIngredients tableIngredients = arrayContainer.get(x);

        switch (y) {
            case 0:
                objectRetorn = tableIngredients.getNomIngredient();
                break;
            case 1:
                objectRetorn = String.valueOf(tableIngredients.getPreIngredient());
                break;

        }

        return false;
    }
}
