
package ar.edu.unlar.paradigmas3.parcial.objeto.grillas;

import ar.edu.unlar.paradigmas3.parcial.objeto.Alumno;
import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

public class TablaAlumno extends AbstractTableModel {

     ArrayList<Alumno> datos;
     String columnas[] = {"NOMBREyAPELLIDO", "DNI", "MATRICULA"};
    
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
      Alumno a = datos.get(rowIndex);
         int columnIndex = 0;
      
        switch (columnIndex) {
            case 0:
                return a.getNombreApellido();
                
            case 1:
                return a.getDni();
                
            case 2:
               return  a.getMatricula();
         
        }
        return null;
    }

    public ArrayList<Alumno> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Alumno> datos) {
        this.datos = datos;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

}