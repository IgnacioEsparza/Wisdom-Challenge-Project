package wisdomchallenge;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Ignacio Esparza
 */
public final class Conf {

    Respuestas resp;
    Preguntas preg;
    Puntaje p;
    RegistroPuntaje rpunt;
    String correccion;
    //int seleccion;

    public Conf() {
        preg = new Preguntas();
        resp = new Respuestas();
    }

    /*public Conf(int seleccion) {
     this.seleccion = seleccion;
     }*/


    public void comparacion(int seleccion, int pos) {
        System.out.println("posicion conf "+pos);
        String [] alternativa = resp.establecerAlternativa(pos);
        String correctas = resp.resCorrectas(pos);
        System.out.println("");
        System.out.println(correctas);
        System.out.println(alternativa[seleccion]);
        if (alternativa[seleccion].equals(correctas)==true) {
            correccion = "Respuesta Correcta";
        } else {
            correccion = "Respuesta Incorrecta, La respuesta Correcta es : " + correctas;
        }
    }

    public String getCorreccion() {
        return correccion;
    }

    private String fecha() {
        Calendar c = Calendar.getInstance();
        String dia = String.valueOf(c.get(Calendar.DATE));
        String mes = String.valueOf((c.get(Calendar.MONTH)) + 1);
        String agno = String.valueOf(c.get(Calendar.YEAR));
        String fecha = dia + "-" + mes + "-" + agno;
        return fecha;
    }

    private String horaCompleta() {
        Calendar c = Calendar.getInstance();
        String hora = String.valueOf((c.get(Calendar.HOUR_OF_DAY)) /*- 1*/);
        String min = String.valueOf(c.get(Calendar.MINUTE));
        String seg = String.valueOf(c.get(Calendar.SECOND));
        String horaCompleta = hora + ":" + min + ":" + seg;
        return horaCompleta;
    }

    public int[] preguntaRandom() {
        //cantpreg son la cantidad de preguntas actuales
        int cantPregunta = 36;
        int pregRandom[] = new int[cantPregunta];
        int i, j = 0;
        for (i = 0; i < pregRandom.length; i++) {
            pregRandom[i] = (int) (Math.random() * cantPregunta);
            while (j < i) {
                if (pregRandom[i] == pregRandom[j]) {
                    pregRandom[i] = (int) (Math.random() * cantPregunta);
                    j = 0;
                } else {
                    j++;
                }// fin else
            }// fin while
            j = 0;
        }// fin for
        return pregRandom;
    }

    private String registroNombre() {
        System.out.println("Ingrese su Nombre");
        String nombre = leerstring();
        System.out.println();
        System.out.println("Bienvenido(a) : " + nombre + "\n");
        return nombre;
    }

    private void historialPuntajes() {
        System.out.println("Desea ver el Registro de Puntajes (Si/No)");
        String r = leerstring();
        System.out.println();
        String respuesta = r.toLowerCase();
        if (respuesta.equals("si")) {
            rpunt = new RegistroPuntaje();
            rpunt.imprimirPuntajes();
        } else {
            System.exit(0);
        }

    }

    public static String leerstring() {
        Scanner leer = new Scanner(System.in);
        String texto = leer.nextLine();
        return texto;
    }//leerString
}
