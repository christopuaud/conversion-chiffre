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
}