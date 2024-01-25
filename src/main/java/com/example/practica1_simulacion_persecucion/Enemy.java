package com.example.practica1_simulacion_persecucion;

import javafx.collections.ListChangeListener;

public class Enemy extends Coordinates implements ListChangeListener<Coordinates> {
    public Enemy(int x, int y) {
        super(x, y);
    }

    // Método que se llama cuando hay cambios en la lista de coordenadas del jugador
    @Override
    public void onChanged(Change<? extends Coordinates> change) {
        while (change.next()) {
            // Obtención de las coordenadas del jugador que se agregaron a la lista
            Coordinates playerCoordinates = change.getAddedSubList().get(0);

            // Movimiento del enemigo en base a la posición del jugador
            if (playerCoordinates.getX() > this.getX() && playerCoordinates.getY() > this.getY()) {
                this.xMovement(1);
                this.yMovement(1);

            } else if (playerCoordinates.getX() < this.getX() && playerCoordinates.getY() < this.getY()) {
                this.xMovement(-1);
                this.yMovement(-1);

            } else if (playerCoordinates.getX() > this.getX() && playerCoordinates.getY() < this.getY()) {
                this.xMovement(1);
                this.yMovement(-1);

            } else if (playerCoordinates.getX() < this.getX() && playerCoordinates.getY() > this.getY()) {
                this.xMovement(-1);
                this.yMovement(1);

            } else if (playerCoordinates.getX() == this.getX() && playerCoordinates.getY() > this.getY()) {
                if (playerCoordinates.getY() - this.getY() == 1) {
                    this.yMovement(1);
                } else {
                    this.yMovement(2);
                }

            } else if (playerCoordinates.getX() == this.getX() && playerCoordinates.getY() < this.getY()) {
                if (playerCoordinates.getY() - this.getY() == -1) {
                    this.yMovement(-1);
                } else {
                    this.yMovement(-2);
                }


            } else if (playerCoordinates.getX() > this.getX() && playerCoordinates.getY() == this.getY()) {
                if (playerCoordinates.getX() - this.getX() == 1) {
                    this.xMovement(1);
                } else {
                    this.xMovement(2);
                }

            } else if (playerCoordinates.getX() < this.getX() && playerCoordinates.getY() == this.getY()) {
                if (playerCoordinates.getX() - this.getX() == -1) {
                    this.xMovement(-1);
                } else {
                    this.xMovement(-2);
                }

            }

            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Enemy position: (" + this.getX() + "," + this.getY() + ")";
    }
}