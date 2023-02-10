public class Main {
  public static void main(String[] args) {

    Pokemon pokemon1 = new Pokemon("Alex", 120);
    System.out.println(pokemon1.getName() + " is level " + pokemon1.getLevel());
    System.out.println();


  
    Pokemon pokemon2 = new Pokemon("Dhruva", 80);
    System.out.println(pokemon2.getName() + " is level " + pokemon2.getLevel());
    System.out.println();

   
    Trainer trainer = new Trainer("Ash", "Champion", 0);
    System.out.println("I am " + trainer.getName() + ", I specialize in " + trainer.getType() + " type pokemon, and I have " + trainer.getNumPokemon() + " pokemon!");
    System.out.println();

    //Catch Pokemon and update the list 
 
    trainer.catchPokemon(pokemon1);
  
    trainer.catchPokemon(pokemon2);
   
    System.out.println("Your pokemon include: " + trainer.getList());
  
    System.out.println("I am Ash and I now have " + trainer.getNumPokemon() + " pokemon!");
  
    
    //Calling the Attack method for each of the pokemon
    System.out.println("Pokemon Attacking and Fainting: ");
    String[] AlexMoves = {"Psychic", "Shadowball", "Flatter", "Thunderbolt"};
    Pokemon Alex = new Pokemon("Alex", 77, false, AlexMoves);

    String[] GalladeMoves = {"Close Combat", "Leaf Blade", "Psycho Cut", "Night Slash"};
    Pokemon Gallade = new Pokemon("Gallade", 72, false, GalladeMoves);

    //Having a pokemon faint
    System.out.println(Alex.attack("Alex", AlexMoves) + " It was super effective!");
    System.out.println(pokemon2.getName() + " has fainted!");
    trainer.faint(pokemon2);
    System.out.println();
    System.out.println("I now have " + trainer.getNumPokemon() + " pokemon!");
    System.out.println();
    
    //Calling the Run Away method for each of the pokemon
    System.out.println("Fleeing from Battle: ");
    Pokemon pokemon_flee_1 = new Pokemon("Alex", 77);
    System.out.println(Alex.run(pokemon_flee_1.getName()));

    Pokemon pokemon_flee_2 = new Pokemon("Gallade", 72);
    System.out.println(Gallade.run(pokemon_flee_2.getName()));
    System.out.println();
    
    //Pokemon Equals Comparisons
    System.out.println("Pokemon equals() comparisons:");
    Pokemon alex = new Pokemon("Alex", 77);
    Pokemon gallade = new Pokemon("Gallade", 72);
    if(Alex.equals(gallade)) {
        System.out.println("True, they are equal");
    } else {
        System.out.println("False, they are not equal");
    }
    
  }
}
