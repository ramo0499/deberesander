/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseEmpleado;

/**
 *
 * @author Usuario iTC
 */
public class ClaseTecnico {
    public class Tecnico extends Operario{

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");
    }
   
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
    
}
