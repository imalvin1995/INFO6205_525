package neu.edu.info6205.repository;

import java.util.ArrayList;

public interface Robot {

    void run();
    void makeNextAction();
    int getNextAction();
    int getSensorValue();
    int[] getPosition();
    ArrayList<int[]> getRoute();

}
