/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author Usuario iTC
 */
public class noperecedero extends Producto {
    
     private String Tipo;

    public noperecedero(String Nombre, double Precio) {
        super(Nombre, Precio);
    }

 public noperecedero(String Tipo,String Nombre,double Precio){
     super(Nombre,Precio);
     this.Tipo=Nombre;
     
 }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
 public String MostrarDatos(){
      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" TIPO: "+this.Tipo);
  }  

}
    

