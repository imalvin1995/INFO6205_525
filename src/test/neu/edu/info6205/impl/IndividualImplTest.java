package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;
import org.junit.jupiter.api.Test;

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

    }

    @Test
    void setFitness() {
    }

    @Test
    void getFitness() {
    }
}