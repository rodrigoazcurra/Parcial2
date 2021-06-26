
package ar.edu.unlar.paradigmas3.parcial.objeto.grillas;

import ar.edu.unlar.paradigmas3.parcial.objeto.Profesor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaProfesor extends AbstractTableModel{

    ArrayList <Profesor>  datos;
    String columnas[] = {"NOMBREyAPELLIDO", "DNI", "LEGAJO"};
    
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
      Profesor p = datos.get(rowIndex);
         int columnIndex = 0;
      
        switch (columnIndex) {
            case 0:
                return p.getNombreApellido();
                
            case 1:
                return p.getDni();
                
            case 2:
               return  p.getLegajo();
         
        }
        return null;
    }
}
    