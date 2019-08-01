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
public class main {
    public static void main(String[] args) {

        Producto ListaProductos[] = new Producto[3];

        ListaProductos[0] = new Producto("JABON", 2);
        ListaProductos[1] = new Perecedero(1, "SHAMPOO", 1);
        ListaProductos[2] = new noperecedero("tipo 1", "CEPILLO", 1);

        double suma = 0;
        for (Producto ListaProducto : ListaProductos) {
            suma = suma + ListaProducto.Calcular(5);
        }
        System.out.println("El precio tatal de productos es: " + suma);

    }

}

    
     
    

