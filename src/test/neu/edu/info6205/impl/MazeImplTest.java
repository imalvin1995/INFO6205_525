package neu.edu.info6205.impl;

import org.junit.jupiter.api.Test;
import neu.edu.info6205.repository.Maze;
import neu.edu.info6205.impl.MazeImpl;

import static org.junit.jupiter.api.Assertions.*;

class MazeImplTest {

    private Maze genMaze() {
        Maze m = new MazeImpl(new int[][] {
                { 0, 0, 0, 0, 1, 0, 1, 3, 2 },
                { 1, 0, 1, 1, 1, 0, 1, 3, 1 },
                { 1, 0, 0, 1, 3, 3, 3, 3, 1 },
                { 3, 3, 3, 1, 3, 1, 1, 0, 1 },
                { 3, 1, 3, 3, 3, 1, 1, 0, 0 },
                { 3, 3, 1, 1, 1, 1, 0, 1, 1 },
                { 1, 3, 0, 1, 3, 3, 3, 3, 3 },
                { 0, 3, 1, 1, 3, 1, 0, 1, 3 },
                { 1, 3, 3, 3, 3, 1, 1, 1, 4 } });

        return m;
    }

    @Test
    void getStartPosition() {
        Maze maze = genMaze();
        assertEquals(8, maze.getStartPosition()[0]);
        assertEquals(0, maze.getStartPosition()[1]);
    }

    @Test
    void testWay() {
        Maze maze = genMaze();
        assertEquals(true, maze.isWall(0, 6));
        assertEquals(8, maze.getMaxX());
        assertEquals(8, maze.getMaxY());
    }

    @Test
    void getPositionValue() {
    }

    @Test
    void isWall() {
        Maze maze = genMaze();
        assertEquals(true, maze.isWall(0, 6));
        assertEquals(true, maze.isWall(0, 1));
        assertEquals(false, maze.isWall(0, 0));
        assertEquals(false, maze.isWall(1, 1));
    }

    @Test
    void getMaxX() {
        Maze maze = genMaze();
        assertEquals(8, maze.getMaxX());
    }

    @Test
    void getMaxY() {
        Maze maze = genMaze();
        assertEquals(8, maze.getMaxY());
    }

    @Test
    void scoreRoute() {
    }
}