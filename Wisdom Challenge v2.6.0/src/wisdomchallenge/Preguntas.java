package wisdomchallenge;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;

/**
 * @author Ignacio Esparza
 */
public class Preguntas {

    public String preguntas(int pos) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("preguntas.wis"));
            String guardaPreg;
            while ((guardaPreg = br.readLine()) != null) {
                String pregunta[] = guardaPreg.split(",");
                return pregunta[pos];
            }
        } catch (Exception e) {
        }
        return "Error de Lectura. Ubicacion de preguntas.wis no Encontrada";
    }

}
