package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.Population;

public class PopulationImpl implements Population {
    @Override
    public Individual[] getIndividuals() {
        return new Individual[0];
    }

    @Override
    public Individual getFittest(int offset) {
        return null;
    }

    @Override
    public void setPopulationFitness(double fitness) {

    }

    @Override
    public double getPopulationFitness() {
        return 0;
    }

    @Override
    public Individual setIndividual(int offset, Individual individual) {
        return null;
    }

    @Override
    public Individual getIndividual(int offset) {
        return null;
    }
}
