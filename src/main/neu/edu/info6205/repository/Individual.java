package neu.edu.info6205.repository;

public interface Individual {

    int [] getChromosome();
    int [] getChromosomeLength();
    void setGene(int offset, int gene);
    void getGene(int offset);
    void setFitness(double fitness);
    double getFitness();




}
