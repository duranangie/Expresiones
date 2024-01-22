# Expresiones, sentencias y bloques

## Expresiones

una expresion es una costruccion formada por variables, operadores e invocaciones de metodos, que se forman de acuerdo con la sintaxis del lenguaje.

## Aritmetica de coma flotante.

La aritmética de coma flotante es un mundo especial en el que las operaciones comunes pueden comportarse de forma inesperada. Considere el siguiente código.

````
package com.expresiones;
public class Main {
    public static void main(String[] args) {
        double d1=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println("d1 == 1?"+(d1==1.0));

    }
}
````
al realizar esto nos imprimer si es fale/true.

## Declaraciones

Los enunciados son más o menos equivalentes a las oraciones en lenguajes naturales. Un enunciado forma una unidad completa de ejecución. Los siguientes tipos de expresiones se pueden convertir en una instrucción terminando la expresión con un punto y coma ().;

* Expresiones de asignación
* Cualquier uso o ++--
* Invocaciones de métodos
* Expresiones de creación de objetos
* Estas instrucciones se denominan instrucciones de expresión. A continuación, se muestran algunos ejemplos de instrucciones de expresión.

````
        
        /*se crea una declaracion  */
        double aValue = 900.32;
        /*se realiza el incremento */
        aValue++;

        /*imprimir methodo de llamado*/
        System.out.println("hola mundo!");

        /*object creacion de declaracion */
        MyObject obj=new MyObject();

````

## Bloques

Un bloque es un grupo de cero o mas instrucciones entre llaves equilibradas  y se pueden usar en cualquier lugar donde se permita una sola instruccion.
````
package com.expresiones;
public class Main {
    public static void main(String[] args) {

        boolean condicion = true;

        if (condicion) { /*primer bloque */
                System.out.println("la condicion es verdadera");
        }/*fin del bloque uno */ 
       else{/*Segundo bloque */
            System.out.println("La condicion es falsa");
        }/*fin del bloque dos */


    }
}
````

## Instrucciones de flujo de control

### La instrucción If-Then

Esta instruccion es la mas basica de todas ejemplo: la clase podría permitir que los frenos disminuyan la velocidad de la bicicleta solo si la bicicleta ya está en movimiento. Una posible implementación del método podría ser la siguiente:

````
package com.expresiones;
public class Main {
    public static void main(String[] args) {

     /*la clase podría permitir que los frenos disminuyan la
      velocidad de la bicicleta solo si la bicicleta ya está en movimiento. 
      Una posible implementación del método podría ser la siguiente: */

      boolean isMoving = true;
     int currentSpeed = 100;

    

        if (isMoving) 
            currentSpeed--;
            System.out.println(currentSpeed);
        }


    }

````

## La instrucción if-then-else

La instrucción proporciona una ruta secundaria de ejecución cuando una cláusula "if" se evalúa como . Podría usar una declaración en el método para tomar alguna acción si los frenos se aplican cuando la bicicleta no está en movimiento. En este caso, la acción consiste simplemente en imprimir un mensaje de error que indique que la bicicleta ya se ha detenido.


````
package com.expresiones;
public class Main {
    public static void main(String[] args) {

     /*la clase podría permitir que los frenos disminuyan la
      velocidad de la bicicleta solo si la bicicleta ya está en movimiento. 
      Una posible implementación del método podría ser la siguiente: */

        boolean isMoving = false;
        int currentSpeed = 100;

        if (isMoving == true) {
            currentSpeed --;
            System.out.println(currentSpeed);
            
        }else{
            System.err.println("la bicicleta no esta en movimiento");
        }
    }
}
````

## else-if
El siguiente programa, , asigna una calificación basada en el valor de la puntuación de una prueba: una A para una puntuación del 90% o superior, una B para una puntuación del 80% o superior, y así sucesivamente.

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {

        /*
         * El siguiente programa, , asigna una calificación basada en el valor de la
         * puntuación de una prueba: una A para una puntuación del 90% o superior,
         * una B para una puntuación del 80% o superior, y así sucesivamente.
         */

        // A,B,C,D,F

        int nota = 59;
        String grado;

        if (nota >= 90) {
            grado = "A";
            System.out.println("Felicitaciones haz pasado la prueba exitosamente! haz sacado " + grado);

        } else if (nota >= 80) {
            grado = "B";
            System.out.println("Felicitaciones haz pasado la prueba exitosamente! haz sacado " + grado);
        } else if (nota >= 70) {
            grado = "C";
            System.out.println(" haz pasado la prueba! haz sacado " + grado);
        } else if (nota >= 60) {
            grado = "D";
            System.out.println(" haz perdido la prueba! haz sacado " + grado);

        } else {
            grado = "F";
            System.out.println(" haz perdido la prueba!, tendras que repetirla haz sacado " + grado);

        }

    }

}

````

## Las sentencias while y do-while

ok hay varias formas de declarar el ciclo while, en este caso vemos la forma de generar un contador que cuente de 1 hasta 10.
````
package com.expresiones;

public class Main {
    public static void main(String[] args) {

       int count = 1;
    
     while (count<11){
        System.out.println(count);
        count ++;
     }

    }

    

}

