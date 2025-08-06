
package poo;
/*

Este archivo contiene una explicación completa del diseño y estructura del proyecto

solicitado en el ejercicio de programación orientada a objetos para simular

un sistema de crawling e indexación.


*/

/*

Objetivo general del ejercicio:

Se trata de simular un sistema que recopila datos (documentos) desde diferentes

fuentes (como archivos, páginas web, bases de datos) y luego muestra esos documentos

por distintos medios (como una interfaz de búsqueda o un dashboard).

Todo esto se hace simulando el comportamiento, sin usar librerías reales ni conexión a internet.

Lo importante es usar principios de programación orientada a objetos correctamente.
*/

/*

2. Diseño orientado a objetos aplicado:

Clases:

Documento: representa un documento con título, contenido y fuente de origen.

FuenteArchivo, FuenteWeb, FuenteBaseDatos: simulan fuentes de datos.

Buscador: simula un sistema de búsqueda que devuelve algunos documentos.

SalidaSearchUI, SalidaDashboard: simulan diferentes formas de mostrar la información.

Interfaces:

FuenteDatos: define un contrato para cualquier clase que actúe como fuente de documentos.

Salida: define un contrato para cualquier clase que se encargue de mostrar resultados.

Polimorfismo:

Se logra gracias a las interfaces. Por ejemplo, puedo tener una lista de tipo FuenteDatos

que contenga objetos FuenteArchivo, FuenteWeb, etc., y tratarlos todos de forma unificada.

Encapsulamiento:

Cada clase tiene sus atributos privados y métodos públicos bien definidos.

La clase Documento es un buen ejemplo: encapsula sus atributos y los expone con getters.

Abstracción:

Se separa el "qué hace" del "cómo lo hace". Por ejemplo, FuenteDatos define el método

obtenerDocumentos(), pero cada clase fuente lo implementa a su manera.

Separación de responsabilidades:

Cada clase tiene una única tarea clara. El main (App.java) solo coordina.
*/

/*

3. ¿Qué NO se pidió?

No era necesario usar interfaces gráficas.

No se necesitaban librerías externas, conexiones reales ni archivos.

Todo se puede simular con mensajes por consola y clases bien organizadas.
*/

/*

4. Ejecución y flujo del programa:

En App.java ocurre lo siguiente:

Se crean varias fuentes de datos y se almacenan en una lista.

Se llama a obtenerDocumentos() de cada fuente para traer documentos simulados.

Se hace una búsqueda simulada usando la clase Buscador.

Los documentos encontrados se muestran por consola usando dos tipos de salida:

la interfaz de búsqueda y el dashboard.
*/

/*

5. Resultado:

El proyecto se ejecuta correctamente en NetBeans.

La salida por consola muestra claramente cómo se "cargan" documentos, cómo se

hace una búsqueda y cómo se presentan los resultados.

El diseño es modular, flexible y se adapta fácilmente si se agregan más fuentes o salidas.
*/
public class Explicacion {
  
}
