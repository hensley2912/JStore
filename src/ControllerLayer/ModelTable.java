package ControllerLayer;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ModelTable extends AbstractTableModel {

    ArrayList<Ingredient> arrayContainerIngredients;
    String[] columsName = {"Ingredientes:", "Precio:"};

    public ModelTable() {
        arrayContainerIngredients = new ArrayList<Ingredient>();
    }

    public void insertDataModel(Ingredient ingredient) {
        arrayContainerIngredients.add(ingredient);
        fireTableDataChanged();
        //System.out.println(ingredient.getNomIngredient());
    }
    
    public void deleteDataModel(int row){
        if(row >= 0){         
            arrayContainerIngredients.remove(row);
            fireTableRowsDeleted(row, row);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existen articulos seleccionados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }    

    @Override
    public int getRowCount() {
        int intReturn = 0;
        if (arrayContainerIngredients != null) {
            intReturn = arrayContainerIngredients.size();
        }
        return intReturn;
    }

    @Override
    public int getColumnCount() {
        return columsName.length;
    }

    @Override
    public String getColumnName(int x) {
        return columsName[x];
    }

    @Override
    public Object getValueAt(int x, int y) {
        String objectRetorn = "";
        Ingredient ingredient = arrayContainerIngredients.get(x);

        switch (y) {
            case 0:
                objectRetorn = ingredient.getNomIngredient();
                break;
            case 1: objectRetorn = String.valueOf(ingredient.getPreIngredient());
                break;                
        }

        return objectRetorn;
    }
}
