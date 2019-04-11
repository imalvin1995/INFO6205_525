package neu.edu.info6205.impl;

import neu.edu.info6205.repository.Individual;

public class IndividualImpl implements Individual {

    private int[] chromosome;
    private double fitness = -1;

    public IndividualImpl(int[] chromosome){
        this.chromosome=chromosome;
    }

    public IndividualImpl(int chromosomeLength){
        this.chromosome= new int[chromosomeLength];

        for (int gene = 0; gene<chromosomeLength; gene++){
            if (0.5 < Math.random())
                this.setGene(gene,1);
            else
                this.setGene(gene,0);
        }
    }

    @Override
    public int[] getChromosome() {
        return this.chromosome;
    }

    @Override
    public int getChromosomeLength() {
        return this.chromosome.length;
    }

    @Override
    public void setGene(int offset, int gene) {
        this.chromosome[offset] = gene;
    }

    @Override
    public int getGene(int offset) {
        return this.chromosome[offset];
    }

    @Override
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    @Override
    public double getFitness() {
        return this.fitness;
    }
    public String toString() {
        String output = "";
        for (int gene = 0; gene < this.chromosome.length; gene++) {
            output += this.chromosome[gene];
        }
        return output;
    }

}
