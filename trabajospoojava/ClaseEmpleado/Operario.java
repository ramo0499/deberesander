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
class Operario extends empleado {
    
    public Operario(String nombre) {
        String (nombre);
        System.out.println("Constructor de Operario");
    }

    
    public Operario() {
    }

    
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }

    private void String(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
    

    

