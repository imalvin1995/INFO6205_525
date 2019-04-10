package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;

public class IndividualImpl implements Individual {
    @Override
    public int[] getChromosome() {
        return new int[0];
    }

    @Override
    public int[] getChromosomeLength() {
        return new int[0];
    }

    @Override
    public void setGene(int offset, int gene) {

    }

    @Override
    public void getGene(int offset) {

    }

    @Override
    public void setFitness(double fitness) {

    }

    @Override
    public double getFitness() {
        return 0;
    }
}
