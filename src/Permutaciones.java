import java.util.ArrayList;
import java.util.List;

public class Permutaciones {

    public static void generarPermutaciones(char[] caracteres) {
        List<String> resultados = new ArrayList<>();
        permutar(caracteres, 0, resultados);
        System.out.println("Permutaciones:");
        for (String permutacion : resultados) {
            System.out.println(permutacion);
        }
    }

    private static void permutar(char[] caracteres, int indice, List<String> resultados) {
        if (indice == caracteres.length - 1) {
            resultados.add(new String(caracteres));
            return;
        }

        for (int i = indice; i < caracteres.length; i++) {
            intercambiar(caracteres, i, indice);
            permutar(caracteres, indice + 1, resultados);
            intercambiar(caracteres, i, indice);
        }
    }

    private static void intercambiar(char[] caracteres, int i, int j) {
        char x = caracteres[i];
        caracteres[i] = caracteres[j];
        caracteres[j] = x;
    }
}
