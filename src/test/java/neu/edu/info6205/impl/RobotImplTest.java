package neu.edu.info6205.impl;

import neu.edu.info6205.helper.MazeGen;
import neu.edu.info6205.repository.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotImplTest {
    private static final int[] move = new int[] {1,0,0,1,1,0,1,0,1,1,0,0,0,1};


    @Test
    void startPosition() {
        Robot r = new RobotImpl(move, MazeGen.readMaze("Maze2"),100);
        assertEquals(4, r.getPosition()[0]);
        assertEquals(0, r.getPosition()[1]);
    }

    @Test
    void heading() {
        Robot r = new RobotImpl(move, MazeGen.readMaze("Maze4"),100);
        assertEquals(47,r.getSensorValue());
    }
}