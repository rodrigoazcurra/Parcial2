
package ar.edu.unlar.paradigmas3.parcial.objeto;


public class Persona {
    
    
    String nombreApellido ;
    String dni;
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    @Override
     public String toString() {
        return nombreApellido;
     }
}
