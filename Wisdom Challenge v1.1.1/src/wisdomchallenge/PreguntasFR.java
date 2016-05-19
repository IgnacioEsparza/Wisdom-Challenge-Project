/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomchallenge;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;


/**
 * @author Ignacio Esparza
 */
public class PreguntasFR {

    public String preguntasfr(int pos) {

        //FileWriter creacion = new FileWriter("C:\\Users\\Ignacio Esparza\\Documents\\NetBeansProjects\\Wisdom-Challenge\\Wisdom-Challenge-Proyect\\Wisdom Challenge v1.0.5\\src\\preguntas.wis");
        try {
            FileReader rutaPreg = new FileReader("C:\\Users\\Ignacio Esparza"
                    + "\\Documents\\NetBeansProjects\\Wisdom-Challenge"
                    + "\\Wisdom-Challenge-Proyect\\Wisdom Challenge v1.0.5\\src"
                    + "\\preguntas.wis");
            BufferedReader br = new BufferedReader(rutaPreg);
            String guardaPreg;
            while ((guardaPreg = br.readLine()) != null) {
                String pregunta [] = guardaPreg.split(",");
                return pregunta[pos]; 
            }
        } catch (Exception e) {
        }
       return null; 
    }

}
