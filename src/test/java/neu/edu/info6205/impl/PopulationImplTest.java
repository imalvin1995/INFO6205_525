package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.Population;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PopulationImplTest {

    @Test
    void getIndividuals() {
        Population p = new PopulationImpl(3);
        Individual i =p.setIndividual(0,new IndividualImpl(123));
        Individual j =p.setIndividual(1,new IndividualImpl(123));
        Individual k =p.setIndividual(2,new IndividualImpl(123));
        Individual[] individuals = {i,j,k};
        assertEquals(Arrays.toString(individuals),Arrays.toString(p.getIndividuals()));

    }

    @Test
    void getFittest() {
        Population p = new PopulationImpl(3);
        Individual i =p.setIndividual(0,new IndividualImpl(123));
        Individual j =p.setIndividual(1,new IndividualImpl(123));
        Individual k =p.setIndividual(2,new IndividualImpl(123));
        i.setFitness(100);
        j.setFitness(200);
        k.setFitness(300);
        assertEquals(i,p.getFittest(2));

    }

    @Test
    void setPopulationFitness() {
        Population p = new PopulationImpl(123);
        p.setPopulationFitness(10);
        assertEquals(10,p.getPopulationFitness());
    }

    @Test
    void getPopulationFitness() {
        Population p = new PopulationImpl(123);
        p.setPopulationFitness(10.0);
        double j = p.getPopulationFitness();
        assertEquals(10.0,j);
    }

    @Test
    void size() {
        Population p = new PopulationImpl(123);
        assertEquals(123, p.size());
    }

    @Test
    void setIndividual() {
        Population p = new PopulationImpl(123);
        Individual i =p.setIndividual(1,new IndividualImpl(123));
        assertEquals(i,p.getIndividual(1));
    }

    @Test
    void getIndividual() {
        Population p = new PopulationImpl(123);
        Individual i =p.setIndividual(1,new IndividualImpl(123));
        Individual j = p.getIndividual(1);
        assertEquals(i,j);
    }

    @Test
    void shuffle() {
    }
}