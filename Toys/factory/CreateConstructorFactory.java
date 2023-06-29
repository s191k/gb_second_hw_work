package Toy_Shop_project.Toys.factory;

import Toy_Shop_project.Toys.Constructor;

import java.util.Random;

public class CreateConstructorFactory {

    public static Constructor createRandomConstructor() {
        Random random = new Random();
        int id = random.nextInt(99999);
        return new Constructor(id, "constr_" + id);
    }

}
