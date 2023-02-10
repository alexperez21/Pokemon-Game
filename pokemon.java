import java.util.ArrayList;
class Trainer {
    String name;
    String type;
    ArrayList<Pokemon> list = new ArrayList<Pokemon>();
    int numPokemon;


    public Trainer(String name, String type, ArrayList<Pokemon> list, int numPokemon){
        this.name = name;
        this.type = type;
        this.list = list;
        this.numPokemon = numPokemon; } 
    public Trainer(String name, String type, int numPokemon){
        this.name = name;
        this.type = type;
        this.numPokemon = numPokemon;
 
    }
    public Trainer(String name)
  {
    this.name = name; 
  }

    public String toString(){
        String listString = "";
        for(int i = 0; i < list.size(); i++){
            listString += list.get(i).toString();
        }
        return "Hello, I am " + name + ", and I am a " + type + " trainer. My pokemon are " + listString + ". I have " + numPokemon + " pokemon.";
    }


public boolean equals(Trainer trainer){
      if(this.name == trainer.name && this.type == trainer.type && this.list.equals(trainer.list) && this.numPokemon == trainer.numPokemon){
          return true;
      } else{
          return false; }
  }
  
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }


    public ArrayList<Pokemon> getList(){
        return list;
    }

    public void setList(ArrayList<Pokemon> list){
        this.list = list;
    }

    public int getNumPokemon(){
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon){
        this.numPokemon = numPokemon;
    }

    public void catchPokemon(Pokemon pokemon){
        list.add(pokemon);
        numPokemon++;
    }

    public void faint(Pokemon pokemon){
        list.remove(list.indexOf(pokemon));
        numPokemon--;
    }
}
