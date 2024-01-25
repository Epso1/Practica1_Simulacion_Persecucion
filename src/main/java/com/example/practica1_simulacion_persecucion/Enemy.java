package com.example.practica1_simulacion_persecucion;
import javafx.collections.ListChangeListener;

public class Enemy extends Coordinates implements ListChangeListener<Coordinates> {
    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void onChanged(Change<? extends Coordinates> change) {
        while (change.next()) {
            Coordinates playerCoordinates = change.getAddedSubList().get(0);

           if(playerCoordinates.getX() > this.getX() && playerCoordinates.getY() > this.getY()){
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
               if(playerCoordinates.getY() - this.getY() == 1){
                   this.yMovement(1);
               } else {
                   this.yMovement(2);
               }

           } else if (playerCoordinates.getX() == this.getX() && playerCoordinates.getY() < this.getY()) {
               if(playerCoordinates.getY() - this.getY() == -1){
                   this.yMovement(-1);
               } else {
                   this.yMovement(-2);
               }


           } else if (playerCoordinates.getX() > this.getX() && playerCoordinates.getY() == this.getY()) {
               if(playerCoordinates.getX() - this.getX() == 1){
                   this.xMovement(1);
               } else {
                   this.xMovement(2);
               }

           } else if (playerCoordinates.getX() < this.getX() && playerCoordinates.getY() == this.getY()) {
               if(playerCoordinates.getX() - this.getX() == -1){
                   this.xMovement(-1);
               } else {
                   this.xMovement(-2);
               }

           }
            /*
            Coordinates player = change.getAddedSubList().get(0);
            int distance = this.getDistance(player);
            int movements = 0;
            while (movements < 4) {
                this.xMovement(1);
                if (this.getDistance(player) >= distance) {
                    this.xMovement(-1);
                } else {
                    movements++;
                }

                this.xMovement(-1);
                if (this.getDistance(player) >= distance) {
                    this.xMovement(1);
                } else {
                    movements++;
                }

                this.yMovement(1);
                if (this.getDistance(player) >= distance) {
                    this.yMovement(-1);
                } else {
                    movements++;
                }

                this.yMovement(-1);
                if (this.getDistance(player) >= distance) {
                    this.yMovement(1);
                } else {
                    movements++;
                }
            }*/
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Enemy position: (" + this.getX() + "," + this.getY() + ")";
    }
}