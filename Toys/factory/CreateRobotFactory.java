package Toy_Shop_project.Toys.factory;

import Toy_Shop_project.Toys.Robot;

import java.util.Random;

public class CreateRobotFactory {

    public static Robot createRandomRobot() {
        Random random = new Random();
        int id = random.nextInt(99999);
        return new Robot(id, "robot_" + id);
    }

}
