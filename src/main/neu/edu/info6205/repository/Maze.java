package neu.edu.info6205.repository;

import java.util.ArrayList;

public interface Maze {

    int[] getStartPosition();
    int getPositionValue(int x, int y);
    boolean isWall(int x, int y);
    int getMaxX();
    int getMaxY();
    int scoreRoute(ArrayList<int[]> route);

}
