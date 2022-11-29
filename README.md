# Actividades de Apoyo Java (01)
Este repositorio contiene diez actividades de apoyo para el curso __ANÁLISIS Y PROGRAMACIÓN EN JAVA (IFCD004PO)__. Están concebidas para practicar los conceptos básicos de las primeras unidades del temario. __Se recomienda haber leído el temario en su totalidad y haber hecho las autoevaluaciones antes de realizar estas actividades.__

## Índice:
1. [Actividad 01](#actividad-01)
2. [Actividad 02](#actividad-02)
3. [Actividad 03](#actividad-03)
4. [Actividad 04](#actividad-04)
5. [Actividad 05](#actividad-05)
6. [Actividad 06](#actividad-06)
7. [Actividad 07](#actividad-07)
8. [Actividad 08](#actividad-08)
9. [Actividad 09](#actividad-09)
10. [Actividad 10](#actividad-10)

### Actividad 01

Realizar un programa que imprima por el terminal la frase: `¡Hola Mundo!`, seguida de la versión de Java instalada en el equipo.

#### Pistas:

`System.out.println();` nos permitirá imprimir texto por el terminal. Después de mostrar el texto, hará un salto de línea. La version `System.out.print();` imprime por pantalla sin salto de línea. Con la versión `System.out.printf();` podemos mostrar texto con parámetros formateados (lo veremos más adelante).

`System.getProperty("java.version")` nos permite mostrar la versión de JDK instalada en el equipo.

#### Solución:

Solución Actividad 01.

### Actividad 02

Realizar un programa que solicite que se introduzca la edad, nombre y apellidos por el terminal y después lo muestre.

#### Pistas:

Vamos a utilizar un `String` para el nombre y otro para los apellidos, la edad la guardaremos en un `int`. Para solicitar datos por el terminal, usaremos la clase `Scanner`, que habrá que importarla al principio del programa con `import java.util.Scanner;`. Luego tendremos que crear un nuevo objeto `Scanner` de la siguiente manera: `Scanner teclado = new Scanner(System.in);`. Lo hemos llamado `teclado`, pero puede ser cualquier nombre. Para guardar lo que el usuario introduce por el teclado, es necesario asignarlo a una variable, de la siguiente manera: `variableEntero = nombreObjetoScanner.nextInt();`. 

#### Solución:

Solución Actividad 02.

### Actividad 03

Realizar un programa que pida dos notas __ENTERAS__ introducidas por teclado y calcule la media aritmética, mostrándola por el terminal.

#### Pistas:

La nota deberíamos guardarla en una variable de tipo `double` porque puede tener decimales. *Castear* una variable la convierte de un tipo a otro, podemos castear un `int` a double con `(double)` de la siguiente manera: `variableDecimal = (double) valorEntero`. Al castear de `double` a `int` perdemos la parte decimal.

#### Solución:

Solución Actividad 03.

### Actividad 04

Realizar un programa que pida un año de nacimiento y le muestra la edad actual al usuario, la edad que tendrá el año que viene y además de confirma si es adulto o no.

#### Pistas:

Podemos pedir que el usuario introduzca el año actual o bien, obtenerlo del sistema con `Year.now().getValue()`. El operador incremento (`++`) aumenta el uno el valor de una variable y es equivalente a esto: `variable = variable + 1`, pero nos ahorrará tiempo y código. Vamos a utilizar `if-else` y una variable `boolean` para determinar si la edad calculada se corresponde a la de un adulto.

#### Solución:

Solución Actividad 04.

### Actividad 05

Escribir un programa que solicite el radio de una circunferencia, luego que calculae la circunferencia y el área.

#### Pistas:

Puedes buscar por Internet las formulas para cualcuar la circunferencia y el area. Te resultarán de ayuda: `Math.PI` y `Math.pow(base, potencia)` para realizar los cáculos. Te recomiendo usar variables de tipo `double`.

#### Solución:

Solución Actividad 05.

### Actividad 06

Realizar un programa que solicite un número por consola y diga si es par o impar.

#### Pistas:

Para saber si un número es par o impar el operador módulo (`%`) puede serte de utilidad.

#### Solución:

Solución Actividad 06.

