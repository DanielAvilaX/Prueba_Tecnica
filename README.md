<h1>Palíndromo con sentido semántico</h1>
<div align="center">
  <p align="left">
    <img src="https://img.shields.io/badge/STATUS-FINALIZADO-blue">
  </p>
</div>

<p>
  Este repositorio contiene el código fuente de una aplicación de consola desarrollada en Java, que permite identificar si una cadena de texto puede reordenarse para formar un palíndromo válido. 
  En caso afirmativo, genera una versión coherente del palíndromo. Si no es posible, retorna <code>"Not Possible"</code>.
</p>

<h2>Tecnologías usadas</h2>
<ul>
  <li>Java 17</li>
  <li>NetBeans IDE 22</li>
</ul>

<h2>📂 Estructura del proyecto</h2>
<pre>
palindromo/
├── src/
│   └── Palindromo.java
</pre>

<h2>Lógica del algoritmo</h2>
<ul>
  <li>Convierte la entrada a minúsculas.</li>
  <li>Cuenta la frecuencia de cada carácter usando <code>HashMap</code>.</li>
  <li>Verifica si puede existir un palíndromo con esas frecuencias.</li>
  <li>Ordena los caracteres por su frecuencia para generar un resultado más legible.</li>
  <li>Construye el palíndromo utilizando la mitad izquierda, el carácter central (si aplica) y la mitad derecha en reversa.</li>
</ul>

<h2>Ejecución del programa</h2>
<p>Puedes correr el proyecto directamente en NetBeans 22. Solo ejecuta <code>Palindromo.java</code> y se te pedirá que ingreses una cadena por consola.</p>

<pre>
Input: laTinaLavaAnita
Output: anitalavalatina
</pre>

<hr>

<h1>📁 Sistema de Crawling e Indexación (POO)</h1>
<div align="center">
  <p align="left">
    <img src="https://img.shields.io/badge/STATUS-FINALIZADO-blue">
  </p>
</div>

<p>
  Este repositorio contiene una simulación de un sistema de crawling y presentación de documentos indexados. 
  El objetivo es representar mediante conceptos de <strong>Programación Orientada a Objetos</strong> un sistema capaz de recolectar información desde distintas fuentes y mostrar resultados en diferentes salidas, sin conectarse a servicios reales.
</p>

<h2>⚙️ Tecnologías usadas</h2>
<ul>
  <li>Java 17</li>
  <li>NetBeans IDE 22</li>
</ul>

<h2>Diseño general</h2>
<p>Se utilizaron <strong>interfaces</strong>, <strong>clases abstractas</strong>, <strong>polimorfismo</strong> y una fuerte <strong>separación de responsabilidades</strong> para representar cada componente del sistema:</p>

<h3>🗂️ Paquetes y clases principales:</h3>
<pre>
poo-crawling/
├── src/
│   ├── Documento.java
│   ├── FuenteDatos.java
│   ├── FuenteArchivo.java
│   ├── FuenteWeb.java
│   ├── FuenteBaseDatos.java
│   ├── Salida.java
│   ├── SalidaDashboard.java
│   ├── SalidaSearchUI.java
│   ├── Buscador.java
│   └── App.java
</pre>

<h2>🧩 Componentes</h2>
<ul>
  <li><strong>Documento.java:</strong> Contiene el modelo con atributos: <code>titulo</code>, <code>contenido</code> y <code>fuenteOrigen</code>.</li>
  <li><strong>FuenteDatos (interfaz):</strong> Define el contrato para todas las fuentes que devuelven documentos simulados.</li>
  <li><strong>Clases que implementan FuenteDatos:</strong> FuenteArchivo, FuenteWeb, FuenteBaseDatos.</li>
  <li><strong>Salida (interfaz):</strong> Permite mostrar los documentos de diferentes formas.</li>
  <li><strong>Clases que implementan Salida:</strong> SalidaSearchUI, SalidaDashboard.</li>
  <li><strong>Buscador.java:</strong> Simula la búsqueda de documentos, siempre retornando una sublista fija.</li>
  <li><strong>App.java:</strong> Clase principal. Orquesta las fuentes, simula la búsqueda y muestra los resultados.</li>
</ul>

<h2>Cómo ejecutar</h2>
<ol>
  <li>Abre el proyecto en <strong>NetBeans 22</strong>.</li>
  <li>Corre la clase <code>App.java</code>.</li>
  <li>Verás en consola los documentos recolectados, una búsqueda simulada y la presentación de resultados por dos salidas diferentes.</li>
</ol>

<h2>📸 Ejemplo de salida por consola</h2>
<pre>
Obteniendo documentos desde archivo...
Obteniendo documentos desde web...
Obteniendo documentos desde base de datos...

Simulando búsqueda de: ejemplo

Mostrando resultados en interfaz de búsqueda:
[Archivo] Archivo1: Contenido archivo 1
[Archivo] Archivo2: Contenido archivo 2

Mostrando resultados en el dashboard:
[Archivo] Archivo1: Contenido archivo 1
[Archivo] Archivo2: Contenido archivo 2
</pre>

<h2>Objetivo del proyecto</h2>
<ul>
  <li>Modelar conceptos de crawling e indexación usando POO.</li>
  <li>Aplicar principios como interfaces, herencia y encapsulamiento.</li>
  <li>Simular el flujo completo: origen → búsqueda → visualización.</li>
</ul>

<h2>Notas</h2>
<blockquote>
  Este proyecto fue desarrollado con fines académicos.<br>
  No requiere bases de datos ni frameworks externos. Todo el contenido es ficticio y simulado. Desarrollado por Daniel Avila, ingeniero de software.
</blockquote>
