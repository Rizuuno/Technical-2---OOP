package PokemonPart2;


public interface Battleable {
    // Constants
    int MAX_HP = 100;
    String BATTLE_TYPE = "Pokemon Battle";
    String STATUS_ACTIVE = "Active";
    
    // Methods
    void attack(String move);
    void defend();
}
