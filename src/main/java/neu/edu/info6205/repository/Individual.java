package neu.edu.info6205.repository;

import java.util.List;

public interface Individual {

    int [] getChromosome();
    int getChromosomeLength();
    void setGene(int offset, int gene);
    int getGene(int offset);
    void setFitness(double fitness);
    double getFitness();
    void setRoute(List<int[]> route);
    List<int[]> getRoute();




}