````  

para crear bucles infinitos se ingresa de la siguiente forma:

```
package com.expresiones;

public class Main {
    public static void main(String[] args) {

          
     while (true){
      System.out.println("infinity");
     }

    }

    

}


```

tambien existe un ciclo llamado do - while la diferencia de este es que evalua la expresion desde la parte inferior del bucle en lugar de la superior como se muestra a continuacion.

```
package com.expresiones;

public class Main {
    public static void main(String[] args) {

        int count=1;
        do {
            System.out.println("el contado en este ciclo es: "+ count);
            count ++;
        } while (count<11);
    }

    

}
```

## Declaracion del for

este ciclo se expresa de la siguiente manera

```
for (inicilization; termination; increment){
    statement(s)
}
```

español

```
for (inicialización; terminación; incremento){
    declaración(s)
}
```


Al usar esta versión de la instrucción for, tenga en cuenta que:

* La expresión de inicialización inicializa el bucle; Se ejecuta una vez, cuando comienza el bucle.
* Cuando la expresión de terminación se evalúa como , el bucle termina.false
* La expresión de incremento se invoca después de cada iteración a través del bucle; Es perfectamente aceptable que esta expresión incremente o disminuya un valor.

- ejemplo: 

El siguiente programa, , utiliza la forma general de la instrucción para imprimir los números del 1 al 10 en la salida estándar:

```
package com.expresiones;

public class Main {
    public static void main(String[] args) {



    for(int i = 1 ; i<=10 ; i++){
        System.out.println(i);
    }
    
    }
    

}

```

Para generar un bucle infinito se realiza de la siguiente forma:
````
package com.expresiones;

public class Main {
    public static void main(String[] args) {



    for(;;){
        System.out.println("hi");
    }
    
    }
    

}
````

tambien es muy comun usar el ciclo for para recorrer matrices y colecciones , esta forma se conoce como for mejorada, para que los bucles sean mas faciles de leer.
ejemplo:

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {

        int[] matrizInicial={1,2,3,4,5,6,7,8,9,10};

        for(int i : matrizInicial){
            System.out.println("la matriz tiene "+i+" numeros");
        }
    }
    

}

````

Se recomienda utilizar esta forma de la declaración en lugar de la forma general siempre que sea posible.for


## La declaración de ruptura

La instrucción tiene dos formas: etiquetada y no etiquetada. Viste la forma sin etiquetar en la discusión anterior de la declaración. También puede usar un bucle sin etiqueta para terminar un bucle ,or Loop, como se muestra en el siguiente programa:

````
    package com.expresiones;

public class Main {
    public static void main(String[] args) {

        int[][] arraysbreak={
            { 32,   87,    3, 589},
            {12, 1076, 2000,   8},
            { 622,  127,   77, 955 }
        };   
    
        int buscarNumero = 12;
        int i;
        int j=0;
        boolean encontrado=false;

        buscar:
        for(i=0; i<arraysbreak.length;i++){
            for (j=0 ; j < arraysbreak[i].length; j++) {
                if(arraysbreak[i][j]== buscarNumero){
                    encontrado= true;
                    break buscar;
            }
       }
    
    }
    if(encontrado){
        System.out.println("se encontro "+buscarNumero+" en la matriz en posicion "+i+ " - "+j);

    }else{
        System.out.println("no se encontro el numero");
    }

}

}
````

## Declaracion Continue

La instrucción omite la iteración actual de un bucle , , or. El formulario sin etiquetar salta al final del cuerpo del bucle más interno y evalúa la expresión booleana que controla el bucle. El siguiente programa, , recorre un , contando las ocurrencias de la letra . Si el carácter actual no es un , la instrucción omite el resto del bucle y pasa al siguiente carácter. Si es un , el programa incrementa el número de letras.

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {

        /*declaracion de continue */
    
        String buscarNombre = "juan carlos y matthew"+"matthew y juan carlos";
        int max= buscarNombre.length();
        int numA = 0;
    

        for(int i =0 ; i<max;i++){
            if(buscarNombre.charAt(i)!='a')
            continue;
            numA ++;
        }
        System.out.println("la cantidad de a que esxisten es "+numA);
    }
}
````

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {

        String nombreString = "Look for a subname in me";
        String subnombre = "sub";
        boolean encontrado = false;

        int max = nombreString.length() - subnombre.length();

        test:
         for (int i = 0; i <= max; i++) {   
            int n = subnombre.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (nombreString.charAt(j++) != subnombre.charAt(k++)) {
                    continue test;

                }

            }
            encontrado = true;
            break test;

        }

        System.out.println(encontrado ? "se encontro" : "esto");

    }
}
````


## La declaración de devolución
La siguiente instrucción de bifurcación es la instrucción. La instrucción sale del método actual y el flujo de control vuelve al lugar donde se invocó el método. La instrucción tiene dos formas: una que devuelve un valor y otra que no. Para devolver un valor, simplemente coloque el valor (o una expresión que calcule el valor) después de la palabra clave.

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {
    
        int n = 5; // Puedes cambiar este valor según tus necesidades
    Object resultado = fibonacci(n);
    System.out.println(resultado);

    
    }

    public static Object fibonacci(int n) { 
        if (n == 0 || n == 1) {
          return n;
        } else {
          return "El resultado es " + fibonacci(n - 1)+ fibonacci(n - 2);
        }
      }
    }      



    
