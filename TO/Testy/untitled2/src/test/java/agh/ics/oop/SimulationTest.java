package agh.ics.oop;
import agh.ics.oop.model.*;
import agh.ics.oop.model.Animal;
import agh.ics.oop.model.MapDirection;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.Vector2d;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;



public class SimulationTest {
    @Test
    void runTest() {

        // Pozycje startowe zwierzakow
        List<Vector2d> startingPos = List.of(
                new Vector2d(2, 2),
                new Vector2d(0, 4),
                new Vector2d(4, 0)
        );

        // ruchy (kazda kolumna to ruchy jednego zwierzaka)
        String[] moves_0 = {};
        String[] moves_1 = {
                "f", "f", "r",
                "f", "b", "f",
                "l", "b", "b"
        };

        // finalne pozycje
        List<Vector2d> finalPos_0 = List.of(
                new Vector2d(2, 2),
                new Vector2d(0, 4),
                new Vector2d(4, 0)
        );
        List<Vector2d> finalPos_1 = List.of(
                new Vector2d(2, 4),
                new Vector2d(0, 2),
                new Vector2d(3, 0)
        );


        // finalne orientacje
        List<MapDirection> finalOrient_0 = List.of(
                MapDirection.NORTH,
                MapDirection.NORTH,
                MapDirection.NORTH
        );
        List<MapDirection> finalOrient_1 = List.of(
                MapDirection.WEST,
                MapDirection.NORTH,
                MapDirection.EAST
        );


        Simulation sim_0 = new Simulation(startingPos, OptionsParser.zamiana(moves_0));
        Simulation sim_1 = new Simulation(startingPos, OptionsParser.zamiana(moves_1));


        sim_0.run();
        sim_1.run();

        // testy pozycji
        for (int i = 0; i < 3; i++) {
            assertEquals(finalPos_0.get(i), sim_0.getAnimalList().get(i).getPosition());
            assertEquals(finalPos_1.get(i), sim_1.getAnimalList().get(i).getPosition());

        }

        // testy orientacji
        for (int i = 0; i < 3; i++) {
            assertEquals(finalOrient_0.get(i), sim_0.getAnimalList().get(i).getOrientation());
            assertEquals(finalOrient_1.get(i), sim_1.getAnimalList().get(i).getOrientation());

        }

    }
}