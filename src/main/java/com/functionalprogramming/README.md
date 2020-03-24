## Programación funcional de Java
Aunque es muy útil y mas lejible a la hora de implementarla, 
este tipo de programación es muy útil con los streams.
### Crear listas
En esta sección vamos a utilizar mucho la implementación 
de listas, para crear listas utilizaremos ```List.of(1,2,3)```
esta función nos va a crear una lista del tipo de elemento 
que nosotros definamos.

Como vamos a repasar mucho las funciones a utilizar en listas, 
vamos a aclarar que a la hora de utilizar **streams** solo se 
puede usar solo una vez una función, por lo cual no se podrá 
volver a utilizar.

### Funciones dispobibles para ```stream()```

Las interfaces que creo Java a la hora de implmentar
 la programación funcional son las siguientes:
* Function<T,R>
* Predicate<T,boolean>
* Unary Operator<T,T>
* Binary Operator<<T,T>,T>
* Suplier<void,T>
* Cosumer<T,void>

Cada uno de estas interfaces necesitan ser implementadas,
 lo cual se hace mayormente como funciones anonimas.
 
Además se puede utilizar para concatenar:

En caso de los predicates:
``` java
pre1.and(pre2)
pre1.or(pre2)
```
En cambio para los Functions:
``` java
op1.andThen(op2) // Se ejecuta op1 primero
op2.compose(op2) // Se ejecuta op2 primero
```

### Tipos de operaciones
#### Operadores not terminales (Forma un nuevo stream)
``` java
filter() <-- Predicate
map() <-- Function
flatMap() <-- Function (Pero devuelve multiples)
distinct() <-- Elije los diferentes elementos
limit() <-- Corta a los n elementos que quiera
peek() <-- Consumer, espera un estimulo para ejecutar algo que defino por parametro
```

#### Operadores terminales
``` java
anyMatch() // Predicate, devuelve si alguno cumple la condición
allMatch() // Idem, pero todos tienen que cumplir
noneMatch() // Idem pero si ninguno cumple

count() // Tamaño del stream
findAny()
findFirst() // Recibe predicado y Devuelve un optional
forEach() // Cierra un stream con un consumer
min() y max() // Reciben implementación de compareTo
reduce() // (value, accum)
```

#### Parallel Streams

#### Optional interfaces