````
## La declaración de rendimiento


La última instrucción de ramificación es la instrucción. La instrucción sale de la expresión actual en la que se encuentra. Una instrucción siempre va seguida de una expresión que debe producir un valor. Esta expresión no debe ser . El valor de esta expresión es el valor producido por la expresión envolvente.yield


````
class Test {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public String calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> "week-end";
                default -> {
                    int remainingWorkDays = 5 - d.ordinal();
                    yield remainingWorkDays;
                }
            };
    }
}

````

* NOTA: APARTIR DEL 2022 ESTA FUNCION DEJO DE ESTAR EN JAVA 



##  Uso de instrucciones switch para controlar el flujo del programa


La sentencia es una de las cinco sentencias de flujo de control disponibles en el lenguaje Java. Permite cualquier número de rutas de ejecución. Una instrucción toma una variable selectora como argumento y utiliza el valor de esta variable para elegir la ruta que se ejecutará. switchswitch

Debe elegir el tipo de variable selectora entre los siguientes tipos:

byte, , , y tipos de datos primitivosshortcharint
Character, , , y tipos de envolturaByteShortInteger
Tipos enumerados
el tipo. String
Vale la pena señalar que los siguientes tipos primitivos no se pueden usar para el tipo de la variable selectora: , , y . booleanlongfloatdouble

Veamos un primer ejemplo de una afirmación. switch

````
package com.expresiones;

public class Main {
    public static void main(String[] args) {
      
        int quarter = 2;

        String quarterLabel;
        

        switch (quarter) {
            case 0:
                quarterLabel = "Q1-WINTER";
                break;
            case 1:
                quarterLabel = "Q2-WINTER";
                break;
            case 2:
                quarterLabel = "Q3-WINTER";
                break;

            default:
                quarterLabel = "error";
        }
        System.out.println("El cuarto asociado al número ingresado es: " + quarterLabel);

    }
}

````

````
package com.expresiones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
        int mes=2;
        List<String> mesesFuturos = new ArrayList<>();

        switch (mes) {
            case 1:
                mesesFuturos.add("enero");
                break;

            case 2: 
            mesesFuturos.add("febrero");
            break;
            case 3:
            mesesFuturos.add("marzo");
            break;
        
            default:
                break;
        }
        ;
        for (String recorrer : mesesFuturos) {
            System.out.println("el mes actual es: "+recorrer);
            
        }
        
    }
}


````

## Elegir entre instrucciones switch e instrucciones if-then-else

La decisión de usar instrucciones o una instrucción se basa en la legibilidad y la expresión que la instrucción está probando. Una instrucción puede probar expresiones basadas en rangos de valores o condiciones, mientras que una instrucción prueba expresiones basadas solo en un único entero, valor enumerado u objeto.

Por ejemplo, el siguiente código podría escribirse con una instrucción. switch

````
package com.expresiones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
      int temperatura = 50;
        if (temperatura<0) {
            System.out.println("sistema");
            
        }else if (temperatura<100) {
            System.out.println("jder");
        }else{
            System.out.println("otro");
        }
    }
        
    }

````

````
package com.expresiones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
      int mes = 1;
      if(mes == 1){
        System.out.println("enero");

      }else if(mes == 2){
        System.out.println("febrero");
      }
        
    }
}

````

## Uso de string como tipo para las etiquetas de mayúsculas y minúsculas

En Java SE 7 y versiones posteriores, puede utilizar un objeto en la expresión de la sentencia. En el ejemplo de código siguiente se muestra el número del mes en función del valor del mes con nombre. 


## Bifurcación con expresiones switch

## Modificación de la sintaxis del modificador

En Java SE 14 se puede utilizar otra sintaxis más conveniente para la palabra clave: la expresión.switchswitch

Varias cosas han motivado esta nueva sintaxis.

El comportamiento predeterminado del flujo de control entre las etiquetas del conmutador es caer. Esta sintaxis es propensa a errores y conduce a errores en las aplicaciones.
El bloque se trata como un bloque. Esto puede ser un impedimento en el caso de que necesite definir una variable solo en un archivo .switchcase
La declaración es una declaración. En los ejemplos de las secciones anteriores, a una variable se le asigna un valor en cada archivo . Convertirlo en una expresión podría dar lugar a un código mejor y más legible.switchcase
La sintaxis tratada en la sección anterior, conocida como instrucción switch, sigue estando disponible en Java SE 14 y su semántica no ha cambiado. A partir de Java SE 14 está disponible una nueva sintaxis para el problema: la expresión switch.switch

Esta sintaxis modifica la sintaxis de la etiqueta del modificador. Supongamos que tiene la siguiente instrucción switch en la aplicación.

`````
int day = ...; // any day
int len =
    switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY                -> 7;
        case THURSDAY, SATURDAY     -> 8;
        case WEDNESDAY              -> 9;
    }
System.out.println("len = " + len);

`````
