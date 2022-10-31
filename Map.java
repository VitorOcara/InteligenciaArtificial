import java.util.ArrayList;

public class Map {
    ArrayList<State> map;
    State destiny;

    public Map(ArrayList<State> map) {
        this.map = map;
    }

    public Map(ArrayList<State> map, State destiny) {
        this.map = map;
        this.destiny = destiny;
    }

    

    public ArrayList<State> getMap() {
        return this.map;
    }

    public void setMap(ArrayList<State> map) {
        this.map = map;
    }

    public State getDestiny() {
        return this.destiny;
    }

    public void setDestiny(State destiny) {
        this.destiny = destiny;
    }

}
