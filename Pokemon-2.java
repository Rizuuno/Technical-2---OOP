package PokemonPart2;

import java.util.Scanner;
 
public class Pokemon extends PokemonRecord implements Battleable, Categorizable {
    // Variables with different access modifiers
    public String publicPokemonType;
    private String privateTrainerName;
    protected int protectedHealthPoints;
    String defaultBattleStatus;
    
    // Constructor 1 (overloaded)
    public Pokemon(String name, int level, int id, int experience) {
        super(name, level, id, experience);
        this.publicPokemonType = TYPE_ELECTRIC;
        this.privateTrainerName = "Vince";
        this.protectedHealthPoints = MAX_HP;
        this.defaultBattleStatus = STATUS_ACTIVE;
    }
    
    // Constructor 2 (overloaded)
    public Pokemon(String name, int level, int id, int experience, String type, String trainer) {
        super(name, level, id, experience);
        this.publicPokemonType = type;
        this.privateTrainerName = trainer;
        this.protectedHealthPoints = MAX_HP;
        this.defaultBattleStatus = STATUS_ACTIVE;
    }
   
    
     // Methods from Categorizable interface
    
    public void categorize() {
        System.out.println(pokemonName + " is categorized as a " + publicPokemonType + " type.");
    }
    
    
    // Methods from Battleable interface
 
    
    public void attack(String move) {
        System.out.println(pokemonName + " used " + move + "!");
    }
    
 
    public void defend() {
        System.out.println(pokemonName + " is defending!");
    }
    
    public void displayType() {
        System.out.println("Pokemon Type: " + publicPokemonType);
    }
    
    // Methods from PokemonRecord
   
    public void train(int xp) {
        experiencePoints += xp;
        System.out.println(pokemonName + " gained " + xp + " XP!");
    }
 
   
    public void evolve() {
        System.out.println(pokemonName + " is evolving!");
    }
 
  
    public void faint() {
        System.out.println(pokemonName + " fainted!");
    }
    
    // Display all data in a menu
    public void displayMenu() {
Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Basic Info");
            System.out.println("2. Display Experience Info");
            System.out.println("3. Display All Pokemon Details");
            System.out.println("4. Perform Pokemon Actions");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printBasicInfo();
                    break;
                case 2:
                    printExperienceInfo();
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("Trainer: " + privateTrainerName);
                    System.out.println("");
                    System.out.println("Pokemon: " + pokemonName);
                    System.out.println("Type: " + publicPokemonType);
                    System.out.println("HP: " + protectedHealthPoints);
                    System.out.println("Battle Status: " + defaultBattleStatus);
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    performActions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
    // Perform all methods in a menu
    public void performActions() {
        System.out.println("-----------------------------------------");
        attack("Thunder");
        defend();
        categorize();
        displayType();
        train(50);
        evolve();
        faint();
        System.out.println("-----------------------------------------");
    }
    
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 25, 25, 500);
        pikachu.displayMenu();
    }
}