package neu.edu.info6205.controller;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import neu.edu.info6205.helper.MazeGen;
import neu.edu.info6205.repository.GeneticAlgorithm;
import neu.edu.info6205.repository.Maze;
import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.Population;
import neu.edu.info6205.impl.GeneticAlgorithmImpl;
import neu.edu.info6205.impl.IndividualImpl;

public class Controller {

    public static int maxGenerations = 1000;

    public static void demo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the Maze file name");
        String filename = s.next();
        if (filename.isEmpty())
            return;
        File file= new File("Maze/"+filename+".txt");
//        System.out.println(file+"");

         if (file.exists())
             System.out.println("Processing");
         else {
             System.out.println("Not Found");
             return;
         }
        // read maze
        Maze maze = MazeGen.readMaze(filename);


        // Create genetic algorithm
        GeneticAlgorithm ga = new GeneticAlgorithmImpl(200, 0.05, 0.90, 2, 10);
        Population population = ga.initPopulation(128);
        ga.evalPopulation(population, maze);
        // Keep track of current generation
        int generation = 1;
        // Start evolution loop
        while (ga.isTerminationConditionMet(generation, maxGenerations) == false) {
            // Print fittest individual from population
            Individual fittest = population.getFittest(0);
            System.out.println(
                    "G" + generation + " Best solution (" + fittest.getFitness() + "): " + fittest.toString());

            // Apply crossover
            population = ga.crossoverPopulation(population);

            // Apply mutation
            population = ga.mutatePopulation(population);

            // Evaluate population
            ga.evalPopulation(population, maze);

            // Increment the current generation
            generation++;
        }

        System.out.println("Stopped after " + maxGenerations + " generations.");
        Individual fittest = population.getFittest(0);
        System.out.println("Best solution (" + fittest.getFitness() + "): " + fittest.toString());

        /*
         * Create a ArrayList<int[]> to record the route of each individual
         * so that we can get the route from the fittest individual
         */
        List<int[]> r = fittest.getRoute();
        printFittestRoute(r, maze.getMaxX(), maze.getMaxY());

    }

    private static void printFittestRoute(List<int[]> r, int maxX, int maxY) {
        int[][] way = new int[maxX+1][maxY+1];
        for(int[] pair : r) {
            way[pair[0]][pair[1]] = 1;
//			System.out.println(pair[0] + " " + pair[1]);
        }

        System.out.println();
        System.out.println("Route of the fittest solution: ");
        for(int i = 0; i < way.length; i++) {
            for(int j = 0; j < way[i].length; j++) {
                System.out.print(way[j][i] + " ");
            }
            System.out.println();
        }
    }


}


