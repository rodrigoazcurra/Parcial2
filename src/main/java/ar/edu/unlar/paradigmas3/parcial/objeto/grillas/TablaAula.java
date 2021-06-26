
package ar.edu.unlar.paradigmas3.parcial.objeto.grillas;

import ar.edu.unlar.paradigmas3.parcial.objeto.Aula;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TablaAula extends AbstractTableModel {
    
    ArrayList <Aula> datos;
    String columnas[] = {"NUMERO DE AULA", "MODULO"};
    
    @Override
    public int getRowCount() {
       return datos.size();
        
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
                
    }

    @Override
    public Object getValueAt(int i, int i1) {
         int rowIndex = 0;
      Aula a = datos.get(rowIndex);
         int columnIndex = 0;
      
        switch (columnIndex) {
            case 0:
                return a.getNumero();
                
            case 1:
                return a.getModulo();
                
        }
        return null;
    }
}
    