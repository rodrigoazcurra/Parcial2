
package ar.edu.unlar.paradigmas3.parcial.objeto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Curso {
    
     String catedra;
     Date fecha;
     ArrayList <Profesor> listProfesores;
     ArrayList <Alumno> listAlumnos;
     ArrayList <Aula> listAulas;
    
    public ArrayList<Profesor> getListProfesores() {
        return listProfesores;
    }

    public void setListProfesores(ArrayList<Profesor> listProfesores) {
        this.listProfesores = listProfesores;
    }

    public ArrayList<Alumno> getListAlumnos() {
        return listAlumnos;
    }

    public void setListAlumnos(ArrayList<Alumno> listAlumnos) {
        this.listAlumnos = listAlumnos;
    }

    public ArrayList<Aula> getListAulas() {
        return listAulas;
    }

    public void setListAulas(ArrayList<Aula> listAulas) {
        this.listAulas = listAulas;
    }
     
    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void getCatedra(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getFecha(Calendar calendar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
