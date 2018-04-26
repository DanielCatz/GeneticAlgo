package utils;

public class Parameters {

	String fit;
	String genePool;
	int mutationChance;
	int turnOver;
	
	
	public Parameters(String fit, String genePool, int mutationChance, int turnOver){
		this.fit = fit;
		this.genePool = genePool;
		this.mutationChance = mutationChance;
		this.turnOver = turnOver;
	}
	
	
	public String getFit() {
		return fit;
	}
	
	
	public int getTurnOver() {
		return turnOver;
	}


	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}


	public void setFit(String fit) {
		this.fit = fit;
	}
	
	
	public String getGenePool() {
		return genePool;
	}
	
	
	public void setGenePool(String genePool) {
		this.genePool = genePool;
	}
	
	
	public int getMutationChance() {
		return mutationChance;
	}
	
	
	public void setMutationChance(int mutationChance) {
		this.mutationChance = mutationChance;
	}
}
