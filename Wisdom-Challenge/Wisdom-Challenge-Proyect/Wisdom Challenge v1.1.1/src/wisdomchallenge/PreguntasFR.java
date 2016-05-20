
package wisdomchallenge;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;


/**
 * @author Ignacio Esparza
 */
public class PreguntasFR {

    public String preguntasfr(int pos) {

        
        try { 
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users"
                    + "\\Ignacio Esparza\\Documents\\NetBeansProjects"
                    + "\\Wisdom-Challenge\\Wisdom-Challenge-Proyect\\preguntas.wis"));
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
