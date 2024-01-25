package com.example.practica1_simulacion_persecucion;

public class Player extends Coordinates {
    public Player(int x, int y) {
        super(x, y);
    }

    public String toString() {
        return "Player position: (" + this.getX() + "," + this.getY() + ")";
    }

}