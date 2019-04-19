package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndividualImplTest {

    @Test
    void getChromosome() {
        int[] c ={1,2,3};
        Individual i = new IndividualImpl(c);
        assertEquals(c, i.getChromosome());
    }

    @Test
    void getChromosomeLength() {
        Individual i = new IndividualImpl(123);
        assertEquals(123, i.getChromosomeLength());
    }

    @Test
    void setGene() {
        Individual i = new IndividualImpl(123);
        i.setGene(50,1);
        assertEquals(1,i.getGene(50));
    }

    @Test
    void getGene() {
        Individual i = new IndividualImpl(123);
        i.setGene(100,1);
        int j =i.getGene(100);
        assertEquals(1,j);
    }

    @Test
    void setFitness() {
        Individual i = new IndividualImpl(123);
        i.setFitness(10.0);
        assertEquals(10.0,i.getFitness());
    }

    @Test
    void getFitness() {
        Individual i = new IndividualImpl(123);
        i.setFitness(100.0);
        double j = i.getFitness();
        assertEquals(100.0,j);
    }

    @Test
    void setRoute() {
        List<int[]> route = Arrays.asList(new int [] {1,2,3});
        Individual i = new IndividualImpl(123);
        i.setRoute(route);
        assertEquals(route, i.getRoute());
    }

    @Test
    void getRoute() {
        List<int[]> route = Arrays.asList(new int [] {1,2,3});
        Individual i = new IndividualImpl(123);
        i.setRoute(route);
        List<int[]> j = i.getRoute();
        assertEquals(route, j);
    }
}