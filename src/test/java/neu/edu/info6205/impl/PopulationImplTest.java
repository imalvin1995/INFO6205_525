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
        Population p = new PopulationImpl(20);
        p.setIndividual(0,new IndividualImpl(123));
        p.setIndividual(1,new IndividualImpl(123));
        p.setIndividual(2,new IndividualImpl(123));
        p.setIndividual(3,new IndividualImpl(123));
        p.setIndividual(4,new IndividualImpl(123));
        p.setIndividual(5,new IndividualImpl(123));
        p.setIndividual(6,new IndividualImpl(123));
        p.setIndividual(7,new IndividualImpl(123));
        p.setIndividual(8,new IndividualImpl(123));
        p.setIndividual(9,new IndividualImpl(123));
        p.setIndividual(10,new IndividualImpl(123));
        p.setIndividual(11,new IndividualImpl(123));
        p.setIndividual(12,new IndividualImpl(123));
        p.setIndividual(13,new IndividualImpl(123));
        p.setIndividual(14,new IndividualImpl(123));
        p.setIndividual(15,new IndividualImpl(123));
        p.setIndividual(16,new IndividualImpl(123));
        p.setIndividual(17,new IndividualImpl(123));
        p.setIndividual(18,new IndividualImpl(123));
        p.setIndividual(19,new IndividualImpl(123));

        String s = Arrays.toString(p.getIndividuals());
        p.shuffle();
        String s1 = Arrays.toString(p.getIndividuals());
        assertNotEquals(s,s1);
    }
}