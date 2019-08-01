/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_POO_DDR_08.java;

/**
 *
 * @author Usuario iTC
 */
public class Cormercial extends Empleado {
    
    private double comision;

    public Cormercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+" comision=" + comision;
        
    }
    @Override
    public boolean plus() {
        
        
        if(super.getEdad()>30 && this.comision>200){
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.getSalario(nuevoSalario);
            return true;
            
        }
        return false;
    }
    
    
}
 