/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomchallenge;

import java.util.StringTokenizer;

/**
 *
 * @author Ignacio Esparza
 */
public class Respuestas {
    // aqui se alojan todas las respuestas correctas, para luego hacer la compraración
    String [] resCorrectas = {
        "Cristoforo Colombo","Inglés","Austria","George Washington","Londres","En 1939","Cristianismo","India",
        "Grecia","Canadá","Brasil","Pacífico"
    };
    
    //aqui van las respuestas señuelo con las correctas
    String [] todRespuestas = {
      /*0*/ "Cristobal Colon,Cristoso Colombo,Cristoforo Colombo,Cristofor Colon",
      /*1*/ "Inglés,Galés,Escocés,Irlandés",
      /*2*/ "Polonia,Austria,Alemania,Hungría",
      /*3*/ "Thomas Jefferson,John Adams,James Madison,George Washington",
      /*4*/ "Madrid,Londres,Berlín,París",
      /*5*/ "En 1949,En 1932,En 1939,En 1814",
      /*6*/ "Islamismo,Cristianismo,Budismo,Hinduismo",
      /*7*/ "India,Estados Unidos,Japón,China",
      /*8*/ "Macedonia,Grecia,Bulgaria,Albania",
      /*9*/ "China,Rusia,Estados Unidos,Canadá",
      /*10*/"Colombia,México,Brasil,Argentina",
      /*11*/"Índico,Pacífico,Atlántico,Ártico"
        
    };
    
    public String llamarRespuestas (int pos){
      return resCorrectas[pos];
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
        String texto =todRespuestas[pos];
        String [] alternativas = separador(texto, ",");// texto son las respuestas que encontró, y "," es como lo separé.
        return alternativas;
    }
    
}
