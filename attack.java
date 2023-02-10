import java.util.ArrayList;
import java.util.Random;

class Pokemon {

public String name;
public int level;
public boolean fainted; 
public String[] moves; 
public String attack; 

  public Pokemon(String name, int level, boolean fainted, String[] moves)
  {
    this.name = name; 
    this.level = level;
    this.fainted = fainted; 
    this.moves = moves; 
  }

    public Pokemon(String name, int level)
  {
    this.name = name;
    this.level = level; 
  }

//Attack Method 
    public String attack(String name, String[] moves)
  {
    Random rand = new Random();
    String randomElement = moves[rand.nextInt(moves.length)];

    return name + " used " + randomElement + "!";
  
  }


  //Run Method 
    public String run(String name)
  {
    return "Got away safely.";
  }

//Define a toString() method
  @Override
  public String toString() {
    return "Pokemon name: " + name + ", level: " + level + ", Fainted?: "+ fainted;}


//Equals Method 
  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Pokemon))
      return false;
    Pokemon pokemon = (Pokemon) o;
    return this.name == pokemon.name && this.level == pokemon.level && this.fainted == pokemon.fainted && this.moves == pokemon.moves;}
//Getter and setter methods 


  
 public String getName()
  {
   return name; 
  }

  public void setName(String name)
  {
    this.name = name; 
  }

  public int getLevel()
  {
    return level;
  }

  public void setLevel(int level)
  {
    this.level = level; 
  }

  public boolean getFainted()
  {
    return fainted; 
  }

  public void setFainted(boolean fainted)
  {
    this.fainted = fainted; 
  }

  public String[] getMoves()
  {
    return moves; 
  }

  public void setMoves(String[] moves)
  {
    this.moves = moves; 
  }

  public String getAttack()
  {
   return attack;  
  }

public void setAttack(String attack)
  {
    this.attack = attack; 
  }

  
  
}


