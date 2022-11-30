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

Realizar un programa que __imprima__ por el terminal la frase: `¡Hola Mundo!`, seguida de __la versión de Java instalada en el equipo.__

#### Pistas:

El método siguiente nos permitirá imprimir texto por el terminal. Después de mostrar el texto, imprimirá un __salto de línea__. No es necesario que tome ningún parámetro (es decir, que los paréntesis pueden estar vacíos):
```
System.out.println()
```
El siguiente método imprime por pantalla una cadena de caracteres sin salto de línea, tenemos que pasar una __cadena de caracteres obligatoriamente entre comillas dobles__:
```
System.out.print("cadena de caracteres")
```
Con el siguiente método podemos mostrar texto con parámetros formateados (lo veremos más adelante).
```
System.out.printf("A continuación, miprimimos el valor de la variable 'numero': %d", numero);
```
El siguiente método nos permite mostrar la versión de __JDK__ instalada en el equipo:
```
System.getProperty("java.version")
```

#### Solución:

[Solución Actividad 01](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act01.java)

### Actividad 02

Realizar un programa que solicite que se __introduzca la edad, nombre y apellidos__ por la terminal y después __lo muestre__.

#### Pistas:

Vamos a utilizar un `String` para el nombre y otro para los apellidos, la edad la guardaremos en una variable de tipo entero `int`. Para solicitar datos por el terminal, usaremos __la clase__ `Scanner`, que habrá que importarla al principio del programa con la siguiente línea de código:
```
import java.util.Scanner;
```
Luego tendremos que crear un nuevo __objeto__ `Scanner` de la siguiente manera: 
```
Scanner teclado = new Scanner(System.in);
```
Lo hemos llamado a esta variable `teclado`, pero puede ser cualquier nombre. Para guardar lo que el usuario introduce por la terminal, es necesario __asignarlo a una variable__, de la siguiente manera: 
```
variableEntero = nombreObjetoScanner.nextInt();
``` 

#### Solución:

[Solución Actividad 02](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act02.java)

### Actividad 03

Realizar un programa que pida dos notas __ENTERAS__ (tienen que guardarse en un `int`) introducidas por teclado y calcule __la media aritmética__, mostrándola por el terminal. Es importante tener en cuenta que el resultado de la media aritmética puede contener __decimales__.

#### Pistas:

La nota deberíamos guardarla en una variable de tipo `double` porque puede tener decimales. *Castear* una variable la convierte de un tipo a otro, podemos castear un `int` a `double` con `(double)` de la siguiente manera: 
```
variableDecimal = (double) valorEntero;
```
Cuando realizamos un casteo, __es posible que se pierdan datos__, así que hay que tener mucho cuidado. Por ejemplo, al castear de `double` a `int` perdemos la parte decimal.

#### Solución:

[Solución Actividad 03](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act03.java)

### Actividad 04

Realizar un programa que pida un __año de nacimiento__, mostrando la edad actual al usuario. Después mostrará la edad que tendrá __el año que viene__ y además, el programa confirmará __si es adulto o no__.

#### Pistas:

Podemos pedir que el usuario introduzca el año actual para calcular la edad, pero también podemos obtenerlo del sistema con: 
```
Year.now().getValue()
```
El operador incremento (`++`) aumenta el uno el valor de una variable y es equivalente a esto: 
```
variable = variable + 1;
``` 
Es una forma de ahorrar tiempo y código. Vamos a utilizar una sentencia condicional `if-else` y una variable `boolean` para determinar si la edad calculada se corresponde a la de un adulto.

#### Solución:

[Solución Actividad 04](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act04.java)

### Actividad 05

Escribir un programa que solicite el __radio__ de una circunferencia, luego que calcule la __circunferencia__ y el __área__. La fórmula de la circunferencia es:

__C = 2π * r__

La fórmula para calcular el área es:

__A = π * r<sup>2</sup>__

#### Pistas:

Puedes utilizar la clase `Math` de Java. Te resultarán de ayuda los métodos: `Math.PI` y `Math.pow(base, potencia)` para realizar los cáculos. Te recomiendo usar variables de tipo `double`, porque los resultados serán números reales.

#### Solución:

[Solución Actividad 05](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act05.java)

### Actividad 06

Realizar un programa que solicite un número por consola y diga si es par o impar.

#### Pistas:

Para saber si un número es par o impar el operador módulo (`%`) puede serte de utilidad.

#### Solución:

[Solución Actividad 06.](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act06.java)

### Actividad 07

REalizar un programa que pregunte al preguntas usuario si está lloviendo, si tiene tareas en casa y si tiene que ir a comprar. Si está lloviendo o tiene tareas pendientes, no podrá salir a la calle, pero si tiene que ir a comprar, siempre tendrá que salir de casa. El usuario tiene que responder como 'true' or 'false'. En función de sus respuestas el programa le confirma al usuario si puede o no salir a la calle

#### Pistas:

Para realizar el ejercicio es necesario utilizar variables `boolean`, además de emplear los operadores de comparación en una sentencia `if-else`.

#### Solución:

[Solución Actividad 07.](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act07.java)

### Actividad 08

Realizar un programa que solicite un número por consola y muestre su valor absoluto. El valor absoluto de un número real cualquiera es el mismo número, pero con signo positivo.

#### Pistas:

Esta actividad se puede completar con una sentencia `if-else` o el operador ternario, que tiene esta estructura: `resultado = (condicion) ? valor1 : valor2`. También es posible emplear `Math.abs(variable)`. 

#### Solución:

[Solución Actividad 08.](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act08.java)

### Actividad 09

Realizar un programa que solicite un número decimal y lo muestra redondeado.

#### Pistas:

Puedes utilizar `Math.round(variable)`, pero no es la única solución posible.

#### Solución:

[Solución Actividad 09.](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act09.java)

### Actividad 10

Realizarun programa que calcule el salario de un empledo, introduciendo las horas que ha trabajado esa semana. El salario puede ser, por ejemplo, de 12 € la hora.

#### Pistas:

Es posible emplear una constante (escrita en mayúsculas) para establecer el sueldo euros/hora. En el programa podrías emplear `System.out.printf("valor de variable: %d", varible)`. Mediante `%d` dentro del `String` que quieres mostrar, puedes imprimir la variable que se envía como parámetro.

#### Solución:

[Solución Actividad 10.](https://github.com/PublioElio/ActividadesApoyoJava01/blob/main/Act10.java)
