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