package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;

import java.util.LinkedList;
import java.util.List;

public class OptionsParser {
    public static List<MoveDirection> zamiana(String[] tab) {

        List<MoveDirection> move_direction_array = new LinkedList<>();
        int i = 0;
        while (i < tab.length) {
            switch (tab[i]) {
                case "f":
                    move_direction_array.add(MoveDirection.FORWARD);
                    break;
                case "b":
                    move_direction_array.add(MoveDirection.BACKWARD);
                    break;
                case "r":
                    move_direction_array.add(MoveDirection.RIGHT);
                    break;
                case "l":
                    move_direction_array.add(MoveDirection.LEFT);
                    break;
            }
            i++;
        }
        return move_direction_array;
    }
}
