package com.example.practica1_simulacion_persecucion;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void xMovement(int x) {
        this.x += x;
    }
    public void yMovement(int y) {
        this.y += y;
    }
    // Método para calcular la distancia entre dos posiciones (coordenadas)
    public int getDistance(Coordinates position) {
        return Math.abs(position.x - x) + Math.abs(position.y-y);
    }

}