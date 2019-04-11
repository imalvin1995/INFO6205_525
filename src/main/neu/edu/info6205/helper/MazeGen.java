package neu.edu.info6205.helper;

import neu.edu.info6205.impl.MazeImpl;
import neu.edu.info6205.repository.Maze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MazeGen {

    public static Maze readMaze(String name){
        int [][] m = parse("Maze/"+name+".txt");
        Maze maze = new MazeImpl(m);
        return maze;
    }

    private static int [][] parse(String fileName){
        try(BufferedReader inLine = new BufferedReader(new FileReader(fileName))) {
            String inputLine = null;
            List<int[]> result = new ArrayList<>();
            while((inputLine = inLine.readLine()) != null) {
                String[] row = inputLine.split("\t");
                int[] arrayRow = new int[row.length];
                for(int i = 0; i < row.length; i++) {
                    arrayRow[i] = Integer.parseInt(row[i]);
                }
                result.add(arrayRow);
            }

            int[][] ii = new int[result.size()][];
            for(int j = 0; j < result.size(); j++) {
                ii[j] = result.get(j);
            }

            return ii;
        }catch (IOException e) {
            System.out.println("Not found!");
            e.printStackTrace();
        }
        return null;
    }
}
