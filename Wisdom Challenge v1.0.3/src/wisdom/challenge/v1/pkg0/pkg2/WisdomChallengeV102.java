
package wisdom.challenge.v1.pkg0.pkg2;

// Victor Esparza

import java.util.*;

// Manuel Palma

public class WisdomChallengeV102 {
    
 
    
    public static void main(String[] args) {
      int pos, cont=0;  
      do{
      Random azar = new Random();
      pos= azar.nextInt(10);
      
      Conf programa = new Conf(pos);
      
      cont++;
      }while(cont!=10);
    }
    
}
