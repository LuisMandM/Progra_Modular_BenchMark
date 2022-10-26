Escribe un programa en el que pidamos al usuario un número, muestre los números primos entre 1 y ese número (incluido) y calcule cuanto tiempo tarda en realizar el proceso, expresado en centésimas de segundo.

## Sugerencias

Para medir el tiempo de forma aproximada, puedes calcular la diferencia entre dos instantes de tiempo usando:

```java
long inicio = System.currentTimeMillis();

// instrucciones que queremos "cronometrar"
    
long fin = System.currentTimeMillis();
```

## Restricciones

- Para hacer el trabajo, utilizará la función `esPrimo()` que tendremos que escribir.
- Controla las posibles excepciones para garantizar que el programa no se detiene hasta que el usuario escribe `FIN` como número.
