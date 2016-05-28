
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
            
<<<<<<< Upstream, based on Manuel/master
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users"
                    + "\\Ignacio Esparza\\Documents\\NetBeansProjects"
                    + "\\Wisdom-Challenge\\Wisdom-Challenge-Proyect\\preguntas.wis"));
=======
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mepr9\\Documents\\NetBeansProjects\\Wisdom-Challenge-Proyect\\Wisdom-Challenge-Proyect\\preguntas.wis"));
>>>>>>> 2588bcd Se han agregado 7 preguntas. Autor Manuel Palma 		
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
