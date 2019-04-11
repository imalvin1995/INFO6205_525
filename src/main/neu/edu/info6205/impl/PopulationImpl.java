package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;
import neu.edu.info6205.repository.Population;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class PopulationImpl implements Population {

    private Individual population[];
    private double populationFitness = -1;

    public PopulationImpl(int populationSize){
        this.population=new Individual[populationSize];
    }

    public PopulationImpl(int populationSize, int chromosomeLength){
        this.population=new Individual[populationSize];

        for (int individualCount = 0; individualCount < populationSize; individualCount++){
            Individual i = new IndividualImpl(chromosomeLength);
            this.population[individualCount] = i;
        }
    }

    @Override
    public Individual[] getIndividuals() {
        return this.population;
    }

    @Override
    public Individual getFittest(int offset) {
        Arrays.sort(this.population, new Comparator<Individual>() {
            @Override
            public int compare(Individual i1, Individual i2) {
                if (i1.getFitness() > i2.getFitness()) {
                    return -1;
                } else if (i1.getFitness() < i2.getFitness()) {
                    return 1;
                }
                return 0;
            }
        });

        return this.population[offset];
    }

    @Override
    public void setPopulationFitness(double fitness) {
        this.populationFitness = fitness;

    }

    @Override
    public double getPopulationFitness() {
        return this.populationFitness;
    }

    @Override
    public int size() {
        return this.population.length;
    }

    @Override
    public Individual setIndividual(int offset, Individual individual) {
        return population[offset] = individual;
    }

    @Override
    public Individual getIndividual(int offset) {
        return population[offset];
    }

    @Override
    public void shuffle() {
        Random r = new Random();
        for (int i = population.length-1; i > 0; i--){
            int index = r.nextInt(i + 1);
            Individual a= population[index];
            population[index] = population[i];
            population[i] = a;
        }
    }
}
