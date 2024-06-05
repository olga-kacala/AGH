package agh.ics.oop;

import agh.ics.oop.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulationTest {

    @Test
    void runTest() {
        // Pozycje startowe zwierząt
        List<Vector2d> startingPos = List.of(
                new Vector2d(2, 2),
                new Vector2d(0, 4),
                new Vector2d(4, 0)
        );

        // Ruchy (każda kolumna to ruchy jednego zwierzęcia)
        String[] moves_0 = {};
        String[] moves_1 = {
                "f", "f", "r",
                "f", "b", "f",
                "l", "b", "b"
        };

        // Finalne pozycje dla moves_0
        List<Vector2d> finalPos_0 = List.of(
                new Vector2d(2, 2),
                new Vector2d(0, 4),
                new Vector2d(4, 0)
        );

        // Finalne pozycje dla moves_1
        List<Vector2d> finalPos_1 = List.of(
                new Vector2d(2, 4),
                new Vector2d(0, 2),
                new Vector2d(3, 0)
        );

        // Finalne orientacje dla moves_0
        List<MapDirection> finalOrient_0 = List.of(
                MapDirection.NORTH,
                MapDirection.NORTH,
                MapDirection.NORTH
        );

        // Finalne orientacje dla moves_1
        List<MapDirection> finalOrient_1 = List.of(
                MapDirection.WEST,
                MapDirection.NORTH,
                MapDirection.EAST
        );

        // Symulacja bez ruchów
        Simulation sim_0 = new Simulation(startingPos, OptionsParser.zamiana(moves_0));
        sim_0.run();

        // Testy pozycji i orientacji dla symulacji bez ruchów
        for (int i = 0; i < 3; i++) {
            assertEquals(finalPos_0.get(i), sim_0.getAnimalList().get(i).getPosition());
            assertEquals(finalOrient_0.get(i), sim_0.getAnimalList().get(i).getOrientation());
        }

        // Symulacja z ruchami
        Simulation sim_1 = new Simulation(startingPos, OptionsParser.zamiana(moves_1));
        sim_1.run();

        // Testy pozycji i orientacji dla symulacji z ruchami
        for (int i = 0; i < 3; i++) {
            assertEquals(finalPos_1.get(i), sim_1.getAnimalList().get(i).getPosition());
            assertEquals(finalOrient_1.get(i), sim_1.getAnimalList().get(i).getOrientation());
        }
    }
    @Test
    void animalDoesNotMoveOutOfBounds() {
        // Utwórz symulację z jednym zwierzęciem na skraju mapy
        List<Vector2d> startingPos = List.of(
                new Vector2d(4, 4) // Zwierzę na końcu mapy
        );
        String[] moves = {"f", "f", "f", "f"}; // Ruchy w kierunku granicy mapy

        Simulation simulation = new Simulation(startingPos, OptionsParser.zamiana(moves));
        simulation.run();

        // Sprawdź, czy zwierzę nie przekroczyło granic mapy
        assertEquals(new Vector2d(4, 4), simulation.getAnimalList().get(0).getPosition());
    }
}
