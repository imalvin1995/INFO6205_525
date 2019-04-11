package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Maze;

import java.util.ArrayList;

public class MazeImpl implements Maze {

    private final int[][] maze;
    private int startPosition[] = {Integer.MIN_VALUE, Integer.MIN_VALUE};

    public MazeImpl(int maze[][]){
        this.maze = maze;
    }


    @Override
    public int[] getStartPosition() {
        if(this.startPosition[0] != Integer.MIN_VALUE && this.startPosition[1] != Integer.MIN_VALUE){
            return this.startPosition;
        }

        int startPosition[] = {0, 0};

        //loop over the rows
        for (int i = 0; i < this.maze.length; i++) {
            //loop over colums
            for (int j = 0; j < this.maze[i].length; j++) {
                // 2 is the type for start position
                if (this.maze[i][j] == 2) {
                    this.startPosition = new int[] {j, i};
                    return new int[] {j, i};
                }
            }
        }

        return startPosition;
    }

    @Override
    public int getPositionValue(int x, int y) {
        if (x < 0 || y < 0 || x >= this.maze.length || y >= this.maze[0].length) {
            return 1;
        }
        return this.maze[y][x];
    }

    @Override
    public boolean isWall(int x, int y) {
        return (this.getPositionValue(x, y) == 1);
    }

    @Override
    public int getMaxX() {
        return this.maze[0].length - 1;
    }

    @Override
    public int getMaxY() {
        return this.maze.length - 1;
    }

    @Override
    public int scoreRoute(ArrayList<int[]> route) {
        int score = 0;
        boolean visited[][] = new boolean[this.getMaxY() + 1][this.getMaxX() + 1];

        //loop over route and score each move
        for (Object eachStep : route) {
            int step[] = (int[]) eachStep;
            if ((this.maze[step[1]][step[0]] == 3 && visited[step[1]][step[0]] == false) || this.maze[step[1]][step[0]] == 4) {
                //increase score for correct move
                score++;

                //remove reward
                visited[step[1]][step[0]] = true;
            }
        }

        return score;
    }
}
