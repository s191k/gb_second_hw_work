package Toy_Shop_project;

import Toy_Shop_project.Toys.Toy;

import java.util.ArrayDeque;
import java.util.Queue;

public class Shop {

    private final Queue<Toy> toys;

    public Shop() {
        this.toys = new ArrayDeque<>();
    }

    public Shop(Queue<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToy() {
        return toys.poll();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Queue<Toy> getToys() {
        return toys;
    }
}
