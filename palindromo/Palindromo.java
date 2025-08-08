package palindromo;

/**
 * Este programa recibe una cadena de caracteres y determina si se puede reorganizar
 * para formar un palíndromo. Si es posible, construye uno válido y lo muestra.
 * En caso contrario, imprime "Not Possible".
 *
 * Decidí hacerlo en Java porque es el lenguaje que mejor manejo y porque el ejercicio
 * requiere una lógica clara usando estructuras como mapas, iteraciones y builders.
 *
 * En cuanto a las estructuras de datos:
 * - Utilicé un HashMap para contar cuántas veces aparece cada carácter, ya que es muy eficiente para eso.
 * - También usé StringBuilder porque permite construir cadenas de forma más óptima que concatenar con +.
 *
 * Lógica del programa paso a paso:
 * 1. Paso toda la cadena a minúsculas para evitar que 'A' y 'a' se traten como distintos.
 * 2. Recorro la cadena para contar la frecuencia de cada carácter.
 * 3. A medida que cuento, voy llevando el control de cuántos caracteres tienen una frecuencia impar.
 *    Esto es importante porque:
 *      - Si la longitud de la cadena es par, **ningún carácter debe tener frecuencia impar**.
 *      - Si la longitud es impar, **solo uno puede tener frecuencia impar**.
 *    Si no se cumple, directamente devuelvo "Not Possible".
 * 4. Si sí es posible construir el palíndromo, empiezo a formar la primera mitad usando la mitad de la cantidad
 *    de cada carácter.
 * 5. Si había un carácter con frecuencia impar, lo coloco en el centro.
 * 6. Luego simplemente agrego la reversa de la primera mitad, y listo: tengo el palíndromo.
 */


import java.util.*;

public class Palindromo {

    public static String construirPalindromo(String input) {
        input = input.toLowerCase();
        int n = input.length();

        // Contamos la frecuencia de cada carácter
        Map<Character, Integer> frecuencia = new HashMap<>();
        int impares = 0;

        for (char c : input.toCharArray()) {
            int count = frecuencia.getOrDefault(c, 0) + 1;
            frecuencia.put(c, count);

            // Si el nuevo conteo es impar, sumamos 1, si es par, restamos 1
            if (count % 2 == 0) {
                impares--;
            } else {
                impares++;
            }
        }

        // Verificamos posibilidad del palíndromo antes de continuar
        if ((n % 2 == 0 && impares != 0) || (n % 2 != 0 && impares != 1)) {
            return "Not Possible";
        }

        StringBuilder mitad = new StringBuilder();
        String central = "";

        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            // Si la cantidad es impar, ese carácter va al centro (solo uno)
            if (count % 2 != 0) {
                central = String.valueOf(c);
            }

            // Añadir la mitad de las veces a la primera mitad
            for (int i = 0; i < count / 2; i++) {
                mitad.append(c);
            }
        }

        // Armamos el palíndromo: mitad + centro (si hay) + mitad invertida
        StringBuilder resultado = new StringBuilder();
        resultado.append(mitad);
        resultado.append(central);
        resultado.append(mitad.reverse());

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String entrada = scanner.nextLine();
        System.out.println(construirPalindromo(entrada));
    }
}
