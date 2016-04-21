
package wisdom.challenge.v1.pkg0.pkg2;

// Victor Esparza
// Manuel Palma

public class WisdomChallengeV102 {
    
   
    
    public static void main(String[] args) {
         int pos=5;
    Respuestas resp = new Respuestas();
    Preguntas preg = new Preguntas();
    
            System.out.println(preg.llamarPreguntas(pos));
            String  [] aux = resp.establecerRespuesta(pos);
            System.out.println("A) "+aux[0]);
            System.out.println("B) "+aux[1]);
            System.out.println("C) "+aux[2]);
            System.out.println("D) "+aux[3]);
    
    }
    
}
