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
public class ClaseOficial {
    public class Oficial extends Operario{

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
    
}
