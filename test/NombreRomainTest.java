package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import src.NombreRomain_I1;

public class NombreRomainTest {

    @Test
    

    public void Test1() {
        // ETANT DONNE le chiffre 1
        int chiffreArabe =1;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);

        assertEquals("I", nombreRomain);
        
    }

    @Test
    public void Test2() {
         // ETANT DONNE le chiffre 2
         int chiffreArabe =2;
         //QUAND on le convertir en nombre romain
         String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
 
         assertEquals("II", nombreRomain);
         
     }

     @Test
     public void Test3() {
          // ETANT DONNE le chiffre 3
          int chiffreArabe =3;
          //QUAND on le convertir en nombre romain
          String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
  
          assertEquals("III", nombreRomain);
          
      }
      @Test
      public void Test4() {
           // ETANT DONNE le chiffre 4
           int chiffreArabe =4;
           //QUAND on le convertir en nombre romain
           String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
   
           assertEquals("IV", nombreRomain);
           
       }
       @Test
       public void Test5() {
            // ETANT DONNE le chiffre 5
            int chiffreArabe =5;
            //QUAND on le convertir en nombre romain
            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
    
            assertEquals("V", nombreRomain);
            
        }
        @Test
        public void Test6() {
             // ETANT DONNE le chiffre 6
             int chiffreArabe =6;
             //QUAND on le convertir en nombre romain
             String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
     
             assertEquals("VI", nombreRomain);
             
         }
         @Test
         public void Test7() {
              // ETANT DONNE le chiffre 7
              int chiffreArabe =7;
              //QUAND on le convertir en nombre romain
              String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
      
              assertEquals("VII", nombreRomain);
              
          }
          @Test
          public void Test8() {
               // ETANT DONNE le chiffre 8
               int chiffreArabe =8;
               //QUAND on le convertir en nombre romain
               String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
       
               assertEquals("VIII", nombreRomain);
               
           }
           @Test
           public void Test9() {
                // ETANT DONNE le chiffre 9
                int chiffreArabe =9;
                //QUAND on le convertir en nombre romain
                String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
        
                assertEquals("IX", nombreRomain);
                
            }
}