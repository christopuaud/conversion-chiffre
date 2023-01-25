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



}