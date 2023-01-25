package src;

public class NombreRomain_I1 {

    public static String Convertir(int nombreArabe) {
        int rest = nombreArabe;
        String res = "";
        do {
            if (rest >= 10) {
                res += "X";
                rest -= 10;
            } else {
                if (rest == 9) {
                    res += "IX";
                    rest -= 9;
                } else {
                    if (rest >= 5) {
                        res += "V";
                        rest -= 5;
                    } else {
                        if (rest % 5 == 4) {
                            res += "IV";
                            rest -= 4;
                        } else {
                            res += "I".repeat(rest);
                            rest -= rest;
                        }
                    }

                }
            }
        } while (rest != 0 | rest < 0);
        return res;
    }
}
