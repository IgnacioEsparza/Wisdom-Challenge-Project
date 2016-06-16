package wisdomchallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
                fw = new FileWriter(txt, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(punt.getNombre() + "%" + punt.getPuntaje() + "%"
                        + punt.getFecha() + "%" + punt.getHora());
            } else {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                bw.write(punt.getNombre() + "%" + punt.getPuntaje() + "%"
                        + punt.getFecha() + "%" + punt.getHora());
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public void imprimirPuntajes() {
        try {

            File txt = new File("puntaje.wis");
            if (txt.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("puntaje.wis"));
                String regPuntaje;
                while ((regPuntaje = br.readLine()) != null) {
                    String[] registro = regPuntaje.split("%");
                    Puntaje p = new Puntaje(registro[0], registro[1], registro[2], registro[3]);
                    p.ordenarPuntajes();
                    System.out.println("__________________________________________________");
                }
            } else {
                System.out.println("No hay Puntajes Registrados");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
