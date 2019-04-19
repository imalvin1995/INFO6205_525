package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Maze;
import neu.edu.info6205.repository.Population;
import org.junit.jupiter.api.Test;
import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.GeneticAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

class GeneticAlgorithmImplTest {
    GeneticAlgorithm ga = new GeneticAlgorithmImpl(200, 0.05, 0.90, 2, 10);
    //Population population = ga.initPopulation(128);
    Population p = new PopulationImpl(128);
    //Individual i =p.setIndividual(1,new IndividualImpl(128));

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
    void initPopulation() {
        Individual i = new IndividualImpl(128);
        assertEquals(128, i.getChromosomeLength());
    }

    @Test
    void calcFitness() {
        Individual i = new IndividualImpl(128);
        Maze maze = genMaze();
        assertEquals(0, ga.calcFitness(i,maze));

    }


    @Test
    void isTerminationConditionMet() {

        assertEquals(false, ga.isTerminationConditionMet(100,1000));
    }

}