package wisdomchallenge;

public class Puntaje {

    String fecha;
    String hora;
    String nombre;
    String puntaje;

    public Puntaje() {
    }

    Puntaje(String nombre, String puntaje, String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
    
    public void ordenarPuntajes (){
        System.out.println("El "+fecha+" a las "+hora);
        System.out.println(nombre+" Obtuvo : "+puntaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

}
