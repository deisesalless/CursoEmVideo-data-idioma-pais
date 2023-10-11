
package entidades;

import java.util.Date;
import java.util.Locale;


public class Exercicio {

    
    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.out.println("A hora do sistema é: " + relogio.toString());
        
        Locale idioma = Locale.getDefault();
        String language = idioma.getDisplayLanguage();
        System.out.println("O idioma é: " + language);
        
        Locale pais = Locale.getDefault();
        System.out.println("O pais é: " + pais.getCountry());
        
        /* Locale é um método java que utiliza duas categorias
         display e format
        que armazenam códigos de línguas, que são consultadas por métodos
        de outras classes para determinar o tratamento de alguns tipos
        de dados */
        
        
        

    }
    
    
    
}
