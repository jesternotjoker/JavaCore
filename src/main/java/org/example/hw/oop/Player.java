package org.example.hw.oop;

import java.util.Arrays;
import java.util.Objects;

public class Player {
    private String name;
    private int strength;
    private double speed;

    public Player(String name, int strength, double speed) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(name, player.name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                '}';
    }

    public void helloOtherPlayers(Player otherPlayer) {
        System.out.println("Hello, " + otherPlayer.getName());
    }

    public void playerInArray(Player[] players) {
        if (Arrays.asList(players).contains(this)) System.out.println(this.getName() + " in array");
        else System.out.println(this.getName() + " not in array");
    }
}
