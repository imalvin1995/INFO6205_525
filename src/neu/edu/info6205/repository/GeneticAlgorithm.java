package neu.edu.info6205.repository;

public interface GeneticAlgorithm {

    Population initPopulation(int chromosomeLength);
    double calcFitness(Individual individual, Maze maze);
    void evalPopulation(Population population, Maze maze);
    boolean isTerminationConditionMet(int generationsCount, int maxGenerations);
    Individual selectParent(Population population);
    Population mutatePopulation(Population population);
    Population crossoverPopulation(Population population);

}
