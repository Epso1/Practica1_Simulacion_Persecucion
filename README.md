# README.md

##Título del Proyecto: Simulación de Persecución
Este proyecto es una simple simulación de un jugador siendo perseguido por enemigos en una cuadrícula 2D. Tanto el jugador como los enemigos están representados por coordenadas en la cuadrícula. El jugador puede moverse en cuatro direcciones (arriba, abajo, izquierda, derecha), y los enemigos se mueven hacia la posición del jugador de 2 en 2 casillas.


## Instalación

Este proyecto está construido utilizando Java y Maven. Para instalar y ejecutar el proyecto, sigue los pasos a continuación:

1. Asegúrate de tener Java JDK y Maven instalados en tu sistema. Puedes descargarlos desde los siguientes enlaces:
    - [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
    - [Maven](https://maven.apache.org/download.cgi)

2. Clona el proyecto desde GitHub. Abre tu terminal y ejecuta el siguiente comando:
    ```
    git clone https://github.com/username/persecution_simulation.git
    ```
    Reemplaza `username` con tu nombre de usuario de GitHub.

3. Navega al directorio del proyecto:
    ```
    cd persecution_simulation
    ```

## Ejecución

Para ejecutar el proyecto, puedes hacerlo desde IntelliJ IDEA 2023.2.2 u otro Java IDE pulsando el botón "Run" o utilizando el siguiente comando en la terminal:

```
mvn exec:java -Dexec.mainClass="com.example.practica1_simulacion_persecucion.Game"
```

## Uso

Una vez que comienza el juego, se muestran las posiciones del jugador y los enemigos. El jugador puede moverse usando las teclas 'W' (arriba), 'A' (izquierda), 'S' (abajo) y 'D' (derecha). El juego continúa hasta que uno de los enemigos alcanza al jugador.

## Características

- El juego se juega en una cuadrícula 2D de tamaño 30x30.
- El jugador y los enemigos se colocan aleatoriamente en la cuadrícula al inicio del juego.
- El jugador puede moverse en cuatro direcciones: arriba, abajo, izquierda y derecha.
- Los enemigos se mueven hacia la posición del jugador.
- El juego termina cuando un enemigo alcanza la posición del jugador.


## Requisitos

- Java JDK 11 o superior
- Maven 3.6.0 o superior
- IntelliJ IDEA 2023.2.2 u otro Java IDE



