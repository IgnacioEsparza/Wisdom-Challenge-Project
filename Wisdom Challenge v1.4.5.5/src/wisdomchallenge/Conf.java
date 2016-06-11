package wisdomchallenge;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Ignacio Esparza
 */
public final class Conf {

    Respuestas resp;
    Preguntas preg;
    RegistroPuntaje rpunt;

    public Conf() {
        preg = new Preguntas();
        resp = new Respuestas();
    }

    public void creaPreguntas() {
        int puntaje=0, pos, cont = 0;
        int pregunta[] = preguntaRandom();
        String nombre = registroNombre();
        do {
            pos = pregunta[cont];
            //pos = 36;
            String correctas = resCorrectas(pos);
            preguntas(pos);
            String[] alter = estAlternativas(pos);
            String res = leerstring();
            //se le pasa la respuesta del que fue escrita con letras ya convertida, para que el arreglo
            //pueda interpretarla
            int resUser = respuestaUser(res);

            System.out.println("");
            puntaje = comparacion(alter, resUser, correctas)+puntaje;
            System.out.println(puntaje);
            cont++;
        } while (cont != 10);
        System.out.println("____________________________________________________________________");
        System.out.println("Puntaje Actual|" + puntaje + "|");

        String puntajeS = String.valueOf((puntaje));
        rpunt = new RegistroPuntaje();
        rpunt.registroPunt(new Puntaje(nombre, puntajeS, fecha(), horaCompleta()));
        historialPuntajes();
    }

    private String[] estAlternativas(int pos) {
        //aqui al arreglo alter(alternativa) se llena con las alternativas señuelo y la correcta
        String[] alter = resp.establecerAlternativa(pos);
        System.out.println("A) " + alter[0]);
        System.out.println("B) " + alter[1]);
        System.out.println("C) " + alter[2]);
        System.out.println("D) " + alter[3]);
        return alter;
    }

    private int comparacion(String[] alter, int resUser, String correctas) {
        // aqui se comprara la alternativa seleccionada por el usuario con la correcta  
        int puntaje;
        if (alter[resUser].equals(correctas) == true) {
            System.out.println("Respuesta Correcta");
            System.out.println();
            puntaje= 100;
        } else {
            System.out.println("Respuesta Incorrecta, La respuesta Correcta es : " + correctas);
            System.out.println();
            puntaje = -50;
        }
        return puntaje;
    }

    private void preguntas(int pos) {
        System.out.println(preg.preguntas(pos));
    }

    private String resCorrectas(int pos) {
        //aqui llamo solo las alternativas correctas para luego comprarlas la seleccion del usuario
        return resp.resCorrectas(pos);
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

    private static int[] preguntaRandom() {
        //cantpreg son la cantidad de preguntas actuales
        int cantpreg = 36;
        int vector[] = new int[cantpreg];
        int i, j = 0;
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * cantpreg);
            while (j < i) {
                if (vector[i] == vector[j]) {
                    vector[i] = (int) (Math.random() * cantpreg);
                    j = 0;
                } else {
                    j++;
                }// fin else
            }// fin while
            j = 0;
        }// fin for
        return vector;
    }

    private static int respuestaUser(String res) {

        // este método se encarga de que cuando el usuario ingrese la alternativa, a esta se le
        //asigna la posición respectiva de la alternativa, si el carácter ingresado no es alternativa 
        // se ejecutará hasta que ingrese una alternativa válida.
        int resConvertida;
        String resmin = res.toLowerCase();

        switch (resmin) {
            case "a":
                resConvertida = 0;
                break;
            case "b":
                resConvertida = 1;
                break;
            case "c":
                resConvertida = 2;
                break;
            case "d":
                resConvertida = 3;
                break;
            default:
                System.out.println("El Carácter " + res + " no es una Alternativa Válida\n"
                        + "Seleccione Denuevo\n");
                resmin = leerstring();
                resConvertida = respuestaUser(resmin);
                break;
        }
        return resConvertida;
    }// fin de respuestaUser

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
