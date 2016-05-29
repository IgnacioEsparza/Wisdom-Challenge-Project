
package wisdomchallenge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class RegistroPuntaje {

    public RegistroPuntaje() {
    }
    
    public void registroPunt(Puntaje punt) {

        try {
            File txt = new File("puntaje.wis");
            FileWriter fw;
            BufferedWriter bw;
            if (txt.exists()) {
                fw = new FileWriter(txt,true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(punt.nombre+"%"+punt.puntaje);
            } else {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                bw.write(punt.nombre+"%"+punt.puntaje);
            }
            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }
}
