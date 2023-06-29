package Toy_Shop_project;

import Toy_Shop_project.Toys.Toy;
import Toy_Shop_project.Toys.factory.CreateConstructorFactory;
import Toy_Shop_project.Toys.factory.CreateDollFactory;
import Toy_Shop_project.Toys.factory.CreateRobotFactory;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Shop shop = new Shop();

        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (random.nextDouble() * 100);
            if (randomNum <= 33) {
                shop.addToy(CreateConstructorFactory.createRandomConstructor());
            }else if(randomNum > 34 && randomNum <= 67) {
                shop.addToy(CreateDollFactory.createRandomDoll());
            } else {
                shop.addToy(CreateRobotFactory.createRandomRobot());
            }
        }

        for (Toy curToy: shop.getToys()) {
            System.out.println(curToy);
        }

    }
}