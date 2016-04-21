/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdom.challenge.v1.pkg0.pkg2;

/**
 *
 * @author Ignacio Esparza
 */
public class Preguntas {
    String [] preguntas = {
      "Nombre Real de Cristobal Colon","Nacionalidad de Charles Darwin","País de Origen de Adolf Hitler", 
      "Primer Presidente de Estados Unidos","Ciudad más Grande de la Union Europea", 
      "Cuando Inició la Segunda Guerra Mundial",
      "Religión con más Seguidores", "Segundo País más Poblado del Mundo", 
      "País del Partido Político : 'Asociación Popular - Amanecer Dorado'",
      "El Sengudo País más Grande del Mundo"
    };
    
    public String llamarPreguntas (int pos){
        return preguntas[pos];
    }
}// fin clase preguntas
