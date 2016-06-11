package wisdomchallenge;

public class Puntaje {

    private String fecha;
    private String hora;
    private String nombre;
    private String puntaje;

    public Puntaje() {
    }

    Puntaje(String nombre, String puntaje, String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public void ordenarPuntajes() {
        System.out.println("El " + this.fecha + " a las " + this.hora);
        System.out.println(this.nombre + " Obtuvo : " + this.puntaje);
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuntaje() {
        return puntaje;
    }

}
