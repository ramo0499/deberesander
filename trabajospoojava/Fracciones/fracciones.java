/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

/**
 *
 * @author Usuario iTC
 */
public class fracciones {
    public class Fraccion {

    private int num;
    private int den;

    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }

    public Fraccion(int num) {
        this.num = num;
        this.den = 1;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  
        return aux;
    }
   
    
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  
        return aux;
    }
   
    
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  
        return aux;
    }

    
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar(); 
        return aux;
    }
   
    
    private int mcd() {
        int u = Math.abs(num); 
        int v = Math.abs(den); 
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    
    private void simplificar() {
        int n = mcd(); 
        num = num / n;
        den = den / n;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }    
}
    
}
