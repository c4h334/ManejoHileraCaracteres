# Tarea 2 - Manejo de hileras de caracteres
## Desarrollo de Software II
Anderson Jesús Monge Alvarado, C4H334

### I Parte - Investigación

#### 1. Debe investigar y mencionar qué es una hilera de caracteres, y algunos ejemplos.

> Las hileras de caracteres son objetos que se utilizan para almacenar cadenas de texto.

**Fuente:** https://www.slideserve.com/vega/manipulaci-n-de-caracteres-e-hileras-de-texto

**Ejemplos:**

```
// Hilera sencilla
String nombre = "Anderson";

// Hilera con números
String cédula = "208740560";

// Hilera con letras y números
String carné = "C4H334";

// Hilera con símbolos
String correo = "anderson.monge@ucr.ac.cr"

// Hilera con saltos de línea
String tarjeta = "Educación superior:\nUniversidad de Costa Rica";
```

#### 2. Debe marcar la diferencia entre un carácter  y una hilera. 

> Un char representa un único carácter Unicode de 16 bits en Java, como una letra, un dígito o un símbolo.  Sin embargo, String es una clase esencial en Java. Una cadena consta de uno o varios caracteres. La primera diferencia entre char y String en Java es que char es un tipo primitivo, mientras que String es una clase. En otras palabras, es un tipo de referencia.

**Fuente:** https://www.baeldung.com/java-char-vs-string

#### 3. Investigue y mencione qué operaciones se pueden realizar con una hilera. 

- Método para saber la cantidad de caracteres en una hilera:
```
int cantidadCaracteres = nombre.length();
System.out.println("El nombre " + nombre + " tiene  " + cantidadCaracteres + " caracteres");
// Imprime "El nombre Anderson tiene 8 caracteres"
```

- Método para localizar un caracter o más dentro de una hilera:
```
System.out.println(nombre.indexOf("er")); // Imprime 4, la ubicación de 'e'
```

- Método para comparar dos hileras de caracteres
```
String str1 = ", hola!";
String str2 = ", hola!";

System.out.println(str1.equals(str2)); // Imprime true, porque ambas hileras son idénticas
```

- Método para concatenar dos hileras en una nueva
```
System.out.println(nombre.concat(str1)); // Imprime "Anderson, hola!", tanto el nombre como el str1
```

- Métodos para convertir una hilera a mayúsculas o minúsculas
```
System.out.println(nombre.toUpperCase()); // Imprime "ANDERSON"

String segundoNombre = JESUS;
System.out.println(segundoNombre.toLowerCase()); // Imprime "jesus"
```
**Fuente:** https://www.ionos.com/es-us/digitalguide/paginas-web/desarrollo-web/java-strings/