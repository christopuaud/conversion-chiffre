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
            @Test
            public void Test10() {
                 // ETANT DONNE le chiffre 10
                 int chiffreArabe =10;
                 //QUAND on le convertir en nombre romain
                 String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
         
                 assertEquals("X", nombreRomain);
                 
             }
             @Test
             public void Test11() {
                  // ETANT DONNE le chiffre 11
                  int chiffreArabe =11;
                  //QUAND on le convertir en nombre romain
                  String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
          
                  assertEquals("XI", nombreRomain);
                  
              }
              @Test
              public void Test12() {
                   // ETANT DONNE le chiffre 12
                   int chiffreArabe =12;
                   //QUAND on le convertir en nombre romain
                   String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
           
                   assertEquals("XII", nombreRomain);
                   
               }
               @Test
               public void Test13() {
                    // ETANT DONNE le chiffre 13
                    int chiffreArabe =13;
                    //QUAND on le convertir en nombre romain
                    String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
            
                    assertEquals("XIII", nombreRomain);
                    
                }
                @Test
                public void Test14() {
                     // ETANT DONNE le chiffre 14
                     int chiffreArabe =14;
                     //QUAND on le convertir en nombre romain
                     String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
             
                     assertEquals("XIV", nombreRomain);
                     
                 }
                 @Test
                 public void Test15() {
                      // ETANT DONNE le chiffre 15
                      int chiffreArabe =15;
                      //QUAND on le convertir en nombre romain
                      String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
              
                      assertEquals("XV", nombreRomain);
                      
                  }
                  @Test
                  public void Test16() {
                       // ETANT DONNE le chiffre 16
                       int chiffreArabe =16;
                       //QUAND on le convertir en nombre romain
                       String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
               
                       assertEquals("XVI", nombreRomain);
                       
                   }
                   @Test
                   public void Test17() {
                        // ETANT DONNE le chiffre 17
                        int chiffreArabe =17;
                        //QUAND on le convertir en nombre romain
                        String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                
                        assertEquals("XVII", nombreRomain);
                        
                    }
                    @Test
                    public void Test18() {
                         // ETANT DONNE le chiffre 8
                         int chiffreArabe =18;
                         //QUAND on le convertir en nombre romain
                         String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                 
                         assertEquals("XVIII", nombreRomain);
                         
                     }
                     @Test
                     public void Test19() {
                          // ETANT DONNE le chiffre 19
                          int chiffreArabe =19;
                          //QUAND on le convertir en nombre romain
                          String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                  
                          assertEquals("XIX", nombreRomain);
                          
                      }
                      @Test
                      public void Test20() {
                           // ETANT DONNE le chiffre 20
                           int chiffreArabe =20;
                           //QUAND on le convertir en nombre romain
                           String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                   
                           assertEquals("XX", nombreRomain);
                           
                       }
                       @Test
                       public void Test39() {
                            // ETANT DONNE le chiffre 39
                            int chiffreArabe =39;
                            //QUAND on le convertir en nombre romain
                            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                    
                            assertEquals("XXXIX", nombreRomain);
                            
                        }
                        @Test
                       public void Test49() {
                            // ETANT DONNE le chiffre 49
                            int chiffreArabe =49;
                            //QUAND on le convertir en nombre romain
                            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                    
                            assertEquals("XLIX", nombreRomain);
                            
                        }
                        @Test
                        public void Test99() {
                            // ETANT DONNE le chiffre 99
                            int chiffreArabe =99;
                            //QUAND on le convertir en nombre romain
                            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                    
                            assertEquals("XCIX", nombreRomain);
                            
                        }
                        @Test
                        public void Test200() {
                            // ETANT DONNE le chiffre 200
                            int chiffreArabe =200;
                            //QUAND on le convertir en nombre romain
                            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                    
                            assertEquals("CC", nombreRomain);
                            
                        }
                        @Test
                        public void Test250() {
                            // ETANT DONNE le chiffre 250
                            int chiffreArabe =250;
                            //QUAND on le convertir en nombre romain
                            String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
                            assertEquals("CCL", nombreRomain);
                            
                        }
}