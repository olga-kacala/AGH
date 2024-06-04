package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;
import agh.ics.oop.OptionsParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionsParserTest {

    @Test
    void zamianaTest() {
        String[] input1 = new String[] { "f", "f" };
        MoveDirection[] output1_s = new MoveDirection[] { MoveDirection.FORWARD, MoveDirection.FORWARD };
        List<MoveDirection> output1 = Arrays.asList(output1_s);

        assertEquals(output1, OptionsParser.zamiana(input1));

        String[] input2 = new String[] { "b", "r", "l" };
        MoveDirection[] output2_s = new MoveDirection[] { MoveDirection.BACKWARD, MoveDirection.RIGHT, MoveDirection.LEFT };
        List<MoveDirection> output2 = Arrays.asList(output2_s);

        assertEquals(output2, OptionsParser.zamiana(input2));
    }
}