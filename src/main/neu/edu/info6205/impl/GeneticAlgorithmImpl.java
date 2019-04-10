package neu.edu.info6205.impl;

import neu.edu.info6205.repository.GeneticAlgorithm;
import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.Maze;
import neu.edu.info6205.repository.Population;

public class GeneticAlgorithmImpl implements GeneticAlgorithm {
    @Override
    public Population initPopulation(int chromosomeLength) {
        return null;
    }

    @Override
    public double calcFitness(Individual individual, Maze maze) {
        return 0;
    }

    @Override
    public void evalPopulation(Population population, Maze maze) {

    }

    @Override
    public boolean isTerminationConditionMet(int generationsCount, int maxGenerations) {
        return false;
    }

    @Override
    public Individual selectParent(Population population) {
        return null;
    }

    @Override
    public Population mutatePopulation(Population population) {
        return null;
    }

    @Override
    public Population crossoverPopulation(Population population) {
        return null;
    }
}
