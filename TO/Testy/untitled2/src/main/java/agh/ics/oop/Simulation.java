package agh.ics.oop;
import agh.ics.oop.model.Animal;
import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.model.Vector2d;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private List<MoveDirection> directions;
    private List<Animal> animals;
    public Simulation(List<Vector2d> positions, List<MoveDirection> directions) {
        List<Animal> animals = new ArrayList<Animal>();
        for (int i = 0; i < positions.size(); i++){
            animals.add(new Animal(positions.get(i)));
        }
        this.animals = animals;
        this.directions = directions;
    }

    public List<Animal> getAnimalList() {
        return animals;
    }

    public void run(){
            for (int i = 0; i < directions.size(); i++){
                animals.get(i % animals.size()).move(directions.get(i));
                System.out.println("Zwierzę " + i % animals.size() + ": " + animals.get(i % animals.size()).getPosition().toString());
            }
    }
}