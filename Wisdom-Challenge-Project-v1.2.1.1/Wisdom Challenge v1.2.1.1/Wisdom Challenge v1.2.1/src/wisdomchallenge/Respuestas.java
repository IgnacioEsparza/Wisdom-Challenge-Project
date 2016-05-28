/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomchallenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Ignacio Esparza
 */
public class Respuestas {
    public String resCorrectas(int pos) {

        
        try { 
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mepr9\\Documents\\NetBeansProjects\\Wisdom-Challenge-Proyect\\Wisdom-Challenge-Project\\resCorrectas.wis"));
            String guardaRespCorrecta;
            while ((guardaRespCorrecta = br.readLine()) != null) {
                String respuesta [] = guardaRespCorrecta.split(",");
                return respuesta[pos]; 
            }
        } catch (Exception e) {
        }
       return "asd"; 
    }
    
     public String todRespuestas(int pos) {

        
        try { 
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mepr9\\Documents\\NetBeansProjects\\Wisdom-Challenge-Proyect\\Wisdom-Challenge-Project\\todRespuestas.wis"));
            String guardaTodRespuestas;
            while ((guardaTodRespuestas = br.readLine()) != null) {
                String pregunta [] = guardaTodRespuestas.split("%");
                return pregunta[pos]; 
            }
        } catch (Exception e) {
        }
       return null; 
    }
     
     public String [] separador (String cadena , String separador){
        StringTokenizer elementos = new StringTokenizer(cadena , separador);
        String [] numres = new String [4]; //numero de alternativas que hay
        int i =0;
        while (elementos.hasMoreTokens()){// recorrer la cadena en busca del separador
            numres[i]=elementos.nextToken();//obetener el elemento
            i++;
        }
        return numres;
    }
    public String [] establecerRespuesta (int pos){
        String texto =todRespuestas(pos);
        String [] alternativas = separador(texto, ",");// texto son las respuestas que encontró, y "," es como lo separé.
        return alternativas;
    }
}
