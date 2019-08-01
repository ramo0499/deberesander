/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroapp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio2App {

    public static void main(String[] args) {

        String ruta = JOptionPane.showInputDialog("C:\\Users\\Usuario iTC\\Desktop\\ejemplo04.txt");
        String texto = JOptionPane.showInputDialog("sergio ramos el mejor defensa 04");
        escribirFichero(ruta, texto);

        mostrarFicheroMay(ruta);

    }

    public static void escribirFichero(String nomFich, String texto) {
        try (FileWriter fw = new FileWriter(nomFich);) {

            //Escribimos el texto en el fichero
            fw.write(texto);

        } catch (IOException e) {
            System.out.println("Problemas en la escritura E/S " + e);
        }
    }

    public static void mostrarFicheroMay(String nomFich) {
        try (FileReader fr = new FileReader(nomFich)) {

            int valor = fr.read();

            while (valor != -1) {

                
                char caracter = (char) valor;
                if (caracter >= 97 && caracter <= 122) {
                    caracter -= 32;
                } else if (caracter >= 65 && caracter <= 90) {
                    caracter += 32;
                }
                System.out.print(caracter);
                valor = fr.read();
            }

        } catch (IOException e) {
            System.out.println("Problema con la E/S " + e);
        }
    }

}
