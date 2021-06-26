
package ar.edu.unlar.paradigmas3.parcial.objeto.grillas;

import ar.edu.unlar.paradigmas3.parcial.objeto.Curso;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaCurso extends AbstractTableModel {
    
    ArrayList <Curso> datos;
    String columnas [] = {"FECHA", "CATEDRA"};
    
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
      Curso c = datos.get(rowIndex);
         int columnIndex = 0;
      
        switch (columnIndex) {
            case 0:
                return c.getFecha();
                
            case 1:
                return c.getCatedra();
                
        }
        return null;
    }
}
    