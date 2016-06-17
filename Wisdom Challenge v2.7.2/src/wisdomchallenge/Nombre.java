/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomchallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Ignacio Esparza
 */
public class Nombre {
    public void registroNombre (String nombre) {

        try {

            File txt = new File("nombre.wis");
            FileWriter fw;
            BufferedWriter bw;
            if (txt.exists()) {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                bw.write(nombre);
            } else {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                bw.write("Anonimo");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
     public String mostrarNombre() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("nombre.wis"));
            return br.readLine();
        } catch (Exception e) {
        }
        return "nombre no encontrado";
    }
   
}
