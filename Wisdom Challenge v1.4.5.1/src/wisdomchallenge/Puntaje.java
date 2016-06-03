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
    
    public void ordenarPuntajes (){
        System.out.println("El "+this.fecha+" a las "+this.hora);
        System.out.println(this.nombre+" Obtuvo : "+this.puntaje);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
