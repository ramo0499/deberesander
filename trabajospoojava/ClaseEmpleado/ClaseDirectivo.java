/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseEmpleado;

import ClaseEmpleado.clasesempleado.Empleado;

/**
 *
 * @author Usuario iTC
 */
public class ClaseDirectivo extends Empleado {
     
    public ClaseDirectivo() {
    }
   
    public ClaseDirectivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de Directivo");
    }
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
   



   