package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.Vector2d;
import agh.ics.oop.model.MapDirection;
import agh.ics.oop.model.Animal;
import agh.ics.oop.Simulation;
import java.util.List;
import java.util.Arrays;

public class World {

    public static void main(String[] args) {
        System.out.println("system wystartował");

        List<MoveDirection> directions = OptionsParser.zamiana(args);
        List<Vector2d> positions = List.of(new Vector2d(2, 2), new Vector2d(3, 4), new Vector2d(4, 5));
        Simulation simulation = new Simulation(positions, directions);
        simulation.run();

        System.out.println("system zakończył działanie");

    }

    public static void run(MoveDirection[] tabs) {
        for (MoveDirection d : tabs) {
            switch (d) {
                case FORWARD:
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case BACKWARD:
                    System.out.println("Zwierzak idzie do tyłu");
                    break;
                case RIGHT:
                    System.out.println("Zwierzak idzie w prawo");
                    break;
                case LEFT:
                    System.out.println("Zwierzak idzie w lewo");
                    break;
            }
        }
    }
}