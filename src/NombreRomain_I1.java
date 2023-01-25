package src;

public class NombreRomain_I1 {

    public static String Convertir(int nombreArabe) {
        String res;
        if (nombreArabe % 5 == 0) {
            res = "V";
        } else {
            if (nombreArabe % 5 == 4) {
                res = "IV";
            } else {

                res = "I".repeat(nombreArabe);
            }
        }

        return res;
    }
}
