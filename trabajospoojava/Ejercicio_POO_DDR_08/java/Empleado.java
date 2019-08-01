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
public abstract class Empleado {
     //Atributos
    private String nombre;
    private int edad;
    private double salario;
 
    
    public final double PLUS = 300;
 
   
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
 
  
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        this.salario = salario;
    }
 
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";
    }
 
        //Metodo abstracto, obliga a las clases hijas que implementen esta función
    public abstract boolean plus();

    void getSalario(double nuevoSalario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
    

