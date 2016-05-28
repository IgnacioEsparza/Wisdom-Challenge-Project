
package wisdomchallenge;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;


/**
 * @author Ignacio Esparza
 */
public class Preguntas {

    public String preguntasfr(int pos) {

        
        try { 
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mepr9\\Documents\\NetBeansProjects\\Wisdom-Challenge-Proyect\\Wisdom-Challenge-Project\\preguntas.wis"));
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
