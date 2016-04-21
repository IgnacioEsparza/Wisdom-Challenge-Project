/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdom.challenge.v1.pkg0.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ignacio Esparza
 */
public class Conf {
    Respuestas resp;
    Preguntas preg;
    
    public Conf(int pos){
        int cont=0;
        resp = new Respuestas();
        preg = new Preguntas();
        
        //aqui llamo solo las alternativas correctas para luego comprarlas la seleccion del usuario
        String [] correctas = resp.resCorrectas;
        
        // con este metodo estoy llamando la pregunta en la posición pos que se resive desde el main
        System.out.println(preg.llamarPreguntas(pos));
        
        //aqui al arreglo alter(alternativa) se llena con las alternativas señuero y la correcta
            String  [] alter = resp.establecerRespuesta(pos);
            System.out.println("A) "+alter[0]);
            System.out.println("B) "+alter[1]);
            System.out.println("C) "+alter[2]);
            System.out.println("D) "+alter[3]);
            
            int resUser=leer();
            
            if (alter[resUser].compareTo(correctas[pos])==0){
                System.out.println("Respuesta Correcta");
                cont++;
            }else{
                System.out.println("Respuesta Incorrecta, La respuesta Correcta es : "+correctas[pos]);
            }
            
            
    }// contructor
    
     public static String leerstring (){
        Scanner leer=new Scanner(System.in);
        String texto=leer.nextLine();
        return texto;  
    }//leerString
     
      public static int leer(){
        Scanner leer = new Scanner(System.in);
                int num=leer.nextInt();
        return num;
    }  //leer
}
