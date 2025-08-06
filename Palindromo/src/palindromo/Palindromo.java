
package palindromo;
/*
* Solución al problema del palíndromo.
*
* Estructuras de datos utilizadas y por qué:
* Para este ejercicio decidí usar Java, ya que, es el lenguaje que mejor manejo, además, por el tipo de puesto, considero importante demostrar claridad en estructuras como mapas, listas y builders.
* El HashMap me permite contar fácilmente cuántas veces aparece cada carácter, lo cual es clave para saber si se puede formar un palíndromo o no. También uso una lista de entradas para poder ordenar los caracteres según su frecuencia, lo que ayuda a que el resultado final sea más coherente.
*
* Pasos de la solución (escritura procedimental):
* 1. Recibo la cadena del usuario desde consola.
* 2. Paso todo a minúsculas para evitar problemas con mayúsculas.
* 3. Recorro la cadena y uso un HashMap para contar cuántas veces aparece cada letra.
* 4. Reviso cuántos caracteres tienen una frecuencia impar. Si hay más de uno, ya sé que no se puede formar un palíndromo, así que devuelvo "Not Possible".
* 5. Si sí se puede, creo una lista a partir del mapa y la ordeno por frecuencia (de mayor a menor) para que el palíndromo tenga un orden más lógico y fácil de leer.
* 6. Con esa lista, empiezo a construir la mitad del palíndromo agregando la mitad de las veces que aparece cada carácter.
* 7. Si había un carácter impar, lo pongo en el centro del resultado.
* 8. Finalmente, le agrego la parte invertida de la primera mitad y listo: tengo un palíndromo válido (si era posible).
*/

import java.util.*;

public class Palindromo{

    public static String construirPalindromo(String input) {
        input = input.toLowerCase(); // Paso todo a minúscula

        // Contar cuántas veces aparece cada letra
        Map<Character, Integer> frecuencia = new HashMap<>();
        for (char c : input.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        int impares = 0;
        Character central = null;

        // Revisar cuántos caracteres tienen una cantidad impar
        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                impares++;
                central = entry.getKey(); // Guardo el carácter impar (si hay)
            }
        }

        // Si hay más de un carácter con frecuencia impar, no se puede
        if (impares > 1) {
            return "Not Possible";
        }

        // Ordenar por frecuencia para que el resultado sea más balanceado
        List<Map.Entry<Character, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder mitad = new StringBuilder();

        // Construir la mitad del palíndromo
        for (Map.Entry<Character, Integer> entry : listaOrdenada) {
            char c = entry.getKey();
            int count = entry.getValue() / 2;
            for (int i = 0; i < count; i++) {
                mitad.append(c);
            }
        }

        // Armar el palíndromo completo: mitad + centro (si hay) + mitad invertida
        StringBuilder resultado = new StringBuilder();
        resultado.append(mitad);
        if (central != null) {
            resultado.append(central);
        }
        resultado.append(new StringBuilder(mitad).reverse());

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String entrada = scanner.nextLine();
        System.out.println(construirPalindromo(entrada));
    }
}

/*
* Evaluación de la solución:
* Esta solución funciona bien incluso con cadenas largas (hasta 1000 caracteres, como dice el enunciado).
* Primero recorro la cadena una sola vez para contar las letras, así que no es nada pesado.
* Después, hago un pequeño ordenamiento de las letras según cuántas veces se repiten, pero como normalmente no hay muchas letras distintas, eso también es rápido.
* En resumen, el programa es bastante eficiente y no debería tener problemas de rendimiento con los datos que se piden.
*/
