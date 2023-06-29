package Toy_Shop_project.Toys.factory;

import Toy_Shop_project.Toys.Doll;

import java.util.Random;

public class CreateDollFactory {

    public static Doll createRandomDoll() {
        Random random = new Random();
        int id = random.nextInt(99999);
        return new Doll(id, "doll_" + id);
    }

}
