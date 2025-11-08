package operaciones;

public class Complemento {
    private boolean signo;
    private static final int[] numeroBits = {8, 16, 32
  //complemento 1                                          
 public static String complemento1(String numero) {
        if (!Conversion.esValido(numero, 0, 2)) { 
            return "Error: el número ingresado no es binario.";
        }

        String c1 = "";
        for (int i = 0; i < numero.length(); i++) {
            char bit = numero.charAt(i);
            if (bit == '0') {
                c1 += '1';
            } else {
                c1 += '0';
            }
        }
        return c1;
    }

    //complemento 2

       public static String complemento2(String numero) {
        if (!Conversion.esValido(numero, 0, 2)) {
            return "Error: el número ingresado no es binario.";
        }

        String c2 = "";
        boolean encontrado = false;


        for (int i = numero.length() - 1; i >= 0; i--) {
            char bit = numero.charAt(i);

            if (encontrado) {
                // Después del primer 1: invertir los bits
                if (bit == '0') {
                    c2 = '1' + c2;
                } else {
                    c2 = '0' + c2;
                }
            } else {
                // Copiamos bits hasta encontrar el primer 1
                c2 = bit + c2;
                if (bit == '1') {
                    encontrado = true; 
                }
            }
        }

        return c2;
    }
    
}
