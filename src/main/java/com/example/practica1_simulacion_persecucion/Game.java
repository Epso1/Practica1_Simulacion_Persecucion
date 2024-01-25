package com.example.practica1_simulacion_persecucion;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    // Método para crear un enemigo asegurándose de que esté lo suficientemente lejos del jugador
    private static Enemy createEnemy(Player player, ObservableList<Coordinates> playerMoves) {
        Enemy enemy;
        do {
            enemy = new Enemy(new Random().nextInt(30), new Random().nextInt(30));
        } while (player.getDistance(enemy) < 5);
        playerMoves.addListener(enemy);
        return enemy;
    }

    public static void main(String[] args) {
        // Inicialización del scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Creación del jugador en una posición aleatoria
        Player player;
        player = new Player(new Random().nextInt(30), new Random().nextInt(30));
        // Creación de una lista observable para almacenar los movimientos del jugador
        ObservableList<Coordinates> playerMoves = FXCollections.observableArrayList();

        // Creación de tres enemigos en posiciones aleatorias
        Enemy enemy1, enemy2, enemy3;
        enemy1 = createEnemy(player, playerMoves);
        enemy2 = createEnemy(player, playerMoves);
        enemy3 = createEnemy(player, playerMoves);

        // Imprimir las posiciones iniciales del jugador y los enemigos
        System.out.println("Player position: (" + player.getX() + "," + player.getY() + ")");
        System.out.println("Enemy position: (" + enemy1.getX() + "," + enemy1.getY() + ")");
        System.out.println("Enemy position: (" + enemy2.getX() + "," + enemy2.getY() + ")");
        System.out.println("Enemy position: (" + enemy3.getX() + "," + enemy3.getY() + ")");

        // Bucle principal del juego mientras el jugador no haya sido alcanzado por todos los enemigos
        while (player.getDistance(enemy1) != 0 && player.getDistance(enemy2) != 0 && player.getDistance(enemy3) != 0) {
            System.out.println("\nMove using A W S D");
            // Obtener la dirección de movimiento desde la entrada del usuario
            char movement = Character.toUpperCase(sc.next().charAt(0));
            // Lógica para mover al jugador y verificar límites del tablero
            switch (movement) {
                case 'W' -> {
                    if(player.getY() == 0){
                        System.out.println("You can't move up");
                    }
                    else {
                        player.yMovement(-1);
                        System.out.println(player);
                        playerMoves.add(player);
                    }
                }
                case 'D' -> {
                    if(player.getX() == 30){
                        System.out.println("You can't move right");
                    }
                    else {
                        player.xMovement(1);
                        System.out.println(player);
                        playerMoves.add(player);
                    }
                }
                case 'S' -> {
                    if(player.getY() == 30){
                        System.out.println("You can't move down");
                    }
                    else {
                        player.yMovement(1);
                        System.out.println(player);
                        playerMoves.add(player);
                    }

                }
                case 'A' -> {
                    if(player.getX() == 0){
                        System.out.println("You can't move left");
                    }
                    else {
                        player.xMovement(-1);
                        System.out.println(player);
                        playerMoves.add(player);
                    }
                }
            }
            System.out.println();
        }
        // Mensaje de fin del juego y número de pasos antes de ser atrapado
        System.out.println("Game over!");
        System.out.println("Player steps before being caught: " + playerMoves.size());
    }
}
