package driver;

import java.util.ArrayList;
import java.util.Comparator;

import populations.Individual;
import utils.Parameters;

public class Driver {

	public static void main(String[] args) {
		String genes = "qwertyuiopasdfghjklzxcvbnm ?!QWERTYUIOPASDFGHJKLZXCVBNM";
        String fit = "Am I love?";
        int mutationProb = 15;
        int turnOver=200;
        Parameters params = new Parameters(fit, genes, mutationProb, turnOver);
        //evolveToString(params);
    
        
	}
	
	public static void evolveToString(Parameters params){
		long generation=0;
		double fittest = -1;		
		ArrayList<Individual> population = Individual.initPopulation(400, params);
		Individual temp = new Individual();
		
		while(generation<5000 && fittest!= 1){
			
			generation++;
			for(Individual i: population){
				i.calculateFitness(params.getFit());
			}
			
			population.sort(Comparator.comparing(Individual::getFitness));
			
			for(int i = 0; i < params.getTurnOver(); i++){
				population.remove(0);				
			}
			
			population = Individual.crossover(population, params);
			temp = population.stream().max(Comparator.comparing(Individual::getFitness)).get();
			fittest = temp.getFitness();
			System.out.println("Fittest So far: "+ fittest +"  "+ temp.getChomosome());
		}
		fittest = temp.getFitness();
		System.out.println("Fittest Generation: "+ generation +"  "+ temp.getChomosome());
		
	}

}
