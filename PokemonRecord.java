package PokemonPart2;

public abstract class PokemonRecord {
    // Public variables
    public String pokemonName;
    public int pokemonLevel;
    
    // Protected variables
    protected int pokemonId;
    protected int experiencePoints;
    
    // Constructor
    public PokemonRecord(String name, int level, int id, int experience) {
        this.pokemonName = name;
        this.pokemonLevel = level;
        this.pokemonId = id;
        this.experiencePoints = experience;
    }
 
   
    public void printBasicInfo() {
   
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Pokemon Name: " + pokemonName);
        System.out.println("Pokemon Lvl: " + pokemonLevel);
        System.out.println("-------------------------------");
    }
    
    public void printExperienceInfo() {
        System.out.println("-------------------------------");
        System.out.println("Pokemon ID: " + pokemonId);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("-------------------------------");
    }
    
    public abstract void train(int xp);
    public abstract void evolve();
    public abstract void faint();
}