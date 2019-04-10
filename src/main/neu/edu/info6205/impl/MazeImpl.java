package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Maze;

import java.util.ArrayList;

public class MazeImpl implements Maze {
    @Override
    public int[] getStartPosition() {
        return new int[0];
    }

    @Override
    public int getPositionValue(int x, int y) {
        return 0;
    }

    @Override
    public boolean isWall(int x, int y) {
        return false;
    }

    @Override
    public int getMaxX() {
        return 0;
    }

    @Override
    public int getMaxY() {
        return 0;
    }

    @Override
    public int scoreRoute(ArrayList<int[]> route) {
        return 0;
    }
}
