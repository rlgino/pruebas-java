### Tasks (Scheduled jobs)
En esta sección se van a hacer 3 tareas de diferentes formas:

* Timer y Runneable: Se abre un hilo y se corre en un bucle infinito con un **sleep** de n cantidad de tiempo
* TimerTask: Forma muy cómoda y fácil de hacer, usando ```java.util.TimerTask``` e inicializando con método ```scheduleAtFixedRate()```
* ScheduledExecutorService: Otra forma nativa de hacerlo con la clase ```java.util.concurrent.ScheduledExecutorService```

### Spring Scheduled tasks

En nuestro componente se define:

```
@Scheduled(fixedRate = 5000) //Ejecución cada 5 segundos
public void generarHistorial(){
    service.generarInformePrevio();
}
```

Y en la clase de nuestro main definimos:
```
@EnableScheduling
public class MainClass {
    public static void main(String[] args) {
    		SpringApplication.run(MainClass.class, args);
    }
}
```